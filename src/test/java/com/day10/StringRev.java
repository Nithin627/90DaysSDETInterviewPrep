package com.day10;

import java.util.Arrays;

public class StringRev {

	public static void main(String[] args) {
		String[] input = { "Nithin", "is", "in", "the", "interview" };
		revString(input);

	}

	private static void revString(String[] input) {
		int left = 1;
		int right = input.length - 2;
		String temp;
		while (left < right) {
			temp = input[left];
			input[left] = input[right];
			input[right] = temp;
			left++;
			right--;
		}

		System.out.print(Arrays.toString(input));
	}

}
