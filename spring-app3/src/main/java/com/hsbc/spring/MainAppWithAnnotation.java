package com.hsbc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hsbc.spring.entity.Emp;
import com.hsbc.spring.service.EmpService;

public class MainAppWithAnnotation {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		EmpService service=ctx.getBean(EmpService.class);
		
		System.out.println(service.saveEmp(new Emp(100, "James", "Chennai", 89000)));

	}

}
