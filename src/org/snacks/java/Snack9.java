package org.snacks.java;

import java.util.Scanner;

public class Snack9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Inserisci la base del rettangolo ");
		float base = in.nextFloat();
		System.out.print("Inserisci l'altezza del rettangolo ");
		float height = in.nextFloat();
		in.close();
		
		float perimeter = base*2 + height*2;
		float area = base*height;
		
		System.out.println("Il perimetro è uguale a: " + String.format("%.2f",perimeter));
		System.out.println("L/area è uguale a: " + String.format("%.2f",area));
	}
}
