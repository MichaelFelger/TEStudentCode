package com.techelevator.farm;

import java.math.BigDecimal;

public class Chicken extends FarmAnimal implements Sellable {

    public Chicken() {
        super("Chicken", "Cluck");
    }

    public BigDecimal getPrice() {
        return BigDecimal.ONE;
    }
}
