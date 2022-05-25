package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.List;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("A", 100);
		myMap.put("B", 90);
		myMap.put("C", 80);

		System.out.println("retrieving A "  + myMap.get("A"));
		System.out.println("retrieving Z " + myMap.get("Z"));

		System.out.println("does 'A' exist? " + myMap.containsKey("A"));

		myMap.keySet();
		// can iterate through keys if one needs to, but they won't be in order
		System.out.println("**************");
		for (String key : myMap.keySet()) {
			System.out.println(key);
		}

		myMap.remove("C");
		System.out.println(myMap);
		for (String key : myMap.keySet()) {
			System.out.println(key);
		}

		myMap.put("C", 60);
		for (Map.Entry<String,Integer> entry : myMap.entrySet()) {
			System.out.printf("Key: %s Value: s%\n", entry.getKey(), entry.getValue());
		}

		myMap.put("C", 70);

	//	Map<String, List<Integer>> anotherList = new HashMap<>();
		//              ^^^
		// so you can get complex data structures by using other data types for the value
		// you could do the same with the keys, but we aren't really going to here
		// this is going to be a multi-step process to access the data


	}

}
