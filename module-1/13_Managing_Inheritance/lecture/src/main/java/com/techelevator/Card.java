package com.techelevator;

public class Card {

    public enum Suits {
        CLUBS,
        SPADES,
        HEARTS,
        DIAMONDS
    }

    public enum Rank {
        DEUCE, THREE, FOUR, FIVE, SIX, SEVEN,
        EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }


    private final Suits suit;
    private final Rank rank;
    private boolean faceDown = true;

    public Card(Suits suit, Rank rank) {
        this(suit, rank, false);
    }

    public Card(Suits suit, Rank rank, boolean showFaceUp) {



        this.suit = suit;
        this.rank = rank;
        this.faceDown = !showFaceUp;
    }

    public Suits getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public boolean isFaceDown() {
        return faceDown;
    }

    public String cardOrientation() {
        return "the care is " + (faceDown ? "face down" : "face up");
    }

    public void flip() {
        this.faceDown = !faceDown;
    }

    public String toString() {
        return String.format("%s of %s", rank, suit);
    }


}
