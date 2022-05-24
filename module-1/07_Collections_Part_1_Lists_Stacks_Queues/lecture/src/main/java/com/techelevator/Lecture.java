package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

		List<Integer> myInts = new ArrayList<>();
		//   ^^^compiler knows this is here ^^ in the <> aka diamond operator
		// ArrayList abides my the contract that's in the List interface
		// take a look at differences between lists, arraylists, and linkedlists
		// ArrayList is a class, and when you "new" it up aka instantiate it, then it's an object
		// arraylists and linkedlists will abide by list and do some additional work under the hood
		myInts.add(1);
		// being able to just add 1 (primitive data type) here is an example of "autoboxing" done by wrapper Integer,
		// which is built into the list
		myInts.add(4);
		myInts.add(3);
		myInts.add(2);


		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		for (int index = 0; index < myInts.size(); index++) {
			System.out.println(myInts.get(index));
		}


		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		myInts.add(4);
		for (int index = 0; index < myInts.size(); index++) {
			System.out.println(myInts.get(index));
		}


		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		myInts.add(1,4);
		for (int index = 0; index < myInts.size(); index++) {
			System.out.println(myInts.get(index));
		}

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		myInts.remove(3);
		for (int index = 0; index < myInts.size(); index++) {
			System.out.println(myInts.get(index));
		}

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

		System.out.println(myInts.contains(4)); //returns true or false
		System.out.println(myInts.contains(9));

		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		int first = myInts.indexOf(4); // returns index of first item in the list
		System.out.println(first);

		int last = myInts.lastIndexOf(4); // returns index of last item in the list
		System.out.println(last);

		// if first indexOf and lastIndexOf are the same, then there is only 1 copy of the item


		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		Integer[] myArray = myInts.toArray(new Integer[0]);
		//                     don't worry about this ^^^ 0 too much - this is just baked in to Java to work
		//  you have to give it a 0 length array and the kind of array you want - in this case an array of Integers
		//  makes a COPY of what's in the list into an array or appropriate length
		for (int index = 0; index < myArray.length; index++) {
			System.out.println(myArray[index]);
		}

		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");
		Collections.sort(myInts); // this is MUTATING the sequence of the elements in the list
		for (int index = 0; index < myInts.size(); index++) {
			System.out.println(myInts.get(index));
		}

		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");
		Collections.reverse(myInts); // this is MUTATING the sequence of the elements in the list
		for (int index = 0; index < myInts.size(); index++) {
			System.out.println(myInts.get(index));
		}
		// can also use COMPARATOR to order things in a way that you want
		//  if you want a sorted copy of a list, you'd 1) copy the list 2) sort the copy

		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		// can be used Lists, Arrays, or anything that is considered 'innumerable'
		// this could be considered an enhanced loop, or just one to use for some simpler tasks

		for (int index = 0; index < myInts.size(); index++) {
			System.out.println(myInts.get(index));
		}
		for (Integer anint : myInts) {
			// will iterate myInts, and at each step, value of that index will be put into our variable
			// and make it available in this block
			System.out.println("next item");
			System.out.println(anint);

		}
		for (int myInt : myArray) {
			System.out.println("myInt below");
			System.out.println(myInt);
		}


	}
}
