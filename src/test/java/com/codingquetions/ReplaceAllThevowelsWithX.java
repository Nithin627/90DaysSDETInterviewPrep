package com.codingquetions;

public class ReplaceAllThevowelsWithX {

	public static void main(String[] args) {

		String input = "Name aeious";

//		output = "Nxmx";

		replaceVowelWithX2(input);

	}

	private static void replaceVowelWithX(String input) {
		String vowel = "aeiouAEIOU";

		char[] inputArray = input.toCharArray();
		StringBuilder sb = new StringBuilder();

		for (char data : inputArray) {

			if (vowel.indexOf(data) != -1) {
				sb.append("x");

			} else {
				sb.append(data);
			}

		}

		System.out.println(sb.toString());

	}

	private static void replaceVowelWithX2(String input) {
		String vowel = "aeiouAEIOU";

		char[] inputArray = input.toCharArray();
		StringBuilder sb = new StringBuilder();

		for (char data : inputArray) {

			if (isVowel(data)) {
				sb.append("x");

			} else {
				sb.append(data);
			}

		}

		System.out.println(sb.toString());

	}

	public static boolean isVowel(char currrentChar) {

		if (currrentChar == 'a' || currrentChar == 'e' || currrentChar == 'i' || currrentChar == 'o'
				|| currrentChar == 'u' || currrentChar == 'A' || currrentChar == 'E' || currrentChar == 'I'
				|| currrentChar == 'O' || currrentChar == 'U') {
			return true;
		}

		return false;

	}

}
