package com.hsbc.constructors;

public class BoxMain {

	public static void main(String[] args) {
		Box b = new Box(10,10,15);
		double vol= b.volume();
		
		System.out.println("Volume of Box = "+vol);
		System.out.format("Volume of Bos is %s", vol);
		System.out.println("Color of Box = "+b.getBoxColor());
		
		Box b2=b;
		
		Box b3 = new Box(10,10,15,"red");
		System.out.println("Volume of Box = "+b3.volume());
		System.out.println("Color of Box = "+b3.getBoxColor());
		
		Box b4 = new Box(10,10,15,"red",4.5);
		
		Box b5 = new Box(10);
		System.out.println("Volume of Box = "+b5.volume());
	}

}
