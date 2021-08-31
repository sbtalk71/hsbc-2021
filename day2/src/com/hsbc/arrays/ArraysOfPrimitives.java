package com.hsbc.arrays;

public class ArraysOfPrimitives {

	public static void main(String[] args) {
		int[] nums=new int[10];
		
		nums[0]=1;
		
		for(int i=0;i<nums.length;i++) {
			nums[i]=i+10;
		}

		//System.out.println(nums[8]);
		
		for(int x=0;x<nums.length;x++) {
			System.out.println(nums[x]);
		}
		
		int y=0;
		while(y<nums.length) {
			System.out.println(nums[y]);
			y++;
		}
		
		for(int a:nums) {
			System.out.println(a);
		}
	}

}
