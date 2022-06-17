package src.main.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GuestList {
    private File file;
    private Map<String, Double> guestListMap = new HashMap<>();

    GuestList() {
    this.file = new File("C:\\Users\\Student\\workspace\\michael-felger-student-code\\module-1\\assessment-practice\\HotelInput.csv");
        try (Scanner dataInput = new Scanner(file)) {
            while (dataInput.hasNextLine()) {
                String itemLine = dataInput.nextLine();
                String[] itemArray = itemLine.split("\\|");
                String nameOfGuest = itemArray[0];
                String lengthOfStay = itemArray[1];
                guestListMap.put(nameOfGuest,Double.parseDouble(lengthOfStay));
            }
        } catch (FileNotFoundException fnf) {
            System.out.println("File not found");
        }


    }

}
