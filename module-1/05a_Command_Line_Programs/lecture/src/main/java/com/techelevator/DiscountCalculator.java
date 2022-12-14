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
        //                                    ^^^^ scanner taking input up to Enter
        //                                    and return as a string, passing string
        //                                    to parseDouble, then dividing by 100


        // Prompt the user for a series of prices
        System.out.print("Please provide a series of prices (space separated): ");
        String input = scanner.nextLine();
        String[] prices = input.split(" ");
        //                       ^^^ split method (splits on spaces because we told it to)
        //                       takes input and puts it into an array, in this case, an array
        //                       of strings called prices

        for (int index = 0; index < prices.length; index++) {

            double thePrice = Double.parseDouble(prices[index]); // running through array and giving prices (indexes in the array)
            double ammountOff = thePrice * discount; //
            System.out.printf("Original price %08.2f, amount after discount %08.2f\n", thePrice, thePrice - ammountOff);
            // the \n puts a line feed in here for the printout
            // the 4.2 says 4 total spaces, 2 of which are decimals
        }






    }

}