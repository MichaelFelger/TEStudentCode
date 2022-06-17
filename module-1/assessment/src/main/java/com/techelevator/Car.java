package com.techelevator;

import java.time.Year;

public class Car {
    private int year;
    private String make;
    private boolean isClassicCar;
    private int age;
    private int currentYear = 2022;
    private int exemptNewCarYears = 4;
    private int exemptOldCarYears = 25;


    // constructor
    public Car (int year, String make, boolean isClassicCar) {
        this.year = year;
        this.make = make;
        this.isClassicCar = isClassicCar;
        this.age = currentYear - year;
    }

    public Car() {

    }

    // getters
    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public boolean isClassicCar() {
        return isClassicCar;
    }

    public int getAge() {
        return age;
    }

    // methods
    public boolean eCheckRequired (int yearToCheck) {
        if (isClassicCar) {
            return false;
        }
        else if (currentYear - yearToCheck <= exemptNewCarYears || currentYear - yearToCheck >= exemptOldCarYears) {
            return false;
        } else if (yearToCheck % 2 == 0) {
            return false;
        } else return true;
    }

    public String toString() {
        return "Car - " + year + " - " + make;
    }

}
