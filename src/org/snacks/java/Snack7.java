package org.snacks.java;

import java.util.Random;

public class Snack7 {
	public static void main(String[] args) {
		Random rand = new Random();
		int min = 0;
		int max = 100;
		int value = 0;
		
		do {
			int randomNum = rand.nextInt(min , max);
			System.out.println("Il numero casuale è: " + randomNum);
			value=randomNum;
			if(value%3 == 0 && value%5 == 0) {
				return;
			}
		}while(value%3 !=0 || value%5 !=0);
	}
}
