package com.techelevator.model;

public class City {

    private int id;
    private String name;
    private int population;
    private double area;

    public City(int id, String name, int population, double area) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.area = area;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public double getArea() {
        return area;
    }
}
