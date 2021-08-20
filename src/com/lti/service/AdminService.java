package com.lti.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lti.dao.AdminDao;
import com.lti.entity.Admin;


@Service
public class AdminService {

	@Resource
	private AdminDao adminDao;
	
	public Admin get(String email, String password) {
		try {
		return adminDao.fetch(email, password);
	}
		catch(Exception e)
		{
			return null;
		}

}}
