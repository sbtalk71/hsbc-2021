package com.hsbc.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.hsbc.spring.dao.EmpDao;
import com.hsbc.spring.entity.Emp;

@Service
public class EmpService {

	
	private EmpDao dao;
	
	@Autowired
	@Qualifier("empDaoMockJPAImpl")
	public void setDao(EmpDao dao) {
		this.dao = dao;
	}

	public String saveEmp(Emp e) {
		String resp=dao.save(e);
		return resp;
		
	}
}
