package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class FileFun {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("fakefile.txt");
        FileOutputStream fos = new FileOutputStream(file, true); //this is a stream TO something
        PrintWriter writer = new PrintWriter(fos);

    }
}
