package com.techelevator;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        String input = scanner.nextLine();
        try {
            int guess = convertTheGuess(input);
            System.out.println(guess);
        } catch (NumberFormatException nfe) {
            System.out.println("cannot convert to a number");
        } catch (IllegalArgumentException ae) {
            System.out.println("stop doing bad math");
            System.out.println(ae.getMessage());
        }
        finally {
            System.out.println("this will always happen");
            scanner.close();
        }
    }

    private static int convertTheGuess(String theGuess) throws FileNotFoundException {
        try {
            if (theGuess.isEmpty()) {
                throw new FileNotFoundException("never mind");
            }
            return anotherLevelForFun(theGuess);
        } catch (ArithmeticException ae) {
            System.out.println("caught ArithmeticException");
            return 0;
        }
    }

    private static int anotherLevelForFun(String guess) {
        throw new IllegalArgumentException("bad robot");
//        int theNumber = Integer.parseInt(guess);
//        System.out.println("won't happen for an exception");
//        return theNumber;
    }

}
