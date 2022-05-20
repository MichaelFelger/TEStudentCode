package com.techelevator;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name:");
        String name = scanner.nextLine();

        System.out.print("how old are you?");
        String ageAsString = scanner.nextLine();
        int age = Integer.parseInt(ageAsString);

        String greeting = String.format("Hi %s. you are %-12s <<<", name, age);
        System.out.println(greeting);

    }
}
