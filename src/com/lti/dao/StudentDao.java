package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Student;

@Repository
public class StudentDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void save(Student student) {
		//entityManager.persist(customer);
		//int studId= getNextId();
		//student.setId(studId);
		entityManager.merge(student);
		//entityManager.persist(student);
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public Student fetch(String email, String password) throws Exception {
		String ql = "select s from Student s where s.email = :em and s.password= :pwd";
		Query q = entityManager.createQuery(ql);
		try {
		q.setParameter("em", email);
		q.setParameter("pwd", password);
		return (Student) q.getSingleResult();
		}
		catch(Exception e)
		{
			return null;
		}
		
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public List<Student> fetchAll() {
		String ql = "select s from Students s";
		Query q = entityManager.createQuery(ql);
		return q.getResultList();
	}
	
	/*public int getNextId() {
		Query qry= entityManager.createQuery("select max(id) from Student");
		int id= (Integer) qry.getSingleResult();
		return id+1;
	}*/
}
