package com.codingquetions;

import java.util.Arrays;

public class RevWordsOrderInSentence {
	public static void main(String[] args) {
		String input = "Java is Fun";
		String[] words = input.split(" ");
		System.out.println(Arrays.toString(words));
		StringBuilder sb = new StringBuilder();
		// 2 pointer
		int left = 0;
		int right = words.length - 1;

		String temp;

		while (left < right) {
			temp = words[left];
			words[left] = words[right];
			words[right] = temp;
			left++;
			right--;
		}

		for (int i = 0; i <= words.length - 1; i++) {
			System.out.println(words[i]);
			sb.append(words[i]).append(" ");
		}

		System.out.println(sb);

	}

}
