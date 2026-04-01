package com.codingquetions;

public class RemovetheSpacesInWord {
	public static void main(String[] args) {
		String input = "Selenium Java f r";
		StringBuilder sb = new StringBuilder();

		char[] inputArray = input.toCharArray();

		for (char c : inputArray) {
			if (c != ' ') {
				sb.append(c);
			}

		}
		System.out.println(sb);

	}

}
