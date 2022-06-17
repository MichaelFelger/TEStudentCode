package src.main.java;

import java.math.BigDecimal;


public class HotelReservation {
    private String name;
    private double numberOfNights;
    private final double COST_PER_NIGHT = 59.99;
    private final double CLEANING_FEE = 34.99;
    private final double MINIBAR_FEE = 12.99;
    public double estimatedTotal = 0;
    public double actualTotal = 0;


    public HotelReservation(String name, double numberOfNights) {
        this.name = name;
        this.numberOfNights = numberOfNights;
    }

    public HotelReservation() {

    }

    public double getActualTotal() {
        return numberOfNights * COST_PER_NIGHT;
    }
    public double getNumberOfNights() {
        return numberOfNights;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfNights(double numberOfNights) {
        this.numberOfNights = numberOfNights;
    }



    public double actualTotal(boolean requiresCleaning, boolean usedMiniBar) {
        if (requiresCleaning && usedMiniBar) {
            estimatedTotal += CLEANING_FEE*2 + MINIBAR_FEE;
        }
        else if (requiresCleaning) {
            estimatedTotal += CLEANING_FEE;
        } else if (usedMiniBar) {
            estimatedTotal += MINIBAR_FEE;
        } return estimatedTotal;
    }

    @Override
    public String toString() {
        return "RESERVATION - " + name + " - " + estimatedTotal;
    }


}


