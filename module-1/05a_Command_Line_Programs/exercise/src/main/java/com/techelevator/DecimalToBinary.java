package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		String input = scanner.nextLine();
		String[] numbersInput = input.split(" ");// INPUTS ARE STILL STRINGS - WILL HAVE TO PARSE INT TO DO MATH
		for (int i = 0; i < numbersInput.length; i++) {
			int parsedInput = Integer.parseInt(numbersInput[i]);
			System.out.println(parsedInput + " converted to binary is: " + Integer.toBinaryString(parsedInput));
		}

		//  Ran out of time on this one, so I took the Integer.toBinaryString shortcut ;) ¯\_(ツ)_/¯.


		}

}
