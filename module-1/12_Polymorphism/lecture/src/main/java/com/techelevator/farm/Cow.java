package com.techelevator.farm;

import java.math.BigDecimal;
import java.util.Collections;

public class Cow extends FarmAnimal implements Sellable {

    public Cow() {
        super("Cow", "Moo");
    }

    public BigDecimal getPrice() {
        return BigDecimal.TEN;
    }
    //    public String getName() {
//        return "Cow";
//    }
//
//    public String getSound() {
//        return "Moo";
//    }

}
