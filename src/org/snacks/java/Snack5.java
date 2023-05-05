package org.snacks.java;

import java.util.Random;
import java.util.Scanner;

public class Snack5 {
	public static void main(String[] args) {
		System.out.print("Inserisci il numero ");
		Scanner in = new Scanner(System.in);
		int userNum = in.nextInt();
		in.close();
		
		Random rand = new Random();
		int min = 1;
		int max = 100;
		
		int som = 0;
		int evenSom = 0;
		int oddSom = 0;
		int oddCount = 0;
		int minNum = 0;
		int maxNum = 0;
		
		for(int i=0 ; i<userNum ; i++) {
			int randomNum = rand.nextInt(min , max);
			System.out.println("Il numero randomico è: " + randomNum);
			som+=randomNum;
			
			if(randomNum%2 == 0) {
				evenSom+=randomNum;
			}else {
				oddCount++;
				oddSom+=randomNum;
			}
			
			minNum = (minNum > randomNum || minNum == 0) ? randomNum : minNum;
			maxNum = (maxNum < randomNum) ? randomNum : maxNum;
		}
		
		int average = (som)/userNum;
		int oddAverage = oddSom/oddCount;
		
		System.out.println("La somma di tutti i numeri è: " + som);
		System.out.println("La somma di tutti i numeri pari è: " + evenSom);
		System.out.println("La somma di tutti i numeri dispari è: " + oddSom);
		System.out.println("La media di tutti i numeri è: " + average);
		System.out.println("La media di tutti i numeri è dispari: " + oddAverage);
		System.out.println("Il minimo di tutti i numeri è: " + minNum);
		System.out.println("Il massimo di tutti i numeri è: " + maxNum);
	}
}
