package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class FileFun {

    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("doesnotexist.txt");
        FileOutputStream fos = new FileOutputStream(f, false);
        PrintWriter writer = new PrintWriter(fos);

    }
}
