package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class WordSearch {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            Scanner userInput = new Scanner(System.in);
            System.out.print("What is the fully qualified name of the file that should be searched? ");
            String filePath = userInput.nextLine();

            System.out.print("What word shall we search for? ");
            String searchWord = userInput.nextLine();
            File bookFile = new File(filePath);


            System.out.println("Should this search be case sensitive? (Y/N): ");
            boolean caseSensitive = userInput.nextLine().equalsIgnoreCase("Y");
            userInput.close();


            Scanner fileInput = new Scanner(bookFile);
            int lineCount = 0;

            while (fileInput.hasNextLine()) {
                lineCount++;
                String lineOfText = fileInput.nextLine();
                if (caseSensitive) {
                    if (lineOfText.contains(searchWord)) {
                        System.out.println(lineCount + ": " + lineOfText);
                    }
                } else {
                    searchWord = searchWord.toLowerCase();
                    String caseInsensitveLineOfText = lineOfText.toLowerCase();
                    if (caseInsensitveLineOfText.contains(searchWord)) {
                        System.out.println(lineCount + ": " + lineOfText);

                    }
                }
            }

//            if (caseSensitive) {
//                while (fileInput.hasNextLine()) {
//                    lineCount++;
//                    String lineOfText = fileInput.nextLine();
//                    if (lineOfText.contains(searchWord)) {
//                        System.out.println(lineCount + ": " + lineOfText);
//                    }
//                }
//            } else {
//                while (fileInput.hasNextLine()) {
//                    searchWord = searchWord.toLowerCase();
//                    lineCount++;
//                    String lineOfText = fileInput.nextLine();
//                    String caseInsensitveLineOfText = lineOfText.toLowerCase();
//                    if (caseInsensitveLineOfText.contains(searchWord)) {
//                        System.out.println(lineCount + ": " + lineOfText);
//                    }
//                }
//            }



        } catch (FileNotFoundException fnf) {
            System.out.println("file not found");
        }
    }
}
