package com.codingquetions;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharInStringMaintainInsertionOrder {
	public static void main(String[] args) {

		String input = "abbacdaab";
		printUniqueChar(input);

	}

	private static void printUniqueChar(String input) {
		char[] inputArray = input.toCharArray();

		Set<Character> set = new LinkedHashSet<>();

		StringBuilder sb = new StringBuilder();

		for (char c : inputArray) {
			if(set.add(c)) {
				sb.append(c);
			}
		}

//		System.out.println(set);
//		
//		for (char c : set) {
//			sb.append(c);
//		}
		System.out.println(sb);

	}
}
