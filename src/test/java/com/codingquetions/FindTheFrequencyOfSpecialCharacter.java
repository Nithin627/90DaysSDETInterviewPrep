package com.codingquetions;

import java.util.HashMap;
import java.util.Map;

public class FindTheFrequencyOfSpecialCharacter {

	public static void main(String[] args) {

		String input = "abc@A# @ $ B";

		checkFrequencyOfSpecialChar(input);

	}

	private static void checkFrequencyOfSpecialChar(String input) {

		char[] inputArray = input.toCharArray();

		Map<Character, Integer> hmap = new HashMap<>();

		for (char c : inputArray) {

			if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9') || c == ' ')) {

				if (hmap.containsKey(c)) {
					hmap.put(c, hmap.get(c) + 1);

				} else {
					hmap.put(c, 1);
				}

			}

		}

		for (Map.Entry<Character, Integer> entry : hmap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());

		}

	}

}
