package com.techelevator.cardgame.farm;

import java.math.BigDecimal;

public class Pig extends FarmAnimal implements Sellable {
    private BigDecimal price;

    public Pig() {
        super("Pig", "oink!");
        price = new BigDecimal("300.00");
    }
    public String eat() {
        return "suet";
    }

    public BigDecimal getPrice() {
        return price;
    }
}