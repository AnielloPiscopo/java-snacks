package org.snacks.java;
import java.util.Scanner;

public class Snack1 {
	public static void main(String[] args) {
		System.out.print("Inserisci il numero ");
		Scanner in = new Scanner(System.in);
		int userNum = in.nextInt();
		in.close();
		System.out.println((userNum%2 == 0) ? userNum : userNum+1);
	}
}
