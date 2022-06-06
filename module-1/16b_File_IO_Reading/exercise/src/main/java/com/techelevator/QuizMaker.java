package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuizMaker {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner userInput = new Scanner(System.in);
        System.out.print("What is the fully qualified name of the file that should be searched? ");
        String filePath = userInput.nextLine();
        File questionsFile = new File(filePath);


        Scanner fileInput = new Scanner(questionsFile);
        int totalNumberOfQuestions = 0;
        while (fileInput.hasNextLine()) {
            totalNumberOfQuestions++;
        }
        


    }

}
