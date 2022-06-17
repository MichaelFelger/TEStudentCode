package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Module1CodingAssessment {



    public static void main(String[] args) {
        // TODO Auto-generated method stub
		Car car = new Car();
//		System.out.println(car.toString());

        File file = new File("C:\\Users\\Student\\workspace\\michael-felger-student-code\\module-1\\assessment\\CarInput.csv");
        List<String> carList = new ArrayList<>();
        try (Scanner carDataInput = new Scanner(file)) {
            while (carDataInput.hasNextLine()) {
                String itemLine = carDataInput.nextLine();
                String[] carArray = itemLine.split(",");
                int carYear = Integer.parseInt(carArray[0]);
                String carMake = carArray[1];
                boolean carClassic = Boolean.parseBoolean(carArray[2]);
                carList.add (carYear, carMake, carClassic); // problem with boolean
            }

        } catch (FileNotFoundException fnf) {
            System.out.println("File not found");
        }
        int agesAdded = 0;
        for (int i = 0; i < carList.size(); i++) {
            agesAdded += car.getAge();
        }
        System.out.println(agesAdded);
    }
}