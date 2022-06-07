package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Scanner;

public class WritingToFile {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("what is the name of the file?");
        String fileName = userInput.nextLine();

        File file = new File(fileName);
        try {
            FileOutputStream fos = new FileOutputStream(file, true);  // appending boolean true, ordering Java to append the file
            PrintWriter writer = new PrintWriter(fos);
            writer.printf("current time is %s\n", LocalDateTime.now());
            writer.close();
        }
        catch (FileNotFoundException nfn) {
            System.out.println("file not found");
        }
        // while writing to a file, if you see stuff missing from end of file, it's stuck in the buffer
        // then you need to flush out buffer so it gets writter
        // could be not closing Scanner, or Writer or something like that

    }
}
