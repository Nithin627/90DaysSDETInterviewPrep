package com.codingquetions;

public class SeperateAlpahabetsAndNumeric {
	public static void main(String[] args) {
		String input = "Ra123j@Ram";
		separate(input);
//		char[] inputA = input.toCharArray();
//		StringBuilder sb1 = new StringBuilder();
//		StringBuilder sb2 = new StringBuilder();
//		for (char c : inputA) {
//	
//			if (Character.isLetter(c)) {
//				sb1.append(c);
//			} else if (Character.isDigit(c)){
//				sb2.append(c);
//			}
//		}
//
//		System.out.println("Alphabets: " + sb1);
//		System.out.println("Numeric: " + sb2);

	}

	public static void separate(String input) {
		StringBuilder letters = new StringBuilder();
		StringBuilder digits = new StringBuilder();
		for (char c : input.toCharArray()) {
			if (Character.isAlphabetic(c)) {
				letters.append(c);
			} else if (Character.isDigit(c)) {
				digits.append(c);
			}
		}
		System.out.println("Alphabets: " + letters.toString());
		System.out.println("Numeric:   " + digits.toString());
	}

}
