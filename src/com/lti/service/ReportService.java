package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.ReportDao;
import com.lti.entity.Report;

@Service
public class ReportService {

	@Autowired
	private ReportDao reportDao;
	
	public void report(Report report) {
		reportDao.save(report);
		}

	public Report get(String username,String examtype) {
		return reportDao.fetch(username,examtype);
	}
	
	public Report view(String name, String examtype)
	{
		return reportDao.view(name, examtype);
	}
}
