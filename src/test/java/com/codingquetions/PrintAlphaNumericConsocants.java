package com.codingquetions;

public class PrintAlphaNumericConsocants {

	public static void main(String[] args) {

		// Print consonants (A–Z except vowels)

		printAlpahaNumericConsocants();

	}

	private static void printAlpahaNumericConsocants() {
		String vowels = "aeiouAEIOU";

		StringBuilder sb = new StringBuilder();

		for (char c = 'a'; c <= 'z'; c++) {

			if (vowels.indexOf(c) == -1) {
				sb.append(c);
			}

		}

		System.out.println("\n");
		for (char c = 'A'; c <= 'Z'; c++) {
			if (vowels.indexOf(c) == -1) {
				sb.append(c);
			}
		}

		System.out.println("\n");
		for (char d = '0'; d <= '9'; d++) {
			sb.append(d);
		}

//		sb.append(false)

		System.out.println(sb.toString());

	}

}
