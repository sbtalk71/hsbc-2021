package com.hsbc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hsbc.spring.entity.Emp;
import com.hsbc.spring.service.EmpService;

public class MainAppWIthXML {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		
		EmpService service=ctx.getBean(EmpService.class);
		
		System.out.println(service.saveEmp(new Emp(100, "James", "Chennai", 89000)));

	}

}
