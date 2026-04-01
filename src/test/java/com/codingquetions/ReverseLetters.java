package com.codingquetions;

import java.util.Arrays;

public class ReverseLetters {

	public static void main(String[] args) {
		String input = "1ab2";
		revLetters(input);

	}

	private static void revLetters(String input) {
		char[] inputArray = input.toCharArray();

		int left = 0;
		int right = inputArray.length - 1;
		char temp;
		StringBuilder sb = new StringBuilder();
		while (left < right) {
			if (!Character.isLetter(inputArray[left])) {
				left++;

			} else if (!Character.isLetter(inputArray[right])) {
				right--;

			} else {
				temp = inputArray[left];
				inputArray[left] = inputArray[right];
				inputArray[right] = temp;
				left++;
				right--;
			}
		}
		sb.append(inputArray);
		System.out.println(sb);
//		System.out.println(Arrays.toString(inputArray));

	}
}
