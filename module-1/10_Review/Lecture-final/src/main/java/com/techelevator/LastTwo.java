package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class LastTwo {
    public static void main(String[] args) {
        System.out.println(LastTwo.last2("hixxhi"));
        System.out.println(LastTwo.last2("xaxxaxaxx"));
        System.out.println(LastTwo.last2("axxxaaxx"));
        System.out.println(LastTwo.last2(""));
        System.out.println(LastTwo.last2(null));

        String[] words = {"hixxhi", "axxxaaxx"};
        System.out.println(LastTwo.last2Revisited(words));

    }

    /*
	 Given a string, return the count of the number of times that a substring length 2 appears in the string and
	 also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
	 last2("hixxhi") → 1
	 last2("xaxxaxaxx") → 1
	 last2("axxxaaxx") → 2
	 */
    public static int last2(String str) {
        int count = 0;

        if (str == null || str.length() < 2) {
            return count;
        }

        String lastTwo = str.substring(str.length()-2);
        for(int index = 0; index < str.length()-2; index++) {
            if(str.substring(index, index+2).equals(lastTwo)) {
                count++;
            }
        }

        return count;
    }

    /*
     * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
     *
     * Given an array of Strings, for each String, the count of the number of times that a subString length 2 appears
     * in the String and also as the last 2 chars of the String, so "hixxxhi" yields 1.
     *
     * We don't count the end subString, but the subString may overlap a prior position by one.  For instance, "xxxx"
     * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
     * end subString, which we don't count.
     *
     * Return Map<String, Integer>, where the key is String from the array, and its last2 count.
     *
     * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
     *
     */
    public static Map<String, Integer> last2Revisited(String[] words) {

        Map<String, Integer> counts = new HashMap<>();

        for (String word : words) {
            counts.put(word, LastTwo.last2(word));
        }

        return counts;
    }



}
