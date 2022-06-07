package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileSplitter {

	//  Whiteboarded and completed as a group with John and Austin

	public static void main(String[] args) {
		int counter = 1;
		int numberOfLines;
		int pathCounter = 1;
		String path;
		String line;
		String outputPath;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please provide a file path");
		path = scanner.nextLine();
		System.out.println("Please provide number of lines per file");
		numberOfLines = scanner.nextInt();

		File file = new File(path);

		try {
			Scanner readOnly = new Scanner(file);
//			outputPath = path + "-" + pathCounter;
//			File outputFile = new File(outputPath);
			while (readOnly.hasNextLine()) {
				FileOutputStream fos = new FileOutputStream(new File(path + "-" + pathCounter + ".txt"));
				PrintWriter writer = new PrintWriter(fos);
				while (counter <= numberOfLines){
					line = readOnly.nextLine();
					writer.println(line);
					counter++;
				}
				counter = 1;
				pathCounter++;
				writer.close();
			}
		} catch (FileNotFoundException fnf) {
			System.out.println("file not found");
		} catch (Exception ex) {
			System.out.println("error");
		}


	}

}
