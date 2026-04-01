package com.codingquetions;

public class FindVowelsAndConsonantCount {
	public static void main(String[] args) {
		String input = "Selenium Java f";

		String vowels = "aeiouAEIOU";

		int vowelsCount = 0;
		int consonanatCount = 0;

		char[] inputCharArray = input.toCharArray();

		for (char c : inputCharArray) {
			if (Character.isLetter(c)) {
				if (vowels.indexOf(c) != -1) {
					vowelsCount++;
				} else {
					consonanatCount++;
				}
			}
		}

		System.out.println("Vowels Count: " + vowelsCount);
		System.out.println("Consonanat Count: " + consonanatCount);

	}

}
