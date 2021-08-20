package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.QuestionDao;
import com.lti.entity.Question;

@Service
public class QuestionService {

	@Autowired
	private QuestionDao questionDao;
	
	public void questnNo(Question questions) {
		questionDao.save(questions);
		}
	
	public List<Question> get(String examtype) {
		return questionDao.fetch(examtype);
	}

	public int calc(String examtype,String opt,int id) {
		return questionDao.calc(examtype, opt,id);
	}

}

