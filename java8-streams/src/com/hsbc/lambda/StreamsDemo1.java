package com.hsbc.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo1 {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,11,34,25,46,76,89);
		
		Long count=nums.stream().filter(a->a%2==0).count();
		System.out.println(count);
		
		
		nums.stream().filter(a->a%2==0).forEach(a->System.out.println(a));
		
		//calculate the sum of all even numbers
		nums.stream().filter(a->a%2==0).mapToInt(n->n.intValue()).sum();
		
		//print all odd numbers
		nums.stream().filter(a->!(a%2==0)).forEach(a->System.out.println(a));
		//print the max even and max odd
		System.out.println(nums.stream().filter(a->a%2==0).mapToInt(n->n.intValue()).max().getAsInt());
		System.out.println(nums.stream().filter(a->!(a%2==0)).mapToInt(n->n.intValue()).max().getAsInt());
		//collect all odd numbers in a separate collection
		
		List<Integer> oddNums=nums.stream().filter(a->!(a%2==0)).collect(Collectors.toList());
		//Method Reference Class::method if static method else objRef::method
		oddNums.forEach(System.out::println);
		
		
		
		
	}

}
