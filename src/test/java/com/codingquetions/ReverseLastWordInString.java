package com.codingquetions;

public class ReverseLastWordInString {
	public static void main(String[] args) {
		String input = "I love Java Coding";
		reverseLastWord(input);
	}

	private static void reverseLastWord(String input) {
		StringBuilder sb = new StringBuilder();

		// Find the last space
		int lastSpaceIndex = input.lastIndexOf(" ");
		System.out.println(lastSpaceIndex);

		// Prefix (everything before last word)
		String prefix = input.substring(0, lastSpaceIndex + 1);
		System.out.println(prefix);

		// Last word
		char[] lastWord = input.substring(lastSpaceIndex + 1).toCharArray();
		System.out.println(lastWord);

		// Two-pointer reversal
		int left = 0;
		int right = lastWord.length - 1;
		char temp;

		while (left < right) {
			temp = lastWord[left];
			lastWord[left] = lastWord[right];
			lastWord[right] = temp;
			left++;
			right--;
		}

		sb.append(prefix).append(lastWord);
		System.out.println(sb);
	}

}
