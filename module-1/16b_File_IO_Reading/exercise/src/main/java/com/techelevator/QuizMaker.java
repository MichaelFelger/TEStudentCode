package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizMaker {
    static List<String> questionList = new ArrayList<>();
    List<String> responsesList = new ArrayList<>();
    static List<String> answerList = new ArrayList<>();


    public static void main(String[] args) throws FileNotFoundException {

        Scanner userInput = new Scanner(System.in);
        System.out.println("What is the fully qualified name of the file that should be searched? ");
        String filePath = userInput.nextLine();
        File questionsFile = new File(filePath);

        Scanner fileInput = new Scanner(questionsFile);

            while (fileInput.hasNextLine()) {
                String line = fileInput.nextLine();
                String[] lineArray = line.split("\\|");
                questionList.add(lineArray[0]);
                answerList.add(lineArray[1]);
                System.out.println(questionList);
                System.out.println(answerList);

            }

            // loop through array
            // add to lists by index
            // questions list [0]
            // responses list [rest of indexes]
            // correctAnswer list [index string.endswith*]
            // line by line, feed this into a Question constructor (String question, String responses (maybe in array?), String answer)






        }



    }

