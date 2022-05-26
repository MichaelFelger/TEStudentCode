package com.techelevator;

import java.math.BigDecimal;

public class Table {
    public static void main(String[] args) {

        Deck deck = new Deck();
        System.out.println(deck.toString());

        deck.shuffle();
        System.out.println(deck.toString());



    }
}
