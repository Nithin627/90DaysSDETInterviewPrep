package com.codingquetions;

public class SumOfNumInMixedString {
	public static void main(String[] args) {

		String input = "12abc34xyz56lmn10dd8";
		int sum = 0;
		char[] inputCharArr = input.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (char c : inputCharArr) {
			if (Character.isDigit(c)) {
				sb.append(c);
			} else {
				if (sb.length() > 0) {
					sum = sum + Integer.parseInt(sb.toString());
					sb.setLength(0);
				}
			}
		}
		
		if (sb.length() > 0) {// for the case numbers at the end
			sum = sum + Integer.parseInt(sb.toString());

		}

		System.out.println(sum);
	}
}
