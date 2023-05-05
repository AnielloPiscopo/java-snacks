package org.snacks.java;

public class Snack12 {
	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4, 5  };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		
		int arr1Length = arr1.length;
		int arr2Length = arr2.length;
		
		int maxValue = (arr1Length > arr2Length) ? arr2Length : arr1Length;
		
		for(int i=0 ; i<maxValue; i++) {
			int arr1Value = arr1[i];
			int arr2Value = arr2[i];
			System.out.println(arr1Value +  "-" + arr2Value);
		}
	}
}
