package com.techelevator;

public class Pulse {
    public static void main(String[] args) {

        String one = "mike";
        String two = "MIKE";

        if ( one.equalsIgnoreCase(two)) {
            System.out.println("true");
        }

        //        int[] temps = {1,2,3,4,5,6};

//        System.out.println(countLessThanFour(temps));

//        int value = 100;
//        while (value > 50) {
//            value = (int)(Math.random() * 100);
//            System.out.println(value);;
//        }
    }

    private static int countLessThanFour(int[] temps) {
        int acc = 0;
        for (int index = 0; index < temps.length; index++) {
            if (temps[index] < 4) {
                acc += 1;
            }
        }
        return acc;
    }
}
