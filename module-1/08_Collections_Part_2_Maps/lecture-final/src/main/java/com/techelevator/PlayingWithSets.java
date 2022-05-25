package com.techelevator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PlayingWithSets {
    public static void main(String[] args) {

        Set<Integer> myset = new HashSet<>();
        myset.add(2);
        myset.add(3);
        myset.add(4);
        System.out.println(myset.add(4));

        for(Integer value  : myset) {
            System.out.println(value);
        }

        myset.add(1);
        for(Integer value  : myset) {
            System.out.println(value);
        }

        System.out.println("===========");
        myset.remove(4);

        for(Integer value  : myset) {
            System.out.println(value);
        }

        System.out.println("does 3 exist?" + myset.contains(3));

        Set<Integer> anotherSet = new HashSet<>();
        anotherSet.add(1);
        anotherSet.add(2);
        anotherSet.add(3);

        System.out.println("are they the same? " + myset.equals(anotherSet));

        anotherSet.add(4);
        System.out.println("are they still the same? " + myset.equals(anotherSet));

        System.out.println("===========");
        anotherSet.addAll(Arrays.asList(6,7,8,9));
        for(Integer value  : anotherSet) {
            System.out.println(value);
        }



    }
}
