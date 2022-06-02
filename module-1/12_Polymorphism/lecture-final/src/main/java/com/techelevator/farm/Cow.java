package com.techelevator.farm;

import java.math.BigDecimal;

public class Cow extends FarmAnimal implements Sellable {

    public Cow() {
        super("Cow", "moo");
    }

    public BigDecimal getPrice() {
        return BigDecimal.TEN;
    }

}
