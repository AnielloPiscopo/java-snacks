package org.snacks.java;

public class Snack3 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6};
		int soms = 0;
		
		for(int i=0 ; i<nums.length ; i+=2) {
			int num = nums[i];
			soms+=num;
		}
		
		System.out.println(soms);
	}
}
