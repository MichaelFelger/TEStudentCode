package com.techelevator;

import java.math.BigDecimal;

public class BigD {
    public static void main(String[] args) {

        BigDecimal bd = new BigDecimal("4.2");
        BigDecimal bd1 = new BigDecimal(1);


        System.out.println(bd.add(bd1));
        System.out.println(bd);
        System.out.println(bd.subtract(bd1));

        BigDecimal bd2 = BigDecimal.ZERO;
        BigDecimal bd3 = new BigDecimal("0");

        BigDecimal bd4 = BigDecimal.valueOf(42);
        System.out.println(bd3.compareTo(bd2));


    }
}
