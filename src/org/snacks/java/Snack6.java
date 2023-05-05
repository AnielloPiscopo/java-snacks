package org.snacks.java;

import java.util.Random;
import java.util.Scanner;

public class Snack6 {
	public static void main(String[] args) {
		System.out.print("Inserisci il numero ");
		Scanner in = new Scanner(System.in);
		int userNum = in.nextInt();
		in.close();
		
		Random rand = new Random();
		int som = 0;
		int min = 0;
		int max = 100;
		
		do {
			int randomNum = rand.nextInt(min , max);
			System.out.println("Il numero casuale è: " + randomNum);
			som+=randomNum;
			if(som>userNum) {
				som-=randomNum;
				System.out.println("La somma di tutti i numeri è: " + som);
				return;
			}
		}while(som<userNum);
		
	}
}
