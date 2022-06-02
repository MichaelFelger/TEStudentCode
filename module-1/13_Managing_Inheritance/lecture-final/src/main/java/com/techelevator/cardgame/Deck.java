package com.techelevator.cardgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards = new ArrayList<>(52);

    public Deck() {

        for(Card.Suits suit : Card.Suits.values()) {
            for(Card.Rank rank : Card.Rank.values()) {
                Card card = new Card(suit, rank);
                cards.add(card);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public String toString() {
        String result = "";
        for (Card card : cards) {
            result += card.toString() + "\n";
        }

        return result;
    }



}
