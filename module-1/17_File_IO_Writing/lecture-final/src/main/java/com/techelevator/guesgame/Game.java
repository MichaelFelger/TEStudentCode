package com.techelevator.guesgame;

public class Game {

    public enum Result {
        HIGHER,
        LOWWER,
        CORRECT
    }

    private final int secretNumber;

    public Game() {
        this((int)(Math.random() * 100.0));
    }

    /**
     * this is for testing and should not be used otherwise
     * @param number
     */
    public Game(int number) {
        secretNumber = number;
    }

    private int getSecretNumber() {
        return secretNumber;
    }

    public Result evaluateGuess(int guess) {
        if (guess == getSecretNumber()) {
            return Result.CORRECT;
        } else if (guess < getSecretNumber()) {
            return Result.HIGHER;
        } else  {
            return Result.LOWWER;
        }

    }

}
