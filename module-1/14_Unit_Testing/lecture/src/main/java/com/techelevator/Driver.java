package com.techelevator;

public class Driver {
    /* A person can drive if they have a permit and are with a licensed passenger.
    Given two boolean values, hasPermit and withLicensedPassenger,
    write an expression that is true if a person can drive.
    Examples:
    canDrive(true, true) ➔ true
    canDrive(true, false) ➔ false
    canDrive(false, true) ➔ false
    canDrive(false, false) ➔ false */
    public boolean canDrive(boolean hasPermit, boolean withLicensedPassenger) {
        return hasPermit && withLicensedPassenger;
    }
}
