package com.codingquetions;

public class CountOfWordsInString {
	public static void main(String[] args) {
		String input = "Selenium Java f r";

		String[] data = input.split(" ");
		int wordsCount = 0;
		for (String s : data) {
			if (!s.isEmpty()) {
				wordsCount++;
			}
		}

		System.out.println("Count of words in String: "+wordsCount);

	}

}
