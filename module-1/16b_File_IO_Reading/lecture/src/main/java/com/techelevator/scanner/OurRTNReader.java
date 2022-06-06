package com.techelevator.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OurRTNReader {
    public static void main(String[] args) {

        File file = new File ("rtn.txt");  // take a look in lecture final to see about "try with resource"
        Scanner scanner = null;                     // try with resource will close our resource for us
        int x = 0;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                x++;
                String input = scanner.nextLine();
                System.out.println(x + "   " + input);
            }
        } catch (FileNotFoundException fnf) {
            System.out.println("file not found");
        } finally {
            System.out.println("\nThis file has " + x + " lines.");
            scanner.close();
        }

    }
                /*   for the homework, use scanner and .split to split the input on |
                      for the Quiz Maker homework, we need to 'escape' it's regex functionality with a backslash
                      String[] parts = "one|two|three".split(regex: "\\|")
                      carrot ^ can denote beginning of line
                      ^Hello through regex will return lines that start with Hello
                      ~ is similar but at end of the line

                      although called wordSearch - it's more of a StringSearch - could be a fragment of a word, or a set of characters
                      for case-insensitive - remember the herds of animals problem for a hint at this solution

                      challenge homework is setup for capstone

                */
}
