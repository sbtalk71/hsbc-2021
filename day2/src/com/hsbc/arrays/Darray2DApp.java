package com.hsbc.arrays;

public class Darray2DApp {

	public static void main(String[] args) {
		int[][] nums= {{1,2},{3,4},{5,6}};
		
		int[][][] nums2= {
				{
					{1,2},{4,5},{6,7},{8,9}},{{1,2},{4,5},{6,7},{8,9}},
					{{1,2},{4,5},{6,7},{8,9}},{{1,2},{4,5},{6,7},{8,9}}
				
		
		};
		
		int[][][] nums3=new int[2][3][5];
		System.out.println(nums3.length);
		
		//System.out.println(nums.length);
		System.out.println(nums[1][1]);
		System.out.println(nums2[0][3][0]);
		

	}

}
