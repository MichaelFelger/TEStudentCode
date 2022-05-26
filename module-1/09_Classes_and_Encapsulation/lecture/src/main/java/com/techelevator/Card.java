package com.techelevator;

public class Card {

    private final static String[] SUIT_NAMES = new String[] { "Nil", "Spades", "Diamonds", "Clubs", "Hearts" };
    private final static String[] RANK_NAMES = new String[] { "Joker", "Ace", "Two", "Three", "Four", "Five", "Six", "Seven",
            "Eight", "Nine", "Ten", "Jack", "Queen", "King" };

    // final static public int ACE = 1; // "final" cannot be changed - i.e. you can't go and card.ACE = 5 - it will give an error;
    //  variables at class level is defining a set of constants
    // "static" makes it useful as part of the class, rather than the instance
    // consider it "scoped" to the class, rather than the object
    // we have used several static methods in homework so far
    // static methods at class levels are often little helpers we make


    private int suit = 0;
    private int rank = 0;
    private boolean faceDown = true;
    // data types have default values - default for int is 0 - you can still declare it, like here, but default is 0
    // why int for suit?  it's more scalable for - consistency, ease of translation, other reasons

    // encapsulation also speaks about access
    // we determine access, then give people access to work with the variable with tools that we give them (with constraints probably)

    public Card(int suit, int rank) { // this is a (an object constructor) constructor -- when we "new" up a new Card, we can pass in suit and rank
        //    this.suit = suit;             // constructor automatically runs when you instantiate the class
        //    this.rank = rank;             // it's like a setup functionality when you create an object
        // but don't use the constructor to interact with the user!
        // read about cascading constructors - there is a special use for "this" for only constructors
        this(suit, rank, false);
        //^^^ using "this" in the constructor sense to call another constructor that has a different signature - with 3 parameters

    }

    public Card(int suit, int rank, boolean showFaceUp) { // this is method overloading - offering another parameter
        this.suit = suit;
        this.rank = rank;
        this.faceDown = !showFaceUp;
    }


    public int getSuit() {  // these are getters to get the info out
        return suit;
    }

    public int getRank() {  // these are getters to get the info out
        return rank;
    }

    public boolean isFaceDown() {
        return faceDown;
    }

    public void setRank(int rank) { // "this" represents "this instance's"
        if (rank > 0 && rank <= 13) { // this is setting a rule if we want to
            this.rank = rank;
        }

    }

    public String cardOrientation() {     // derived property is a special kind of method
        return "the card is " + (faceDown ? "face down" : "face up");
    }

    // talking about methods: should we have a way to flip the orientation of the card

    public void flip() {
        this.faceDown = !faceDown;

    }

    public String toString() {
        return String.format("%s of %s", getRankName(rank), getSuitName(suit));

    }

    public static String getSuitName (int suit) {
        return SUIT_NAMES[suit];
    }
    public static String getRankName (int rank) {
        return RANK_NAMES[rank];
    }
}
