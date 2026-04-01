package com.codingquetions;

import java.util.HashMap;
import java.util.Map;

public class ConvertRomanToInteger {

	public static void main(String[] args) {

		String input = "III";

		romanToInteger(input);

	}

	private static void romanToInteger(String input) {
		Map<Character, Integer> romanMap = new HashMap<>();

	    romanMap.put('I',1);
	    romanMap.put('V',5);
	    romanMap.put('X',10);
	    romanMap.put('L',50);
	    romanMap.put('C',100);
	    romanMap.put('D',500);
	    romanMap.put('M',1000);


//		System.out.println(romanMap);

		int result = 0;
		int previousValue = 0;

		for (int i = input.length() - 1; i >= 0; i--) {

			char currentChar = input.charAt(i);
			int currentCharValue = romanMap.get(currentChar);

			if (currentCharValue >= previousValue) {
				result = result + currentCharValue;
			} else {
				result = result - currentCharValue;
			}
			previousValue = currentCharValue;

		}
		System.out.println(result);

	}

}
