package com.techelevator;

import java.io.File;
import java.util.Scanner;

public class CreateAFolder {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("what is the name of the folder to create?");
        String path = userInput.nextLine();

        File f = new File(path);
        if (f.exists()) {
            System.out.println("that folder already exists");
        } else {
            if(f.mkdir()) {
                System.out.println("folder created");
                System.out.printf("@ %s", f.getAbsolutePath());
            } else {
                System.out.println("sorry...could not create the folder");
            }
        }
    }
}
