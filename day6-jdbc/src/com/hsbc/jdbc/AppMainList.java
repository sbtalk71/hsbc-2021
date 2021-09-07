package com.hsbc.jdbc;

import com.hsbc.jdbc.dao.EmpDao;
import com.hsbc.jdbc.dao.EmployeeDao;
import com.hsbc.jdbc.entity.Emp;
import com.hsbc.jdbc.exceptions.EmpNotFoundException;

public class AppMainList {

	public static void main(String[] args) {
		EmpDao dao= new EmployeeDao();
		
		for(Emp emp:dao.listAll()) {
			System.out.println(emp);
		}
		
		System.out.println(dao.listAll());

	}

}
