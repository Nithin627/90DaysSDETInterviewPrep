package com.codingquetions;

public class PrintLengthOfStringEvenOrOdd {

	public static void main(String[] args) {
		String s = "Javaf";

		int input = s.length();

		if (input % 2 == 0) {
			System.out.println("Even Length String");
		} else {
			System.out.println("Odd Length String");
		}
	}

}
