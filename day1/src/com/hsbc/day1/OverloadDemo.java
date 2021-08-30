package com.hsbc.day1;

public class OverloadDemo {

	public static void main(String[] args) {
		Adder adder = new Adder();
		adder.add();
		adder.add(2,3);
		adder.add(2,3,4);
		adder.add(2,3f);
		adder.add(2.0,3.0);

	}

}
