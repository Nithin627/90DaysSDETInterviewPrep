package com.codingquetions;

public class PrintEvenWordFromString {

	public static void main(String[] args) {

		String s = "hello Nithin he           ";

		printEvenWordInString(s);

	}

	private static void printEvenWordInString(String s) {

		String[] data = s.split(" ");
//		System.out.println(Arrays.toString(data));

		for (String d : data) {

//			System.out.println(d);
			int length = d.length();

			if (!d.isEmpty() && length % 2 == 0) {
				System.out.println(d);
			}

		}

	}

}
