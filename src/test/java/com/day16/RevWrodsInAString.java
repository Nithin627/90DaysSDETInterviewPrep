package com.day16;

import java.util.Arrays;

public class RevWrodsInAString {

	public static void main(String[] args) {
		String input = "Java Test";
//		output = "avaJ tseT"

//		Split he words
		String[] data = input.split(" ");
//		String d = Arrays.toString(data);
//		System.out.println(d);

		StringBuilder sb = new StringBuilder();

		for (String word : data) {
//			System.out.println(word);

//			Apply 2 pointer
			char[] charArray = word.toCharArray();
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
//			System.out.println(Arrays.toString(charArray));

//			convert char array to string
			String result = new String(charArray);
//			System.out.println(result);
			sb.append(result).append(" ");

		}

		System.out.println(sb);

	}

}
