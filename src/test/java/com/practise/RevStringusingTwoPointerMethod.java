package com.practise;

import java.util.Arrays;

public class RevStringusingTwoPointerMethod {

	public static void main(String[] args) {

		String input = "Nithin";
		char[] charArray = input.toCharArray();
		int left = 0;
		int right = charArray.length - 1;
		char temp;

		while (left < right) {
			temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			left++;
			right--;
		}

		System.out.println(Arrays.toString(charArray));
	}
}