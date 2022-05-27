package com.techelevator;

public class StringS {
    public static void main(String[] args) {
        System.out.println(stringSplosion("Code"));
    }

    /*
 Given a non-empty string like "Code" return a string like "CCoCodCode".
 stringSplosion("Code") → "CCoCodCode"
 stringSplosion("abc") → "aababc"
 stringSplosion("ab") → "aab"
 */
    public static String stringSplosion(String str) {
        String result = "";
        for (int index = 0; index < str.length(); index++) {
            result += str.substring(0, index + 1);
        }
        return result;
    }

}
