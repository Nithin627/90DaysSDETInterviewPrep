package com.codingquetions;

public class RevOnlyChar {

	public static void main(String[] args) {
		String input = "1Raj3";
		revOnlyChar(input);

	}

	private static void revOnlyChar(String input) {

		char[] data = input.toCharArray();
		StringBuilder sb = new StringBuilder();
		int left = 0;
		int right = data.length - 1;
		char temp;
		while (left < right) {

			if (!Character.isLetter(data[left])) {
				left++;

			} else if (!Character.isLetter(data[right])) {
				right--;

			} else {
				temp = data[left];
				data[left] = data[right];
				data[right] = temp;
				left++;
				right--;

			}

		}

		sb.append(data);
		System.out.println(sb);

	}

}
