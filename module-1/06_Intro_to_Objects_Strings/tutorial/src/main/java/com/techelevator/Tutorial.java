package com.techelevator;

import java.util.Scanner;

public class Tutorial {

    public static void main(String[] args) {

        // ***********  Step 1: Use the *new* operator to create Strings on the Heap  *************
            char[] helloChars = new char[] {'h', 'e', 'l', 'l', 'o', '!'};
            String greeting = new String(helloChars);
            System.out.println("Greeting: " + greeting);

            String salutation = new String("Welcome my friend");
            System.out.println("Salutation: " + salutation);

            String toast = "May the compiler rise up to meet you.";
            System.out.println("Toast: " + toast);


        // ***********  Step 2: Try out some String methods  *************
            // Prompt the user to enter a sentence
            System.out.print("Write a sentence, please: ");
            Scanner scanner = new Scanner(System.in);
            String sentence = scanner.nextLine();

            // Print the sentence back to the user
            System.out.println(sentence);




        // ***********  Step 3: Compare Strings  *************





    }
}
