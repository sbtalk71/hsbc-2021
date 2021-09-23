package com.hsbc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		Mail mail = (Mail)ctx.getBean("mail");
		
		//Mail mail = ctx.getBean(Mail.class);
		
		System.out.println(mail.getMessage().getBody());

	}

}
