package com.hsbc.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hsbc.spring.JdbcConfig;
import com.hsbc.spring.dao.EmpDao;
import com.hsbc.spring.dao.exceptions.EmpNotFoundException;
import com.hsbc.spring.dao.impl.EmpDaoImpl;

public class DaoMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcConfig.class);
		EmpDao dao = ctx.getBean(EmpDaoImpl.class);
		try {
			// System.out.println(dao.findById(201));
			System.out.println(dao.delete(201));
		} catch (EmpNotFoundException ex) {
			System.out.println("Emp not found ...");
		}

		// dao.listAll().stream().forEach(System.out::println);

	}

}
