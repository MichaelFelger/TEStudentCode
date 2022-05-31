package com.techelevator.com.school;

public class Person {

    private String name;
    private int id;

    //constructor
    public Person (String name, int id) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }


}
