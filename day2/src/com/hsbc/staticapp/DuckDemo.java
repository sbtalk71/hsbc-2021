package com.hsbc.staticapp;

public class DuckDemo {

	public static void main(String[] args) {
		Duck d1= new Duck("Poly");
		Duck d2= new Duck("Neela");
		Duck d3= new Duck("Doly");
		Duck d4= new Duck("Dede");
		Duck d5= new Duck("Sheila");
		
		System.out.println("No of ducks created : "+Duck.duckCount);
		Duck.printInfo();
		
		//Class.forName("com.hsbc.staticapp.Duck").newInstance();
		
	}

}
