package com.school;

public class Person {

    private String name;
    private int id;

    public Person(String name, int id) {
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
