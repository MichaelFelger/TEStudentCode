package com.techelevator;

import java.math.BigDecimal;

public class BD {
    public static void main(String[] args) {

        BigDecimal d = new BigDecimal("9.08");
        d.add(BigDecimal.ONE);
        BigDecimal newD = d.multiply(BigDecimal.TEN);
        newD.divideAndRemainder(BigDecimal.ZERO);

        int result = newD.compareTo(BigDecimal.ZERO);
    }
}
