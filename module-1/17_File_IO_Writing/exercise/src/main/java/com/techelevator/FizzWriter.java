package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter path to the destination file: ");
        String destinationPath = userInput.nextLine();
        userInput.close();


        int counter = 1;

        try  {
            File file = new File(destinationPath);
            FileOutputStream fos = new FileOutputStream(file);
            PrintWriter writer = new PrintWriter(fos);
            while (counter <= 300) {
                if (counter % 3 == 0 && counter % 5 == 0) {
                    writer.println("FizzBuzz");
                } else if (counter % 3 == 0) {
                    writer.println("Fizz");
                } else if (counter % 5 == 0) {
                    writer.println("Buzz");
                } else {
                    writer.println(counter);
                } counter++;

            } writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found");
        }

    }

}
