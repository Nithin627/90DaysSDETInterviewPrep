package com.codingquetions;

import java.util.HashSet;
import java.util.Set;

public class StringPangram {

	public static void main(String[] args) {
		// if string Pangram -> It should have min 26 letters or length >= 26
		String input = "The quick brown fox jumps over the lazy dog";
		input = input.toLowerCase();
		boolean result = isPangram(input);
//		boolean result = false;

		if (result) {
			System.out.println("Its a Pangram");
		} else {
			System.out.println("Its not a Pangram");
		}

		boolean result2 = isPangramWithCollection(input);
		if (result2) {
			System.out.println("Its a Pangram");
		} else {
			System.out.println("Its not a Pangram");
		}

	}

	private static boolean isPangram(String input) {

		if (input.length() < 26) {
			return false;
		}

		for (char i = 'a'; i <= 'z'; i++) {
//			System.out.println(i);
			if (input.indexOf(i) < 0) {
				return false;
			}
		}

		return true;
	}

	private static boolean isPangramWithCollection(String input) {

		Set<Character> charSet = new HashSet<Character>();

		char[] inputArray = input.toCharArray();

		for (char c : inputArray) {
			if (Character.isLetter(c)) {

				charSet.add(c);

			}
		}

		if (charSet.size() == 26) {
			return true;
		}

		return false;

	}

}
