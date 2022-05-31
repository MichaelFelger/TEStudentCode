package com.school;

public class GradStudent extends Student {
    private int numberOfThesisYears;

    public GradStudent(String name, int id) {
        super(name, id, "grad");
    }

    @Override
    public int getStressLevel() {
        return (2*units) + (2+numberOfThesisYears);
    }

    public void setNumberOfThesisYears(int numberOfThesisYears) {
        this.numberOfThesisYears = numberOfThesisYears;
    }

}
