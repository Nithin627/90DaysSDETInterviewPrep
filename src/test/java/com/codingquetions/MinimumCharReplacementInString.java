package com.codingquetions;

import java.util.Arrays;

public class MinimumCharReplacementInString {

	public static void main(String[] args) {
		String[] words = { "ab", "aab", "abb", "abab", "abaaaba" };
		int[] result = new int[words.length];

		for (int w = 0; w < words.length; w++) {

//			String input = "aa";
			String input = words[w];
			int count = 0;
			int index = 1;

			char[] inputChar = input.toCharArray();

			while (index < input.length()) {

				if (inputChar[index] == inputChar[index - 1]) {

					count = count + 1;
					index = index + 2;

				} else {
					index = index + 1;
				}
				result[w] = count;

			}

		}
		System.out.println(Arrays.toString(result));
	}

}
