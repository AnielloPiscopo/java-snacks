package org.snacks.java;

import java.util.Scanner;

public class Snack11 {
	public static void main(String[] args) {
		System.out.print("Inserisci il numero ");
		Scanner in = new Scanner(System.in);
		int userNum = in.nextInt();
		
		for(int i=0 ; i<Integer.MAX_VALUE ; i++) {
			if(i%userNum == 0) {
				System.out.println(i);
			}
		}
	}
}
