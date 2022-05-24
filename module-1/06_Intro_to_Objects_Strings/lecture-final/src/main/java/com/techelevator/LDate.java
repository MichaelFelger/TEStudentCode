package com.techelevator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LDate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate mybirthday = LocalDate.of(2000, 2, 28);

//        mybirthday.compareTo()
        System.out.println(today.isAfter(mybirthday));

        LocalDate tomorrow = today.plusDays(1);
        LocalDate endOfJan = LocalDate.of(2022, 01, 31);
        System.out.println(endOfJan.plusMonths(1));;
        System.out.println(endOfJan.plusMonths(2));;
        System.out.println(today.format(DateTimeFormatter.ISO_DATE));
        System.out.println(today.format(DateTimeFormatter.ofPattern("yyyy MM dd")));
        System.out.println(today.format(DateTimeFormatter.ofPattern("yyyy MMM dd")));
        System.out.println(today.format(DateTimeFormatter.ofPattern("yyyyMMdd")));
    }
}
