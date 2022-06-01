package com.techelevator.farm;

import java.math.BigDecimal;

public class Egg implements Sellable {

    public BigDecimal getPrice() {
        return new BigDecimal("0.20");
    }

    public String getName() {
        return "Egg";
    }
}
