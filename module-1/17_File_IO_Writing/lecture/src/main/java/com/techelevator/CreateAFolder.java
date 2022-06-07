package com.techelevator;

import java.io.File;
import java.util.Scanner;

public class CreateAFolder {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What shall we call the new folder?");
        String path = userInput.nextLine();

        File f = new File(path);
        if (f.exists()) {
            System.out.println("Folder already exists");
        } else {
            if (f.mkdir()) {
                System.out.println("Folder created");
                System.out.println("path:" + f.getAbsolutePath());
            } else {
                System.out.println("Sorry...couldn't create the new folder qqq");
            }
        }

    }
}
