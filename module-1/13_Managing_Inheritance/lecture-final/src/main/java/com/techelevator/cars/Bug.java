package com.techelevator.cars;

import com.techelevator.farm.FarmAnimal;

public class Bug extends FarmAnimal {
    public Bug() {
        super("bug", "beep");
    }

    @Override
    public String eat() {
        return "gas";
    }
}
