package com.codingquetions;

public class CountOfNumAfterDecimal {
	public static void main(String[] args) {

		double nums = 123.34565;

		String input = String.valueOf(nums);
		System.out.println(input);

		int indexOfDecimal = input.indexOf(".");
		System.out.println(indexOfDecimal);

		System.out.println(input.length() - indexOfDecimal - 1);

	}

}
