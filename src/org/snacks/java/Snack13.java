package org.snacks.java;

import java.util.Arrays;

public class Snack13 {
	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4, 5};
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		
		int arr1Length = arr1.length;
		int arr2Length = arr2.length;
		int[] swappedArr1 = new int[arr1Length];
		int[] swappedArr2 = new int[arr2Length];
		
		int maxIndexValue = (arr1Length > arr2Length) ? arr1Length : arr2Length;
		
		swappedArr1[0] = arr2[0];
		swappedArr2[0] = arr1[0];
		
		for(int i=1 ; i<maxIndexValue; i++) {
			if(i<arr1Length) {				
				swappedArr1[i] = arr1[i];
			} 
			if(i<arr2Length) {				
				swappedArr2[i] = arr2[i];
			}
		}
		
		System.out.println(Arrays.toString(swappedArr1));
		System.out.println(Arrays.toString(swappedArr2));
	}
}
