package com.codingquetions;

public class CountOfVowels {

	public static void main(String[] args) {
		String input = "Hellou";

		countOfVowels(input);
	}

	private static void countOfVowels(String input) {
		String vowel = "aeiouAEIOU";

		char[] inputArray = input.toCharArray();
		int count = 0;

		for (char x : inputArray)
			if (vowel.indexOf(x) != -1) {
				count = count + 1;

			}

		System.out.println(count);

	}

}
