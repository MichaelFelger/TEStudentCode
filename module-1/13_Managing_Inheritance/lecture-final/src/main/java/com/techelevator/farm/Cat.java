package com.techelevator.farm;

public final class Cat extends FarmAnimal implements Singable {
    public Cat() {
        super("cat", "meow");
    }

    @Override
    public String eat() {
        return "cat food";
    }
}

