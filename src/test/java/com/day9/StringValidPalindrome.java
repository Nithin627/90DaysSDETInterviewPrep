package com.day9;

public class StringValidPalindrome {
	public static void main(String[] args) {
		String input = "A man, a plan, a canal: Panama";

		validPalindromeUsingStringBuilder(input);

	}

	private static void validPalindromeUsingStringBuilder(String input) {

		StringBuilder sb = new StringBuilder();
		char array[] = input.toCharArray();

		for (char c : array) {
			if (Character.isLetterOrDigit(c)) {
				sb.append(Character.toLowerCase(c));
			}
		}

		String cleanedInput = sb.toString();
		String revInput = sb.reverse().toString();

		if (cleanedInput.equals(revInput)) {
			System.out.println("Valid Palindrome");
		} else {
			System.out.println("Invalid Palindrome");
		}
	}

	private static boolean validPalindromeUsingTwoPointer(String input) {
		char a[] = input.toCharArray();
		int left = 0;
		int right = a.length - 1;

		while (left < right) {
			while (left < right && !Character.isLetterOrDigit(a[left])) {
				left++;
			}
			while (left < right && !Character.isLetterOrDigit(a[right])) {
				right--;
			}
			if (Character.toLowerCase(a[left]) != Character.toLowerCase(a[right])) {
				return false;
			}
			left++;
			right--;
		}

		return true;
	}

}
