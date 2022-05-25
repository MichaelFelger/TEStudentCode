package com.techelevator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

		Map<String, Integer> mymap = new HashMap<>();
		mymap.put("A", 100);
		mymap.put("B", 90);
		mymap.put("C", 80);

		System.out.println("retrieving 'A' " + mymap.get("A"));
		System.out.println("retrieving 'Z' " + mymap.get("Z"));

		System.out.println("does 'A' exist? " + mymap.containsKey("A"));

		System.out.println("==============");
		for (String key :  mymap.keySet()) {
			System.out.println(key);
		}

		mymap.remove("C");
		System.out.println("==============");
		for (String key :  mymap.keySet()) {
			System.out.println(key);
		}

		System.out.println("==============");
		for (Map.Entry<String, Integer> entry : mymap.entrySet()) {
			System.out.printf("Key: %s Value: %s\n", entry.getKey(), entry.getValue());
		}

		mymap.put("C", 60);
		System.out.println("==============");
		for (Map.Entry<String, Integer> entry : mymap.entrySet()) {
			System.out.printf("Key: %s Value: %s\n", entry.getKey(), entry.getValue());
		}

		mymap.put("C", 70);
		System.out.println("==============");
		for (Map.Entry<String, Integer> entry : mymap.entrySet()) {
			System.out.printf("Key: %s Value: %s\n", entry.getKey(), entry.getValue());
		}

		mymap.put("C", mymap.get("C") + 1);
		System.out.println("==============");
		for (Map.Entry<String, Integer> entry : mymap.entrySet()) {
			System.out.printf("Key: %s Value: %s\n", entry.getKey(), entry.getValue());
		}

		System.out.println("Number of items: " + mymap.size());
		System.out.println("is empty" + mymap.isEmpty() );

//		Map<String, List<Integer>> anotherList = new HashMap<>();

		System.out.println("==============");
		Map<String, Integer> anotherMap = new HashMap<>();
		anotherMap.put("A", 100);
		anotherMap.put("B", 90);
		anotherMap.put("C", 70);

		System.out.println("are the same?" + mymap.equals(anotherMap));

		System.out.println("==============");
		anotherMap.put("C", 71);
		System.out.println("are the same now?" + mymap.equals(anotherMap));

		System.out.println("==============");
		anotherMap.put("D", 60);
		System.out.println("are the same now after new key?" + mymap.equals(anotherMap));

//		Map<String, Map<String, Integer>> oneMoreMap = new HashMap<>();
//		Map<String, Integer> innerMap = oneMoreMap.get("A");
//		innerMap.get("Z");
//
//		Integer theInnerValue = oneMoreMap.get("A").get("Z");

		String theKey = "HeLlO wOrLD";
		mymap.put(theKey.toLowerCase(), 0);

		System.out.println("==============");
		String theRequestedKey = "HELLO WORLD";
		System.out.println("does the key exist? " + mymap.containsKey(theRequestedKey));

		System.out.println("==============");
		System.out.println("does the key exist? " + mymap.containsKey(theRequestedKey.toLowerCase()));

	}

}
