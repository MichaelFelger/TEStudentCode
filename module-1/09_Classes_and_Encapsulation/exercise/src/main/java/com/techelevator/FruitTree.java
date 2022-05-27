package com.techelevator;

public class FruitTree {

    private String typeOfFruit = "";
    public int piecesOfFruitLeft = 0;


    //getters
    public String getTypeOfFruit() {
        return typeOfFruit;
    }
    public int getPiecesOfFruitLeft() {
        return piecesOfFruitLeft;
    }

    //constructor
    public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = startingPiecesOfFruit;
    }

    //methods
public boolean pickFruit (int numberOfPiecesToRemove) {
    if (piecesOfFruitLeft >= numberOfPiecesToRemove) {
        piecesOfFruitLeft -= numberOfPiecesToRemove;
        return true;

    }
    return false;
}

}
