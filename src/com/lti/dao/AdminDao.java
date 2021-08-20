package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;

import com.lti.entity.Admin;
import com.lti.entity.Student;

@Repository
public class AdminDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public Admin fetch(String email, String password) throws NoResultException
	{
		String ql = "select a from Admin a where a.email = :em and a.password= :pwd";
		Query q = entityManager.createQuery(ql);
		q.setParameter("em", email);
		q.setParameter("pwd", password);
		//System.out.println(email);
			return (Admin) q.getSingleResult();
		
	}
}
