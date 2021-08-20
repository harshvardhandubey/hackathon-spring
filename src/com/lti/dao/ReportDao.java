package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Question;
import com.lti.entity.Report;

@Repository
public class ReportDao {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void save(Report report) {
		entityManager.merge(report);
		
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public Report fetch(String username,String examtype) {
		String ql= "select j from Report j where j.name= :name and j.examtype= :examtype order by id desc";
		Query q = entityManager.createQuery(ql);
		q.setParameter("name", username);
		q.setParameter("examtype", examtype);
	List<Report> rep= q.getResultList();	
	return rep.get(0);
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public Report view(String name,String examtype) {
		String ql= "select v from Report v where v.name= :name and v.examtype= :examtype order by id desc";
		Query q = entityManager.createQuery(ql);
		q.setParameter("name", name);
		q.setParameter("examtype", examtype);
	List<Report> rep= q.getResultList();	
	return rep.get(0);
	}
}
