package com.hsbc.spring;

import com.hsbc.spring.impl.GoodMorning;

public class MainNoSpringDI {

	public static void main(String[] args) {
		
		GreetMessage message = new GoodMorning();
		
		GreetService service= new GreetService();
		service.setMessage(message);
		
		service.getGreeting("Scott");
	}

}
