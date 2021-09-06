package com.hsbc.jdbc;

import com.hsbc.jdbc.dao.EmpDao;
import com.hsbc.jdbc.dao.EmployeeDao;
import com.hsbc.jdbc.entity.Emp;
import com.hsbc.jdbc.exceptions.EmpExistsException;
import com.hsbc.jdbc.exceptions.EmpNotFoundException;

public class AppMainDelete {

	public static void main(String[] args) {
		EmpDao dao= new EmployeeDao();
		
		try {
			String resp=dao.delete(110);
			System.out.println(resp);
		} catch (EmpNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
