package com.codingquetions;

import java.util.HashMap;
import java.util.Map;

public class FindTheFreqOfCharInString {
	public static void main(String[] args) {
		String input = "madamee";
		findFreq(input);
	}

	private static void findFreq(String input) {
		char[] inputA = input.toCharArray();
		Map<Character, Integer> map = new HashMap<>();

		for (char c : inputA) {
			if (map.containsKey(c)) {
				map.put(c, map.getOrDefault(c, 0) + 1);
			} else {
				map.put(c, 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
