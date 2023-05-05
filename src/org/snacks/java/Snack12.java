package org.snacks.java;

import java.util.Arrays;

public class Snack12 {
	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		
		int arr1Length = arr1.length;
		int arr2Length = arr2.length;
		int arr3Length = arr1Length + arr2Length;
		
		
		int maxValue = (arr1Length > arr2Length) ? arr2Length : arr1Length;
		Integer[] arr3 = new Integer[arr3Length];
		
		for(int i=0 ; i<arr1Length ; i++) {
			arr3[i] = arr1[i];
		}
		
		for(int i=0 ; i<arr2Length ; i++) {
			arr3[arr1Length+i] = arr2[i];
		}
		System.out.println(Arrays.asList(arr3));
	}
}
