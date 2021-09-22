package com.hsbc.lambda;

public class MainApp {

	public static void main(String[] args) {
		GreetService service = new GreetService();
		service.showGreeting(new GoodMorning());

		service.showGreeting(()->"Good Evening");
		
		service.showGreeting(()->"Good Evening");
		service.showGreeting(()->"Good Evening");
		
		Message m= ()->"hello";
			

	}

}
