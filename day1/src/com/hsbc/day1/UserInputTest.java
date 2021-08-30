package com.hsbc.day1;

import java.util.Scanner;

public class UserInputTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter an integer..");
		while(true) {
		System.out.println("Eneter an 1st number \n");
		int a= sc.nextInt();
		System.out.println("Eneter an 2nd number \n");
		int b= sc.nextInt();
		System.out.println("The SUm of a and b ="+(a+b));
		}

	}

}
