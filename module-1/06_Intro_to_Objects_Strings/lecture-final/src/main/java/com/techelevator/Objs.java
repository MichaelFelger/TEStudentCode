package com.techelevator;

import java.util.Scanner;

public class Objs {
    public static void main(String[] args) {

        String myString = "hello world";

        String myString2 = new String("hello world");

        int[] arr = new int[3];
        int[] noArray = null;

        noArray = new int[]{1,2,3,4,5};
        noArray = new int[]{11,12,13,14,15};

        Scanner s = null;
        System.out.println(s);
        if (s == null) {
            System.out.println("s was never assigned");
        }

        Double d = 42.0;
        System.out.println();

        String fortyTwo = "42";
        int ft = Integer.parseInt(fortyTwo);




    }
}
