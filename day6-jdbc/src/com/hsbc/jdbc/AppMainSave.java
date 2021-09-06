package com.hsbc.jdbc;

import com.hsbc.jdbc.dao.EmpDao;
import com.hsbc.jdbc.dao.EmployeeDao;
import com.hsbc.jdbc.entity.Emp;
import com.hsbc.jdbc.exceptions.EmpExistsException;
import com.hsbc.jdbc.exceptions.EmpNotFoundException;

public class AppMainSave {

	public static void main(String[] args) {
		EmpDao dao= new EmployeeDao();
		
		try {
			String resp=dao.save(new Emp(101, "Mohit", "Bangalore", "2019-10-21", 45000));
			System.out.println("resposne "+resp);
		} catch (EmpExistsException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
