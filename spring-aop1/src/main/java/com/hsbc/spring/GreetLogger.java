package com.hsbc.spring;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect

public class GreetLogger {
	@Pointcut("execution(* com.hsbc.spring.GreetService.showGreeting(..))")
	private void pcut() {}

	@Before("pcut()")
	public void beforeGreet1() {
		System.out.println("Before calling showGreeting-1");
	}
	
	@Before("pcut()")
	public void beforeGreet() {
		System.out.println("Before calling showGreeting-2");
	}
	
	@AfterReturning("pcut()")
	public void afterGreet() {
		System.out.println("After calling showGreeting");
	}
}
