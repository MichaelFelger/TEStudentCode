package com.techelevator.guessgame;

public class Game {

    private int final secretNumber;

    public Game() {
        secretNumber = (int)(Math.random() * 100.0);

    }

    public int getSecretNumber() {
        return secretNumber;
    }

}
