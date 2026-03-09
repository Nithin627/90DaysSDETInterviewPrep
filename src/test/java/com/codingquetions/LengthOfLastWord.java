package com.codingquetions;

public class LengthOfLastWord {

	public static void main(String[] args) {
		String s = "   Hello World     ";

		System.out.println(s.length());

		int count = 0;
//		String input = s.trim();
		char[] inputArray = s.toCharArray();

		for (int i = inputArray.length - 1; i >= 0; i--) {

			if (inputArray[i] != ' ') {
				System.out.print(inputArray[i]);
				count = count + 1;

			} else {
				if (count > 0) {

					System.out.println(" " + count);
					break;
				}
			}
		}

	}

}
