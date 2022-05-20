package com.techelevator;

import java.util.Scanner;

class DiscountCalculator {

    /**
     * The main method is the start and end of our program
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Discount Calculator");

        // Prompt the user for a discount amount
        // The answer needs to be saved as a double
        System.out.print("Enter the discount amount (w/out percentage): ");
        double discount = Double.parseDouble(scanner.nextLine()) / 100.0;

        // Prompt the user for a series of prices
        System.out.print("Please provide a series of prices (space separated): ");
        String input = scanner.nextLine();
        String[] prices = input.split(" ");

        for (int index = 0; index < prices.length; index++) {

            double thePrice = Double.parseDouble(prices[index]);
            double ammountOff = thePrice * discount;
            System.out.printf("Original price %08.2f, amount after discount %08.2f\n",
                    thePrice, thePrice- ammountOff);
        }






    }

}