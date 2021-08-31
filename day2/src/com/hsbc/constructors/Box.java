package com.hsbc.constructors;

public class Box {

	private int length;
	private int breadth;
	private int height;
	private String color = "colorless";
	private double weight;

	public Box(int length, int breadth, int height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	public Box(int length, int breadth, int height, String color) {
		this(length, breadth, height);
		this.color = color;
	}
	public Box(int length, int breadth, int height, String color,double weight) {
		this(length, breadth, height,color);
		this.weight = weight;
	}
	
	public Box(int length) {
		this(length, length, length);
	}
	public double volume() {
		return length * breadth * height;
	}

	public String getBoxColor() {
		return this.color;
	}

}
