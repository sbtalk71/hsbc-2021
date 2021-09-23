package com.hsbc.features;

import java.util.ArrayList;
import java.util.Map;

public class Demo1 {

	public static void main(String[] args) {

		// ArrayList<Map<String, Employee>> empList= new ArrayList<>();

		String loc = "Hyderabad";

		switch (loc) {
		case "Bangalore":
			System.out.println("You are in Bangalore");
			break;
		case "Hyderabad":
			System.out.println("You are in Hyderabad");
			break;
		default:
			System.out.println("You are in Nowhere");
			break;
		}

	}

}
