package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int input = Integer.parseInt(scanner.nextLine());

		int lowerNumber = 0;
		int higherNumber = 1;

		while (lowerNumber <= input) {
			System.out.print(lowerNumber + " ");
			int newNumber = lowerNumber + higherNumber;
			lowerNumber = higherNumber;
			higherNumber = newNumber;
			}

			//keep printing fibonacci numbers until input is greater than or equal to
			//could maybe use a while loop


	}

}
