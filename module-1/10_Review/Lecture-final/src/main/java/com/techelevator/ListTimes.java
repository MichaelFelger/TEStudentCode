package com.techelevator;

import java.util.List;

public class ListTimes {
    public static void main(String[] args) {

    }

    //    Given a List of Integers, and an int value, return true if the int value appears two or more times in
    //    the list.
    public static boolean foundIntTwice(List<Integer> integerList, int intToFind) {
        return integerList.indexOf(intToFind) != integerList.lastIndexOf(intToFind);
    }

}
