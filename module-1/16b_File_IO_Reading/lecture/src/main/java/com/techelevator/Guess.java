package com.techelevator;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        String input = scanner.nextLine();
        try {
            int guess = anotherLevelForFun(input);
            System.out.println(guess);
        } catch (NumberFormatException nfe) {
            System.out.println("cannot convert to a number");
        } catch (ArithmeticException ae) {
            System.out.println("stop doing bad math");
        }
        catch (RuntimeException ex) {
            // empty exception, but remember that Exception class will catch any exception
            // get your exceptions in the correct order
        } finally {
            System.out.println("this finally will always happen");
            scanner.close();
        }

    }

    private static int convertTheGuess(String theGuess) {
        try {
            return anotherLevelForFun (theGuess);
        } catch (ArithmeticException ae) {
            System.out.println("caught ArithmeticException");
            return 0;
        }
    }



    private static int anotherLevelForFun(String guess) {
        throw new IllegalArgumentException("bad robot");
//        int theNumber = Integer.parseInt(guess);
//        System.out.println("wont happen for an exception");
//        return theNumber;
    }

}
