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

		String myString = "Hello world";
		String myString2 = new String("Hello world"); // you'll rarely use this

		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();

		System.out.println(myString.length());
		System.out.println(myString.substring(6));
		System.out.println(myString.substring(6,7));
		System.out.println(myString.substring(6,myString.length()-1));

		System.out.println(myString.indexOf("wor"));
		System.out.println(myString.indexOf("xx"));
		System.out.println(myString.indexOf("hello"));
		System.out.println(myString.toLowerCase().indexOf("hello"));
		System.out.println(myString.toUpperCase());

		System.out.println(myString.charAt(6));
		System.out.println(myString.contains("hello"));
		System.out.println(myString.contains("Hello"));

		System.out.println(myString.startsWith("He"));

		String myString3 = myString.replace("Hello", "goodbye");
		System.out.println(myString3);
		System.out.println(myString);

		System.out.println(myString == myString2);
		System.out.println(myString.equals(myString2));
		System.out.println(myString.equalsIgnoreCase(myString2));
		System.out.println(myString.compareTo(myString2));

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

//		System.out.println();
//		System.out.println("**********************");
//		System.out.println("****** EQUALITY ******");
//		System.out.println("**********************");
//		System.out.println();
//
//        char[] helloArray = new char[] { 'H', 'e', 'l', 'l', 'o' };
//        String hello1 = new String(helloArray);
//        String hello2 = new String(helloArray);
//
//		/* Double equals will compare to see if the two variables, hello1 and
//		 * hello2 point to the same object in memory. Are they the same object? */
//		if (hello1 == hello2) {
//			System.out.println("They are equal!");
//		} else {
//			System.out.println(hello1 + " is not equal to " + hello2);
//		}
//
//		String hello3 = hello1;
//		if (hello1 == hello3) {
//			System.out.println("hello1 is the same reference as hello3");
//		}
//
//		/* So, to compare the values of two objects, we need to use the equals method.
//		 * Every object type has an equals method */
//		if (hello1.equals(hello2)) {
//			System.out.println("They are equal!");
//		} else {
//			System.out.println(hello1 + " is not equal to " + hello2);
//		}

	}
}
