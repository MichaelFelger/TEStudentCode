package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		String input = scanner.nextLine();
		String[] numbersInput = input.split(" ");// INPUTS ARE STILL STRINGS - WILL HAVE TO PARSE INT TO DO MATH
		for (int i = 0; i < numbersInput.length -1; i++) {
			String[] parsedInput =
		}

		//  Ran out of time on this one :(



		/*trying to create a new array of ints
		int arraySize = numbersInput.length;
		int[] arrayOfIntegers = new int [arraySize];
		for (int i = 0; i < arraySize; i++ ) {
			arrayOfIntegers[i] = Integer.parseInt(numbersInput[i]);
		*/

		}

}
