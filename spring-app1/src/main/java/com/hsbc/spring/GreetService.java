package com.hsbc.spring;

public class GreetService {

	private GreetMessage message;

	public GreetService() {

	}

	public GreetMessage getMessage() {
		return message;
	}

	public void setMessage(GreetMessage message) {
		this.message = message;
	}

	public void getGreeting(String name) {
		System.out.println(message.getGreetMessage() + " " + name);
	}

}
