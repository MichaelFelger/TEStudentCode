package com.techelevator;

import java.util.Objects;
import java.util.Scanner;

public class TempConvert {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Temperature Converter!");

        System.out.print("What temperature would you like to convert? ");
        double inputTemp = Double.parseDouble(scanner.nextLine());

        System.out.print("Is your input temperature in F or C? ");
        String farOrCel = (scanner.nextLine());

//        System.out.print("Is your input temperature in F or C?");
//        boolean farOrCel = (scanner.nextLine());
        // ^^ is this ok, or should it be a string?

        double celToFar = ((inputTemp - 32) / 1.8);
        double farToCel = (inputTemp * 1.8 + 32);

        if (Objects.equals(farOrCel, "F")) {
            System.out.printf("%.2f F is %.2f in C", inputTemp,farToCel);
        }
        if (Objects.equals(farOrCel, "C")) {
            System.out.printf("%.2f C is %.2f in F", inputTemp,farToCel);
        }







    }

}
