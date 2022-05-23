package com.techelevator;

import java.util.Locale;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */

		/* create an new instance of String using a literal */

		String myString = "hello world";
		String myString2 = new String("hello world");
			// ^^ these 2 lines are effectively the same, but you'll only use the first line irl

		
		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();

		System.out.println(myString.length());
			// will return 11 (hello world)
			// if needed, one could loop on the length of a string, just like on an array
		System.out.println(myString.substring(6));
			// will return world  (6th character forward to end of string)
		System.out.println(myString.substring(6,7));
			// will return w (exclusive of 7th character)
		System.out.println(myString.substring(6,6));
			// returns nothing
		System.out.println(myString.substring(6,2000));
			// throws error out of reference

		System.out.println(myString.indexOf("wor"));
			// returns 6 because "wor" starts at index 6 - returns only the first instance of "wor"
			// maybe because you want to operate on this
		// System.out.println(myString.substring("xx"));
			// returns -1 for doesn't have
		System.out.println(myString.charAt(6));
			// returns 'w' -which is a char, not a string - string would be "w" whereas char is 'w'
		System.out.println(myString.toLowerCase().indexOf("hello"));
			// can use to search for case sensitive - will lowercase everything so if original was Hello, it would still find it
		System.out.println(myString.contains("world"));
			// returns case sensitive true or false


		// consider immutability -- when using .replace, original string is immutable, and can only create a new string
		//  ^^^^^^^^^^^^^^^^^^^

		// consider whether you can use ! for the opposite of what the methods do
		// i.e. !myString.contains  -- when would this be necessary?  result will already be boolean...

		// DONT USE == when comparing strings
		// (that's comparing the value on the stack only, not the contents of the string, which are on the heap)
		// so you need to use the .equals method to compare the contents
		// another useful related call is .equalsIgnoreCase

		/* Other commonly used methods:
		 *
		 * endsWith
		 * startsWith
		 * indexOf
		 * lastIndexOf
		 * length
		 * substring
		 * toLowerCase
		 * toUpperCase
		 * trim
		 */



		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();

        char[] helloArray = new char[] { 'H', 'e', 'l', 'l', 'o' };
        String hello1 = new String(helloArray);
        String hello2 = new String(helloArray);

		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */
		if (hello1 == hello2) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

		String hello3 = hello1;
		if (hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}

		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */
		if (hello1.equals(hello2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

	}
}
