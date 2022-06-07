package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizMaker {
List<String> list = new ArrayList<>();


    public static void main(String[] args) throws FileNotFoundException {

        Scanner userInput = new Scanner(System.in);
        System.out.print("What is the fully qualified name of the file that should be searched? ");
        String filePath = userInput.nextLine();
        File questionsFile = new File(filePath);


        // this should be a list of questions
        List<QuizQuestion> questionList = new ArrayList<>();
        Scanner fileInput = new Scanner(questionsFile);
        int totalNumberOfQuestions = 0;
        while (fileInput.hasNextLine()) {
            totalNumberOfQuestions++;
            String line = fileInput.nextLine();
            String[] lineArray = line.split("\\|");
            for (int i = 0; i < lineArray.length; i++) {
             //   questionList.add(lineArray[i]);

            }



            // loop through array
            // add to lists by index
            // questions list [0]
            // responses list [rest of indexes]
            // correctAnswer list [index string.endswith*]
            // line by line, feed this into a Question constructor (String question, String responses (maybe in array?), String answer)






        }



    }

}
