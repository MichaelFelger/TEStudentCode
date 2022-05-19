package com.techelevator;

public class Scratch {
    public static void main(String[] args) {

        int sum = (1 + 2);
        boolean a = true;
        boolean b = true;
        boolean c = true;
//        System.out.println((a ^ b) ^ c);

        a = true;
        b = true;
        c = true;
        if (a) {
            System.out.println("a is true");
            System.out.println("another line");
        } else if (b) {
            System.out.println("in the second portion");
        } else if (c) {
            System.out.println("in the third portion");
        }
        else {
            System.out.println("back in the else block");
        }

        System.out.println("continue the program");

        int y = 0;
        System.out.println(y=5);
        System.out.println(y);

    }
}
