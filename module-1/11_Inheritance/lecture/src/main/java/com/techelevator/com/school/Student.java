package com.techelevator.com.school;

public class Student extends Person {   //inheriting from Person class
    private String year;
    protected int units;

    // constructor
    public Student (String name, int id, String year) {
        super(name, id);  //super keyword calls in methods from superclass constructor
                            // super keyword always needs to be on the first line of the constructor
                            // this is always necessary if we don't have a default constructor
        this.year = year;

    }
    @Override // good practice to put this @Override note in
    public String getName() {
        String myName = super.getName();  // in this case "name" is private to the superclass, so we can use super to use the getter
        return myName + ", the " + year;
    }


    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public int getStressLevel() {
        return 2*units;
    }



}
