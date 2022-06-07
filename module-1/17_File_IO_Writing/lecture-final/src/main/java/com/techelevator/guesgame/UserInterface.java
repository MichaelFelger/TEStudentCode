package com.techelevator.guesgame;

import java.util.Scanner;

public class UserInterface {

    Scanner userInput;

    public UserInterface() {
        userInput = new Scanner(System.in);
    }

    public int getGuess() {
        while(true) {
            try {
                write("Pick a number between 0 amd 99");
                int guess = Integer.parseInt(userInput.nextLine());
                return guess;
            }catch (NumberFormatException nfe){
                write("Enter a valid number.");
            }
        }
    }

    public void writeCorrectMessage() {
        write("you got it correct!");
    }

    public void writeLower() {
        write("Lower");
    }

    public void writeHigher() {
        write("Higher");
    }

    public void write(String message) {
        System.out.println(message);
    }

}
