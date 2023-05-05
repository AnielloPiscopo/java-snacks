package org.snacks.java;

import java.util.Arrays;
import java.util.Random;

public class Snack8 {
	public static void main(String[] args) {
		Random rand = new Random();
		int min = 0;
		int max = 100;
		int numOfCircles=10;
		int evenIndex = 0;
		int oddIndex = 0;
		Integer[] evenNums= new Integer[10];
		Integer[] oddNums= new Integer[10];
		
		for(int i=0 ; i<numOfCircles ; i++) {
			int randomNum = rand.nextInt(min , max);
			System.out.println(randomNum);
			if(randomNum%2 == 0) {
				evenNums[evenIndex++] = randomNum;
			}else {
				oddNums[oddIndex++] = randomNum;
			}
		}
		
		int[] strippedEvenArr = new int[evenIndex];
		int[] strippedOddArr = new int[oddIndex];
		
		for(int i=0 ; i<evenIndex ; i++) {
			strippedEvenArr[i] = evenNums[i];
		}
		
		for(int i=0 ; i<oddIndex ; i++) {
			strippedOddArr[i] = oddNums[i];
		}
		
		
		System.out.println(Arrays.toString(strippedEvenArr));
		System.out.println(Arrays.toString(strippedOddArr));
	}
}
