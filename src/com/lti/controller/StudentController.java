package com.lti.controller;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.dao.ChangePasswordDao;
import com.lti.entity.Admin;
import com.lti.entity.Question;
import com.lti.entity.Report;
import com.lti.entity.Student;
import com.lti.service.AdminService;
import com.lti.service.ChangePasswordService;
import com.lti.service.QuestionService;
import com.lti.service.ReportService;
import com.lti.service.StudentService;
import com.mail.Sendmail;

@Controller
public class StudentController {

	@Resource
	private StudentService studentService;
	@Resource
	private ChangePasswordService changePasswordService;
	@Resource
	private AdminService adminService;
	@Resource
	private QuestionService questionService;
	@Resource
	private ReportService reportService;
	
	static int qnno=0,qnid,answer,id=1;
	static String name,exam;
	
	Report rep=new Report();
	Report studreport=new Report();

	List<Question> questions;
	
	@RequestMapping(path = "/registration.lti")
	public String registration(Student student) {
		studentService.registration(student);
		return "confirmation.jsp";
	}
	
	@RequestMapping(path = "/sendmail.lti")
	public String mail(@RequestParam("email") String email, HttpServletRequest request, Model model) 
	{
		request.getSession().setAttribute("email", email);
		model.addAttribute("email");
		Sendmail sendmail = new Sendmail();
		sendmail.sendmail(email);
		//System.out.println(student);
		return "reset.jsp";
	}
	
	
	@RequestMapping(path = "/changepwd.lti")
	public String change(@RequestParam("email") String email, @RequestParam("city") String city, @RequestParam("password") String password, @RequestParam("dob") String dob) 
	{
		changePasswordService.changepassword(email,city,password, dob);
		return "success.jsp";
	}
	
	
	@RequestMapping(path = "/admin.lti")
	//public String register(HttpServletRequest request) {
	//public String register(@RequestParam("name") String name, @RequestParam("email") String email, ...) {
	public String adminlogin(@RequestParam("email") String email, @RequestParam("password") String password, Map model, ModelMap invalid) {
		Admin admin = adminService.get(email, password);
		if(admin == null)
		{
			invalid.addAttribute("invalid","Invalid credentials. Please try again.");
			return "adminlogin.jsp";
		}
		
		model.put("admin", admin);
		//System.out.println(student);
		return "admin.jsp";
	}
	
	@RequestMapping(path = "/login.lti")
	public String registration1(@RequestParam("email") String email, @RequestParam("password") String password,  Map model, ModelMap invalid, ModelMap uname, HttpServletRequest request, HttpSession session) {
		Student student = studentService.get(email,password);
		if(student == null)
		{
			invalid.addAttribute("invalid","Invalid credentials. Please try again.");
			return "login.jsp";
		}
		model.put("student", student);
		 name=student.getName();
		 uname.addAttribute("name",name);
		 session= request.getSession();
		return "userdash.jsp";
	}
	
	
	@RequestMapping(path = "/searching.lti")
	public String registration(@RequestParam("email") String email, @RequestParam("password") String password, Map model,ModelMap invalid, ModelMap uname) {
		Student student = studentService.get(email, password);
		if(student == null)
		{
			invalid.addAttribute("invalid","Invalid credentials. Please try again.");
			return "login.jsp";
		}
		model.put("student", student);
		name=student.getName();
		uname.addAttribute("name",name);
		//System.out.println(student);
		return "profile.jsp";
	}
	
	@RequestMapping(path="/exam.lti")
	  public String questnNo(@RequestParam("butn") String butn, Map model,ModelMap uname) {
		  exam=butn;
		  System.out.println(qnno);
		  questions= questionService.get(butn);
		    Question question=questions.get(qnno);
		    qnid=question.getId();
		    model.put("qn",question);
		    uname.addAttribute("name",name);
		    /*model.put("obj", obj);*/
		    return "test.jsp";
	  	}
	  
	  @RequestMapping(path="/test.lti")
	  public String questNo(@RequestParam("opt") String opt, Map model,ModelMap ans) {
/*			  if(opt.equals(null))
		  {
			  opt="0";
		  }*/
		    answer=(Integer)questionService.calc(exam,opt,qnid);
		    String count=""+answer;
		    System.out.println("count"+count);
		    String examtype=exam;
		    System.out.println(examtype);
		    String uname=name;
		    System.out.println(uname);
		    qnno++;
			System.out.println(qnno);
		  	Question question=questions.get(qnno);
		    qnid=question.getId();
		    model.put("qn",question);
		    ans.addAttribute("count",count);
		    ans.addAttribute("name",uname);
		    ans.addAttribute("exam",examtype);
		    
		    if(qnno<10)
		    return "test.jsp";
		    else {
		    
		    	rep.setId(id++);
		    	rep.setScore(count);
		    	rep.setExamtype(examtype);
		    	rep.setName(uname);
			    reportService.report(rep);
		      	if(answer>6)
		      	{	ans.addAttribute("result","Pass");
		    	return "score.jsp";}
		   	   	else
		   	 {	ans.addAttribute("result","Fail");
	    	     return "score.jsp";
		    }
  }
	  }
	  
	  
	  @RequestMapping(path="/proceed.lti")
	  public String Result(@RequestParam("butn") String butn, ModelMap ans) {
		 ans.addAttribute("name",name);
	  if(answer>6){
    	ans.addAttribute("display","Congratulations!! You may now proceed to give other tests.");
  	return "report.jsp";}
	  	
	  	else {
	    ans.addAttribute("display","Sorry! Try again later.");
	  	return "report.jsp";}
}

	  
	  @RequestMapping(path="/report.lti")
	  public String report(@RequestParam("examreport") String examreport,Map model,ModelMap uname) {
		  
		  String username=name;
		  studreport= reportService.get(username,examreport);
		  
		  String studname=studreport.getName();
		  String studtype=studreport.getExamtype();
		  String studresult=studreport.getScore();
		  uname.addAttribute("studname", studname);
		  uname.addAttribute("studtype", studtype);
		  uname.addAttribute("studresult", studresult);
	    /*model.put("obj", obj);*/
		    return "reportdisplay.jsp";
	  	}
	 
	  
	  
	  @RequestMapping(path="/view.lti")
	  public String report(@RequestParam("name") String name, @RequestParam("examtype") String examtype,Map model,ModelMap uname, ModelMap invalid) {
		  
		  studreport= reportService.view(name,examtype);
		  if(studreport == null)
			{
				invalid.addAttribute("invalid","Invalid credentials. Please try again.");
				return "view.jsp";
			}
		  String studname=studreport.getName();
		  String studtype=studreport.getExamtype();
		  String studresult=studreport.getScore();
		  uname.addAttribute("studname", studname);
		  uname.addAttribute("studtype", studtype);
		  uname.addAttribute("studresult", studresult);
	    /*model.put("obj", obj);*/
		    return "reportdisplay.jsp";
	  	}
	  
	  @RequestMapping(value="/logout.lti")
	  public String logout(HttpSession session) {
		  session.invalidate();
		  return "index.jsp";
	  }		  
}
