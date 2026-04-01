package com.codingquetions;

public class CountOfNumOfChangingKee {
	public static void main(String[] args) {

		String input = "abBc";

		int count = 0;
		char lastKey = input.toCharArray()[0];
		lastKey = Character.toLowerCase(lastKey);

		for (int i = 1; i <= input.length() - 1; i++) {
			char currentkey = input.toCharArray()[i];
			currentkey = Character.toLowerCase(currentkey);
			if (currentkey != lastKey) {
				count++;
			}
			lastKey = currentkey;
		}

		System.out.println(count);

	}

}
