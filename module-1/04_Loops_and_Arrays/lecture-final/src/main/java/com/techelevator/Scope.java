package com.techelevator;

public class Scope {
    public static void main(String[] args) {


        int sum = 0;

        for(int i=1; i <= 100; i++) {
            sum += i;
        }

        if (true) {
            System.out.println(sum);
        }

        System.out.println(sum);


//        double subtotal = 0;
//        if (true) {
//
//            // calculate subtotal
//
//        }
//
//        if (hasDiscount) {
//            subtotal *= discount
//        }
//
//        System.out.println(subtotal);




//        {
//            int y = 1;
//            System.out.println(y);
////            System.out.println(x+y);
//        }
//
//        System.out.println(x);
//        System.out.println(y);
    }
}
