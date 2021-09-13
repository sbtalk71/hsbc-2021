package com.demo.web;

public class NameService {

	public String concate(String fname, String lname) {

		System.out.println(this.getClass().getName()+" is processing the data");
		return fname + " " + lname;
	}

	public String concateToJSON(String fname, String lname) {

		System.out.println(this.getClass().getName()+" is processing the data");
		String name=fname + " " + lname;
		return "{\"Name\":\""+name+"\"}";
	}
}
