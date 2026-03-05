package com.practise;

import java.util.HashMap;
import java.util.Map;

public class SecondMostFreqChar {

	public static void main(String[] args) {
		String input = "aabbb";

//		char[] charArray = input.toCharArray();

//		To find the frequency of character
		Map<Character, Integer> map = new HashMap();

		for (char inputChar : input.toCharArray()) {

			map.put(inputChar, map.getOrDefault(inputChar, 0) + 1);

		}

		System.out.println(map);

//		find the second most frequent char in the string
		int firstMaxFreq = 0;
		for (Map.Entry<Character, Integer> entrySet : map.entrySet()) {

			System.out.println(entrySet.getValue());

		}

	}

}
