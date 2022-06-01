package com.techelevator.farm;

import java.math.BigDecimal;

public class FarmAnimal implements Singable {  // implements means it abides by interface contract

    private String name;
    private String sound;
    private BigDecimal price;

    //add a constructor
    public FarmAnimal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
