package com.hsbc.staticapp;

public class Duck {

	
	static int duckCount=0;
	String duckName;
	public Duck(String duckName) {
		this.duckName=duckName;
		duckCount++;
	}
	
	public String getDuckName() {
		return duckName;
	}
	
	
	public static void printInfo() {
		System.out.println("Duck class... with count "+duckCount);
	}
	
	static {
		System.out.println("Duck class Loaded..");
	}
}
