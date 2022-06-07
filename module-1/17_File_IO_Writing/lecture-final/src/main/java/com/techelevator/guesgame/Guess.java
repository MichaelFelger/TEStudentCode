package com.techelevator.guesgame;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {

        Game game = new Game();
        UserInterface ui = new UserInterface();

        while (true) {
            int guess = ui.getGuess();
            Game.Result result = game.evaluateGuess(guess);
            if (result == Game.Result.CORRECT) {
                ui.writeCorrectMessage();
                break;
            } else if (result == Game.Result.HIGHER) {
                ui.writeHigher();
            } else if (result == Game.Result.LOWWER) {
                ui.writeLower();
            }
        }
    }
}
