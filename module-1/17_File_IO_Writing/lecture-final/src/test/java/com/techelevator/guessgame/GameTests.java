package com.techelevator.guessgame;

import com.techelevator.guesgame.Game;
import org.junit.Assert;
import org.junit.Test;

public class GameTests {

    @Test
    public void whenTheGuessIsCorrect_returnCORRECT() {
        // arrange
        int theSecretNumber = 73;
        Game game = new Game(theSecretNumber);

        // act
        Game.Result result = game.evaluateGuess(theSecretNumber);

        // assert
        Assert.assertEquals(Game.Result.CORRECT, result);
    }

    @Test
    public void whenTheGuessIsTooLow_returnHigher() {
        // arrange
        int theSecretNumber = 73;
        Game game = new Game(theSecretNumber);

        // act
        Game.Result result = game.evaluateGuess(theSecretNumber-1);

        // assert
        Assert.assertEquals(Game.Result.HIGHER, result);
    }

    @Test
    public void whenTheGuessIsTooHigh_returnLower() {
            // arrange
            int theSecretNumber = 73;
            Game game = new Game(theSecretNumber);

            // act
            Game.Result result = game.evaluateGuess(theSecretNumber+1);

            // assert
            Assert.assertEquals(Game.Result.LOWWER, result);

        }

}
