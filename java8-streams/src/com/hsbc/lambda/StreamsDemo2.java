package com.hsbc.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo2 {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 34, 25, 46, 76, 89);

		System.out.println(nums.stream().map(num -> num + 10).reduce((n1, n2) -> n1 + n2).get());

		List<List<Integer>> nums2 = Arrays.asList(Arrays.asList(1, 2, 3, 4, 5, 6), Arrays.asList(7, 8, 9, 11, 34),
				Arrays.asList(25, 46, 76, 89));

		
		
		System.out.println(nums2.stream().flatMapToInt(a -> a.stream().mapToInt(n -> n.intValue()))
				.filter(n -> n % 2 == 0).reduce((n1, n2) -> n1 + n2).getAsInt());

	}

}

/*
 * class EvenChecker {
 * 
 * public boolean checkForEven(int x) { if (x % 2 == 0) { return true; } else {
 * return false; } } }
 */
