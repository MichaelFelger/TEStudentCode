package com.techelevator.com.school;

public class GradStudent extends Student {
    private int numberOfThesisYears;

    public GradStudent(String name, int id) {    //need to chain up to the constructor
        super(name, id, "grad"); // passing through the name and year, and adding in "grad"
    }

    @Override  // again, adding this isn't needed by Java, but it protects the programmer - will throw an error if you do it wrong
                // if you say here - my intention is to do an override on the superclass method
                // - it you aren't actually doing it, it will let you know.
    public int getStressLevel() {
        return (2*units) + (2*numberOfThesisYears);
    }

    public void setNumberOfThesisYears(int numberOfThesisYears) {
        this.numberOfThesisYears = numberOfThesisYears;
    }
}
