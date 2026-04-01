package com.codingquetions;

public class RevOnlyVowels {

	public static void main(String[] args) {
		/**
		 * ✅ Why "a" is not swapped Because it’s the middle vowel. When the pointers
		 * meet at the same index, the loop ends. There’s no other vowel to swap it
		 * with, so it remains unchanged. 🧮 General Rule - If the string has odd number
		 * of vowels, the middle one will stay in place. - If the string has even number
		 * of vowels, all vowels will be swapped.
		 * 
		 **/

//		aeiouAEIOU

		String input = "NithnPaddyur";

//		output = "Holle";

		revVowel(input);

	}

	private static void revVowel(String input) {

		String vowel = "aeiouAEIOU";
//		System.out.println(vowel.indexOf("H"));
		char[] inputArray = input.toCharArray();

		int left = 0;
		int right = inputArray.length - 1;
		char temp;
		StringBuilder sb = new StringBuilder();
		while (left < right) {

			if (vowel.indexOf(inputArray[left]) == -1) {
				left++;
			} else if (vowel.indexOf(inputArray[right]) == -1) {
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

	}

}
