package org.snacks.java;

import java.util.Scanner;

public class Snack10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Inserisci il raggio del cerchio ");
		float radius = in.nextFloat();
		in.close();
		
		double circumference = radius*2 * Math.PI;
		double area = Math.PI * Math.pow(radius, 2);
		
		System.out.println("Il perimetro è uguale a: " + String.format("%.2f",circumference));
		System.out.println("L/area è uguale a: " + String.format("%.2f",area));
	}
}
