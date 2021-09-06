package com.hsbc.jdbc;

import com.hsbc.jdbc.dao.EmployeeDao;
import com.hsbc.jdbc.entity.Emp;
import com.hsbc.jdbc.exceptions.EmpNotFoundException;

public class AppMain {

	public static void main(String[] args) {
		EmployeeDao dao= new EmployeeDao();
		
		try {
			Emp e=dao.findById(1050);
			System.out.println(e);
		} catch (EmpNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
