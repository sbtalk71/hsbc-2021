package com.hsbc.day1;

public class Adder {

	public void add() {
		System.out.println("Nothing to add, calling add()");
	}

	/*
	 * public int add(int a, int b ) { System.out.println("calling add(int,int");
	 * return a+b; }
	 */
	
	public int add(int a, int b, int c ) {
		System.out.println("calling add(int,int,int");
		return a+b+c;
	}
	
	/*
	 * public float add(int a, float b ) {
	 * System.out.println("calling add(int,float"); return a+b; }
	 */
	
	public double add(double a, double b ) {
		System.out.println("calling add(double,double");
		return a+b;
	}
}
