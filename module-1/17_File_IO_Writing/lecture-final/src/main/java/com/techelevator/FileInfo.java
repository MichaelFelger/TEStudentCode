package com.techelevator;

import java.io.File;
import java.util.Scanner;

public class FileInfo {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("enter the name of the file or folder");
        String path = userInput.nextLine();

        File f = new File(path);
        if (f.exists()) {
            System.out.printf("name: %s\n", f.getName());
            System.out.printf("path: %s\n", f.getAbsolutePath());
            if (f.isFile()) {
                System.out.println("is a file");
                System.out.printf("size: %s", f.length());
            } else {
                System.out.println("is a folder");
            }
        } else {
            System.out.printf("%s does not exists", path);
        }
    }
}
