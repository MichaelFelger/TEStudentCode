package com.techelevator;

public class Exercises {

	/*
	 Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
	 helloName("Bob") → "Hello Bob!"
	 helloName("Alice") → "Hello Alice!"
	 helloName("X") → "Hello X!"
	 */
	public String helloName(String name) {
		String helloName = ("Hello " + name + "!");
		return helloName;
	}

	/*
	 Given two strings, a and b, return the result of putting them together in the order abba,
	 e.g. "Hi" and "Bye" returns "HiByeByeHi".
	 makeAbba("Hi", "Bye") → "HiByeByeHi"
	 makeAbba("Yo", "Alice") → "YoAliceAliceYo"
	 makeAbba("What", "Up") → "WhatUpUpWhat"
	 */
	public String makeAbba(String a, String b) {
		String answer = a + b + b + a;
		return answer;
	}

	/*
	 The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example,
	 the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the
	 HTML string with tags around the word, e.g. "<i>Yay</i>".
	 makeTags("i", "Yay") → "<i>Yay</i>"
	 makeTags("i", "Hello") → "<i>Hello</i>"
	 makeTags("cite", "Yay") → "<cite>Yay</cite>"
	 */
	public String makeTags(String tag, String word) {
		String tagWordTag = "<" + tag + ">" + word + "</" + tag + ">";
		return tagWordTag;
	}

	/*
	 Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the
	 middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting
	 at index i and going up to but not including index j.
	 makeOutWord("<<>>", "Yay") → "<<Yay>>"
	 makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
	 makeOutWord("[[]]", "word") → "[[word]]"
	 */
	public String makeOutWord(String out, String word) {
		String makeOutWord = (out.substring(0, 2)) + word + (out.substring(2));
		return makeOutWord;
	}


	/*
	 Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string
	 length will be at least 2.
	 extraEnd("Hello") → "lololo"
	 extraEnd("ab") → "ababab"
	 extraEnd("Hi") → "HiHiHi"
	 */
	public String extraEnd(String str) {
		String extraEnd = (str.substring(str.length() - 2)) + (str.substring(str.length() - 2)) + (str.substring(str.length() - 2));
		return extraEnd;
	}

	/*
	 Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the
	 string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string ""
	 yields the empty string "". Note that str.length() returns the length of a string.
	 firstTwo("Hello") → "He"
	 firstTwo("abcdefg") → "ab"
	 firstTwo("ab") → "ab"
	 */
	public String firstTwo(String str) {
		if (str.length() < 2) {
			return str;
		} else return (str.substring(0, 2));
	}

	/*
	 Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
	 firstHalf("WooHoo") → "Woo"
	 firstHalf("HelloThere") → "Hello"
	 firstHalf("abcdef") → "abc"
	 */
	public String firstHalf(String str) {
		int excluder = str.length() / 2;
		String firstHalf = str.substring(0, excluder);
		return firstHalf;
	}

	/*
	 Given a string, return a version without the first and last char, so "Hello" yields "ell".
	 The string length will be at least 2.
	 withoutEnd("Hello") → "ell"
	 withoutEnd("java") → "av"
	 withoutEnd("coding") → "odin"
	 */
	public String withoutEnd(String str) {
		String wOB = str.substring(1);
		int lastIndex = wOB.length() - 1;
		String wOE = wOB.substring(0, lastIndex);
		return wOE;
	}

	/*
	 Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string
	 on the outside and the longer string on the inside. The strings will not be the same length, but
	 they may be empty (length 0).
	 comboString("Hello", "hi") → "hiHellohi"
	 comboString("hi", "Hello") → "hiHellohi"
	 comboString("aaa", "b") → "baaab"
	 */
	public String comboString(String a, String b) {
		if (a.length() < b.length()) {
			return a + b + a;
		} else return b + a + b;

	}

	/*
	 Given 2 strings, return their concatenation, except omit the first char of each. The strings will
	 be at least length 1.
	 nonStart("Hello", "There") → "ellohere"
	 nonStart("java", "code") → "avaode"
	 nonStart("shotl", "java") → "hotlava"
	 */
	public String nonStart(String a, String b) {
		String nonStart = a.substring(1) + b.substring(1);
		return nonStart;
	}

	/*
	 Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
	 The string length will be at least 2.
	 left2("Hello") → "lloHe"
	 left2("java") → "vaja"
	 left2("Hi") → "Hi"
	 */
	public String left2(String str) {
		String firstTwo = str.substring(0, 2);
		String left2 = str.substring(2) + firstTwo;
		return left2;
	}

	/*
	 Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
	 The string length will be at least 2.
	 right2("Hello") → "loHel"
	 right2("java") → "vaja"
	 right2("Hi") → "Hi"
	 */
	public String right2(String str) {
		String lastTwo = str.substring(str.length() - 2);
		String right2 = lastTwo + (str.substring(0, str.length() - 2));
		return right2;
	}

	/*
	 Given a string, return a string length 1 from its front, unless front is false, in which case
	 return a string length 1 from its back. The string will be non-empty.
	 theEnd("Hello", true) → "H"
	 theEnd("Hello", false) → "o"
	 theEnd("oh", true) → "o"
	 */
	public String theEnd(String str, boolean front) {
		if (front) {
			return str.substring(0, 1);
		} else return str.substring(str.length() - 1);
	}

	/*
	 Given a string, return a version without both the first and last char of the string. The string
	 may be any length, including 0.
	 withoutEnd2("Hello") → "ell"
	 withoutEnd2("abc") → "b"
	 withoutEnd2("ab") → ""
	 */
	public String withoutEnd2(String str) {
		if (str.length() < 2) {
			return "";
		} else return str.substring(1, str.length() - 1);
	}

	/*
	 Given a string of even length, return a string made of the middle two chars, so the string "string"
	 yields "ri". The string length will be at least 2.
	 middleTwo("string") → "ri"
	 middleTwo("code") → "od"
	 middleTwo("Practice") → "ct"
	 */
	public String middleTwo(String str) {
		int middle = str.length() / 2;
		return str.substring(middle - 1, middle + 1);
	}

	/*
	 Given a string, return true if it ends in "ly".
	 endsLy("oddly") → true
	 endsLy("y") → false
	 endsLy("oddy") → false
	 */
	public boolean endsLy(String str) {
		if (str.endsWith("ly")) {
			return true;
		} else return false;
	}

	/*
	 Given a string and an int n, return a string made of the first and last n chars from the string. The
	 string length will be at least n.
	 nTwice("Hello", 2) → "Helo"
	 nTwice("Chocolate", 3) → "Choate"
	 nTwice("Chocolate", 1) → "Ce"
	 */
	public String nTwice(String str, int n) {

		return str.substring(0, n) + str.substring(str.length() - (n));
	}

	/*
	 Given a string and an index, return a string length 2 starting at the given index. If the index is
	 too big or too small to define a string length 2, use the first 2 chars. The string length will be
	 at least 2.
	 twoChar("java", 0) → "ja"
	 twoChar("java", 2) → "va"
	 twoChar("java", 3) → "ja"
	 */
	public String twoChar(String str, int index) {
		if (index < 1) {
			return str.substring(0, 2);
		} else if (index > str.length()) {
			return str.substring(0, 2);
		} else if (index + 2 > str.length()) {
			return str.substring(0, 2);
		} else return str.substring(index, index + 2);

	}

	/*
	 Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
	 The string length will be at least 3.
	 middleThree("Candy") → "and"
	 middleThree("and") → "and"
	 middleThree("solving") → "lvi"
	 */
	public String middleThree(String str) {
		int middle = (str.length() + 1) / 2;
		return str.substring(middle - 2, middle + 1);
	}

	/*
	 Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with
	 "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals()
	 to compare 2 strings.
	 hasBad("badxx") → true
	 hasBad("xbadxx") → true
	 hasBad("xxbadxx") → false
	 */
	public boolean hasBad(String str) {

		// I know this is ugly code, but it will work for letters other than x, too :)
		// I might have made this harder than it was supposed to be :(

		if (str.equals("bad")) {
			return true;
		}
		if (str.length() <= 3) {
			return false;
		} else if (str.substring(0, 3).contains("bad")) {
			return true;
		} else if (str.substring(1, 4).contains("bad")) {
			return true;
		} else return false;
	}


	/*
	 Given a string and a non-negative int n, return a larger string that is n copies of the original string.
	 stringTimes("Hi", 2) → "HiHi"
	 stringTimes("Hi", 3) → "HiHiHi"
	 stringTimes("Hi", 1) → "Hi"
	 */
	public String stringTimes(String str, int n) {
//		return str.repeat(n);

		// I tried to run this is as a for loop running through an array of n indexes and concatenating the results,
		// but I kept getting too many or too few copies by 1

		// nevermind, got some help from Conor

		String stringTimes = "";
		for (int i = 0; (i < n); i++) {
			stringTimes = stringTimes.concat(str);
		}
		return stringTimes;
	}


	/*
	 Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or
	 whatever is there if the string is less than length 3. Return n copies of the front;
	 frontTimes("Chocolate", 2) → "ChoCho"
	 frontTimes("Chocolate", 3) → "ChoChoCho"
	 frontTimes("Abc", 3) → "AbcAbcAbc"
	 */
	public String frontTimes(String str, int n) {
		String fronts;
		if (str.length() < 3) {
			fronts = str.substring(0, str.length());
			return fronts.repeat(n);
		} else
			fronts = str.substring(0, 3);
		return fronts.repeat(n);
	}

	/*
	 Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
	 countXX("abcxx") → 1
	 countXX("xxx") → 2
	 countXX("xxxx") →
	 */
	public int countXX(String str) {
		int indexXX = 0;
		for (int i = 0; i < str.length()-1; i++) {
			if (str.substring(i, i + 2).equals("xx")) {
				indexXX++;
		}

		}
		return indexXX;
	}

	/*
	 Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
	 doubleX("axxbb") → true
	 doubleX("axaxax") → false
	 doubleX("xxxxx") → true
	 */
	public boolean doubleX(String str) {
		int firstX = str.indexOf("x");
		if (firstX >= str.length() - 1) {
			return false;
		}
		if (str.substring(firstX + 1, firstX + 2).equals("x")) {
			return true;
		}
		return false;
	}

	/*
	 Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
	 stringBits("Hello") → "Hlo"
	 stringBits("Hi") → "H"
	 stringBits("Heeololeo") → "Hello"
	 */
	public String stringBits(String str) {
		String stringBits = "";
		for (int i = 0; i < str.length(); i += 2) {
			char even = (str.charAt(i));
			stringBits = stringBits.concat(String.valueOf(even));
		}
		return stringBits;
	}  	// this one gave me some trouble - I knew I needed to get the values of the
		// characters at even indexes - had to do some searching, but found that .charAt and String.valueOf
		// could get me the string/char data that was stored in even indexes


	/*
	 Given a non-empty string like "Code" return a string like "CCoCodCode".
	 stringSplosion("Code") → "CCoCodCode"
	 stringSplosion("abc") → "aababc"
	 stringSplosion("ab") → "aab"
	 */
	public String stringSplosion(String str) {
		int movingIndex = 1;
		String stringSplosion = "";
//		for (int i = 0; i <= 100000; i++)  {
		while (movingIndex <= str.length()) {
			stringSplosion = str.substring(0,1)+str.substring(0,2);
			movingIndex++;
			return stringSplosion;
		}
		// consider decrement and using while loop - again didn't ahve time to finish

		return null;
	}

	/*
	 Given a string, return the count of the number of times that a substring length 2 appears in the string and
	 also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
	 last2("hixxhi") → 1
	 last2("xaxxaxaxx") → 1
	 last2("axxxaaxx") → 2
	 */
	public int last2(String str) {
		return 0;
	} // decided to spend time working on other stuff

	/*
	 Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end
	 should not be removed.
	 stringX("xxHxix") → "xHix"
	 stringX("abxxxcd") → "abcd"
	 stringX("xabxxxcdx") → "xabcdx"
	 */
	public String stringX(String str) {
		String byeMiddleX = "";
		for (int i = 1; i < str.length()-1; i++) {
			byeMiddleX = "";
		}
		return byeMiddleX;
	} // ran out of time here

	/*
	 Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
	 altPairs("kitten") → "kien"
	 altPairs("Chocolate") → "Chole"
	 altPairs("CodingHorror") → "Congrr"
	 */
	public String altPairs(String str) {
		String kittyString = "";
		for (int i = 0; i < str.length(); i += 4) {
			kittyString += str.subSequence(i, i+1);
			if (i < str.length()-1) {
				kittyString += str.subSequence(i+1, i+2);
			}
		}
		return kittyString;
	}

	/*
	 Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed.
	 The "yak" strings will not overlap.
	 stringYak("yakpak") → "pak"
	 stringYak("pakyak") → "pak"
	 stringYak("yak123ya") → "123ya"
	 */
	public String stringYak(String str) {
		String noYaks = str.replaceAll("yak", "");
		return noYaks;
	}

}
