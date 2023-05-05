package org.snacks.java;

import java.util.Scanner;

public class Snack4 {
	public static void main(String[] args) {
		System.out.print("Inserisci la parola: ");
		
		Scanner in = new Scanner(System.in);
		String word = in.nextLine().toLowerCase();
		in.close();
		
		int wordLength = word.length();
		String reversedWord = "";
		
		for(int i=wordLength-1 ; i>=0 ; i--) {
			reversedWord += word.charAt(i);
		}
		
		System.out.println((reversedWord.equals(word) ? "La parola è palindroma" : "La parola non è palindroma"));
	}
}
