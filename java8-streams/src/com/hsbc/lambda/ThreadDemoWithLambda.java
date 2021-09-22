package com.hsbc.lambda;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ThreadDemoWithLambda {

	public static void main(String[] args) {
		
		
		
		
		//Runnable target=()->System.out.println("I am from Therad");
		
			
		Thread t1 = new Thread(()->System.out.println("I am from Therad"));
		
		Predicate p=(s)->s.equals("Shantanu");
		
		Consumer<String> name=(s)->System.out.println(s);
		
		BiFunction<Integer,Integer,Integer> sum=(num1,num2)->num1+num2;
		
	}

}
