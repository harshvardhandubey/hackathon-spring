package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.*;
import com.lti.entity.Student;

@Service
public class ChangePasswordService {

	@Autowired
	private ChangePasswordDao changePasswordDao;
	
	public void changepassword(String email, String city, String password, String dob)
	{
		changePasswordDao.changepassword(email,city,password, dob);
	}
	
	
}
