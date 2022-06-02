package com.techelevator.cardgame.farm;

public final class Cat extends FarmAnimal implements Singable {
    public Cat() {
        super("cat", "meow");
    }

    public String eat() {
        return "cat food";
    }
//  this class is FINAL, so no subclasses, no kitties
}
