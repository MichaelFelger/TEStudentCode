package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Weave {
    public static void main(String[] args) {

        List<Integer> one = new ArrayList<>();
        one.add(1);

        List<Integer> two = new ArrayList<>();
        two.add(4);
        two.add(5);
        two.add(6);

        List<Integer> result = interleaveLists(one, two);
        System.out.println(result);

    }

    /*
	 Given two lists of Integers, interleave them beginning with the first element in the first list followed
	 by the first element of the second. Continue interleaving the elements until all elements have been interwoven.
	 Return the new list. If the lists are of unequal lengths, simply attach the remaining elements of the longer
	 list to the new list before returning it.
	 interleaveLists( [1, 2, 3], [4, 5, 6] )  ->  [1, 4, 2, 5, 3, 6]
	 */
    public static List<Integer> interleaveLists(List<Integer> listOne, List<Integer> listTwo) {
        List<Integer> results = new ArrayList<>();

        int shotSize = listOne.size();
        if (listTwo.size() < listOne.size()) {
            shotSize = listTwo.size();
        }

        for(int index = 0; index < shotSize; index++) {
            results.add(listOne.get(index));
            results.add(listTwo.get(index));
        }

        List<Integer> longList = (listOne.size() > listTwo.size()) ? listOne : listTwo;
//        if (listOne.size() > listTwo.size()) {
//            longList = listOne;
//        } else {
//            longList = listTwo;
//        }

        for (int index = shotSize; index < longList.size(); index++) {
            results.add(longList.get(index));
        }


        return results;
    }

}
