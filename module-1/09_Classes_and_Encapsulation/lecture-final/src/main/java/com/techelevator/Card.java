package com.techelevator;

public class Card {

    private final static String[] SUIT_NAMES = new String[] { "Nil", "Spades", "Diamonds", "Clubs", "Hearts" };
    private final static String[] RANK_NAMES = new String[] { "Joker", "Ace", "Two", "Three", "Four", "Five", "Six", "Seven",
            "Eight", "Nine", "Ten", "Jack", "Queen", "King" };

    private int suit = 0;
    private int rank = 0;
    private boolean faceDown = true;

    public Card(int suit, int rank) {
        this(suit, rank, false);
    }

    public Card(int suit, int rank, boolean showFaceUp) {
        this.suit = suit;
        this.rank = rank;
        this.faceDown = !showFaceUp;
    }

    public int getSuit() {
        return suit;
    }

    public int getRank() {
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
        return String.format("%s of %s", getRankName(rank), getSuitName(suit));
    }

    public static String getSuitName(int suit) {
        return SUIT_NAMES[suit];
    }

    public static String getRankName(int rank) {
        return RANK_NAMES[rank];
    }

}
