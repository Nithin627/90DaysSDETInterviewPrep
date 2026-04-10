package com.codingquetions;

public class ReverseOnlyVowels {

	public static void main(String[] args) {
		String input = "Nithinage";
		revOnlyVowels(input);

	}

	private static void revOnlyVowels(String input) {

		String vowels = "aeiouAEIOU";

		char[] inputCharArray = input.toCharArray();

		int left = 0;
		int right = inputCharArray.length - 1;
		char temp;

		while (left < right) {
			if (vowels.indexOf(inputCharArray[left]) == -1) {
				left++;
			} else if (vowels.indexOf(inputCharArray[right]) == -1) {
				right--;
			} else {
				temp = inputCharArray[left];
				inputCharArray[left] = inputCharArray[right];
				inputCharArray[right] = temp;
				left++;
				right--;
			}
		}

		String s = new String(inputCharArray);
		System.out.println(s);

	}

}
