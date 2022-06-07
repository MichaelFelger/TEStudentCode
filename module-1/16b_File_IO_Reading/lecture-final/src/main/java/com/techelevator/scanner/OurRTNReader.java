package com.techelevator.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OurRTNReader {
    public static void main(String[] args)  {

//        File file = new File("rtn.txt");
//        try(Scanner scanner = new Scanner(file);
//            Scanner scan = new Scanner("hello")) {
//            while (scanner.hasNextLine()) {
//                String input = scanner.nextLine();
//                System.out.println(input);
//            }
//        } catch (FileNotFoundException fnf) {
//            System.out.println("can't find the file");
//        }

        String[] parts = "one|two|three".split("\\|");
        for (String part : parts) {
            System.out.println(part);
        }


    }
}

