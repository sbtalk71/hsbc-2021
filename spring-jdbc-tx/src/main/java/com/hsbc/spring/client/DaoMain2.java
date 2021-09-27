package com.hsbc.spring.client;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hsbc.spring.JdbcConfig;
import com.hsbc.spring.dao.EmpDao;
import com.hsbc.spring.dao.exceptions.EmpExistsException;
import com.hsbc.spring.dao.impl.EmpDaoImpl;
import com.hsbc.spring.entity.Emp;

public class DaoMain2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcConfig.class);
		EmpDao dao = ctx.getBean(EmpDaoImpl.class);
		try {
			dao.save(new Emp(118, "Srikanth", "Bangalore", 56000, LocalDate.parse("2010-07-23")));
		} catch (EmpExistsException ex) {
			System.out.println("Emp Already exists ...");
		}

		// dao.listAll().stream().forEach(System.out::println);

	}

}
