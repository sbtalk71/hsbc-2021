package com.hsbc.lambda;

import java.util.Arrays;
import java.util.List;

public class StreamsDemo1 {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,11,34,25,46,76,89);
		
		Long count=nums.stream().filter(a->a%2==0).count();
		System.out.println(count);
		
		
		nums.stream().filter(a->a%2==0).forEach(a->System.out.println(a));
		
		//calculate the sum of all even numbers
		//print all odd numbers
		//print the max even and max odd
		//collect all odd numbers in a seperate collection

	}

}
