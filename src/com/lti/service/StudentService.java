package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.StudentDao;
import com.lti.entity.Student;

@Service
public class StudentService {

	@Autowired
	private StudentDao studentDao;
	
	public void registration(Student student) {
		studentDao.save(student);
		//System.out.println(customer);
		//sending email code here
	}
	
	public Student get(String email, String password) {
		try {
		return studentDao.fetch(email, password);
		}
		catch(Exception e)
		{
			return null;
		}
	}
	
}
