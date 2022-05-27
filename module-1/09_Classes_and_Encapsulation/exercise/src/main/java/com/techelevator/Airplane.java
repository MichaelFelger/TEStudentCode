package com.techelevator;

public class Airplane {
    private String planeNumber = "";
    private int totalFirstClassSeats = 0;
    private int bookedFirstClassSeats = 0;
    private int availableFirstClassSeats = 0;
    private int totalCoachSeats = 0;
    private int bookedCoachSeats = 0;
    private int availableCoachSeats = 0;

    //getters
    public String getPlaneNumber() {
        return planeNumber;
    }

    public int getTotalFirstClassSeats() {
        return totalFirstClassSeats;
    }

    public int getBookedFirstClassSeats() {
        return bookedFirstClassSeats;
    }

    public int getAvailableFirstClassSeats() {
        return totalFirstClassSeats - bookedFirstClassSeats;
    }

    public int getTotalCoachSeats() {
        return totalCoachSeats;
    }

    public int getBookedCoachSeats() {
        return bookedCoachSeats;
    }

    public int getAvailableCoachSeats() {
        return totalCoachSeats - bookedCoachSeats;
    }

    //constructor
    public Airplane (String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
        this.planeNumber = planeNumber;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;
    }

    //methods
    public boolean reserveSeats (boolean forFirstClass, int totalNumberOfSeats) {
        if (forFirstClass && totalNumberOfSeats < getAvailableFirstClassSeats() ) {
            bookedFirstClassSeats += totalNumberOfSeats;
            return true;
        } else if (totalNumberOfSeats < getAvailableCoachSeats()){
            bookedCoachSeats += totalNumberOfSeats;
            return true;
        } return false;
    }


}
