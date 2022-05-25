package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Brackets {

    public static void main(String[] args) {

        Brackets b = new Brackets();
//        System.out.println(b.isBalanced(""));
//        System.out.println(b.isBalanced("("));
//        System.out.println(b.isBalanced("()"));
        System.out.println(b.isBalanced("([])"));
        System.out.println(b.isBalanced("([{}])"));

    }

    public boolean isBalanced(String input) {

        Stack<Character> brackets = new Stack<>();
        Map<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put(')', '(');
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');
        bracketMap.put('>', '<');

        for (int index = 0; index < input.length(); index++) {

            Character theCharacter = input.charAt(index);

            if (brackets.isEmpty()) {
                brackets.push(theCharacter);
            } else if (bracketMap.get(theCharacter) == brackets.peek()) {
                brackets.pop();
            } else {
                brackets.push(theCharacter);
            }
        }

        return brackets.isEmpty();
    }

}
