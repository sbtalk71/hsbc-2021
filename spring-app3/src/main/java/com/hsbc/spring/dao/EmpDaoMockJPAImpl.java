package com.hsbc.spring.dao;

import org.springframework.stereotype.Repository;

import com.hsbc.spring.entity.Emp;

@Repository
public class EmpDaoMockJPAImpl implements EmpDao {

	public String save(Emp e) {
		System.out.println("JPA:Emp saved with id "+e.getEmpId());
		return "saved";
	}

}
