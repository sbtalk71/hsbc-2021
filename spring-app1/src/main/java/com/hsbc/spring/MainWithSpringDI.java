package com.hsbc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainWithSpringDI {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("context.xml");
		
		GreetService service=ctx.getBean(GreetService.class);
		
		service.getGreeting("Scott");
	}

}
