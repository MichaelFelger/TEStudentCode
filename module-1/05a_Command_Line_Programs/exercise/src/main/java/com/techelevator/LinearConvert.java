package com.techelevator;

import java.util.Objects;
import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the Linear Converter!");

		System.out.print("What length would you like to convert? ");
		double inputLength = Double.parseDouble(scanner.nextLine());

		System.out.print("Is your length  in (m)eter or (f)eet? ");
		String ftOrM = (scanner.nextLine());


		double feetToMeters = (inputLength * 3.2808399);
		double metersToFeet = (inputLength * 0.3048);

		if (Objects.equals(ftOrM, "f")) {
			System.out.printf("%.2f feet is %.2f meters", inputLength,feetToMeters);
		}
		if (Objects.equals(ftOrM, "m")) {
			System.out.printf("%.2f meters is %.2f in feet", inputLength,metersToFeet);
		}

	}

}
