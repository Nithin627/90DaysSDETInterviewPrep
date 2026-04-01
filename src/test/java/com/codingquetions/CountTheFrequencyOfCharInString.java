package com.codingquetions;

import java.util.HashMap;
import java.util.Map;

public class CountTheFrequencyOfCharInString {
	public static void main(String[] args) {

		String input = "My name is Nithin";

		findTheFrequencOfCharacter(input);

	}

	private static void findTheFrequencOfCharacter(String input) {
		input = input.toLowerCase();
		char[] inputArray = input.toCharArray();

		Map<Character, Integer> frequencyMap = new HashMap<>();

		for (char x : inputArray) {
//			System.out.print(x);
			if (x != ' ') {
				frequencyMap.put(x, frequencyMap.getOrDefault(x, 0) + 1);
			}
		}

//		System.out.println(frequencyMap);

		for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
