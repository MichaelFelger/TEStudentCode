package com.school;

public class Student extends Person {

    private String year;
    protected int units;

    public Student(String name, int id, String year) {
        super(name, id);
        this.year = year;
    }

    @Override
    public String getName() {
        String myName = super.getName();
        return myName + ", the " + year;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public int getStressLevel() {
        return 2 * units;
    }

}
