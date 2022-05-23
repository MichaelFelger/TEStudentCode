package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int input = Integer.parseInt(scanner.nextLine());

		if (input <= 0) {
			System.out.println("0, 1");
		} else if (input == 1) {
			System.out.println("0, 1, 1");
		} else {
			//keep printing fibonacci numbers until input is greater than or equal to
			//could maybe use a while loop
			//how to identify if input number is fibonacci?  if it fibonacci, it will equal the sum of the previous two numbers
		}

	}

}
