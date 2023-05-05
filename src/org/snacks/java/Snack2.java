package org.snacks.java;

import java.util.Random;

public class Snack2 {
	public static void main(String[] args) {
		String[] names = {"nome" , "nome" , "nome" , "nome" , "nome"};
		String[] surnames = {"cognome" , "cognome" , "cognome"};
		
		Random rand = new Random();
		
		int namesListLength = names.length;
		int surnamesListLength = surnames.length;
		
		int maxValue = (namesListLength > surnamesListLength) ? surnamesListLength : namesListLength;
		
		for(int i=0 ; i<maxValue; i++) {
			int randomValue = rand.nextInt(maxValue);
			String name = names[randomValue];
			String surname = surnames[randomValue];
			System.out.println(name +  " " + surname);
		}
	}
}
