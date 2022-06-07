package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("What is the search word?");
        String searchWord = userInput.nextLine();
        System.out.println("What is the replacement word?");
        String replacementWord = userInput.nextLine();
        System.out.println("Enter path to the file: ");
        String path = userInput.nextLine();
        System.out.println("Enter path to the destination file: ");
        String destinationPath = userInput.nextLine();

        userInput.close();

        File sourceFile = new File(path);
        File convertedFile = new File(destinationPath);

        try (Scanner fileInput = new Scanner(sourceFile); PrintWriter writer = new PrintWriter(convertedFile)) {
            while (fileInput.hasNextLine()) {
                String lineOfText = fileInput.nextLine();
                writer.println(lineOfText.replaceAll(searchWord, replacementWord));
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found");
            return;
        }


    }

}
