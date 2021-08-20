package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Question;

@Repository
public class QuestionDao{
	int count=0;
	int no=0,marks;
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void save(Question questions) {
		// TODO Auto-generated method stub
		entityManager.merge(questions);
		
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public List<Question> fetch(String examtype) {
		String ql= "select j from Question j where j.examtype= :examtype ";
		Query q = entityManager.createQuery(ql);
		q.setParameter("examtype", examtype);
	return q.getResultList();
	}

@Transactional(propagation=Propagation.REQUIRED)
	public int calc(String examtype,String opt,int id) {
		no++;
		String ql="select j.correctans from Question j where j.examtype=:examtype and j.id= :id"; 
		Query q = entityManager.createQuery(ql);
		q.setParameter("examtype", examtype);
		q.setParameter("id", id);
		String answerDao=(String)q.getSingleResult();
		System.out.println("yeh answerdao hai"+answerDao);
		System.out.println("yeh opt hai"+opt);
		
		if(opt.equals(answerDao))
		{
			count++;
			System.out.println("inside outer if "+count);
		}
		if(no==10) {
			
			System.out.println("inside inner if "+count);
			return count;
		
		}
		else {
		return 0;
	}
	}
}


