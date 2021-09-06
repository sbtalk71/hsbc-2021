package com.hsbc.jdbc;

import com.hsbc.jdbc.dao.EmpDao;
import com.hsbc.jdbc.dao.EmployeeDao;
import com.hsbc.jdbc.entity.Emp;
import com.hsbc.jdbc.exceptions.EmpNotFoundException;

public class AppMain {

	public static void main(String[] args) {
		EmpDao dao= new EmployeeDao();
		
		try {
			Emp e=dao.findById(105);
			System.out.println(e);
		} catch (EmpNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
