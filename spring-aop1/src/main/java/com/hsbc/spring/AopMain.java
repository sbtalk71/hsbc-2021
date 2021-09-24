package com.hsbc.spring;

import java.lang.reflect.Method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		GreetService service= ctx.getBean(GreetService.class);
		
		//System.out.println(service.getClass().getName());
		
		service.showGreeting();
		
		/*
		 * for(Method m: service.getClass().getMethods()) {
		 * System.out.println(m.getName()); }
		 */

	}

}
