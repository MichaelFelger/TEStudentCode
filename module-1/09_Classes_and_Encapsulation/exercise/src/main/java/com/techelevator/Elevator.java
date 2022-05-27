package com.techelevator;

public class Elevator {
    private int currentFloor;
    private int numberOfFloors;
    private boolean doorOpen;

    //getters
    public int getCurrentFloor() {
        return currentFloor;
    }
    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }

    //constructor
    public Elevator (int numberOfLevels) {
        this.numberOfFloors = numberOfLevels;
        currentFloor = 1;
    }
    public void openDoor() {
        doorOpen = true;
    }
    public void closeDoor() {
        doorOpen = false;

    }
    public void goUp(int desiredFloor) {
        if (!doorOpen && currentFloor < numberOfFloors) {
            currentFloor = desiredFloor;
        }
    }
    public void goDown(int desiredFloor) {
        if (!doorOpen && currentFloor > 1) {
            currentFloor = desiredFloor;
        }
    }

}
