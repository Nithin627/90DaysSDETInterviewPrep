package com.codingquetions;

public class PrintStringWithoutSpace {

	public static void main(String[] args) {
		String input = "My name is Nithin";
		printStringWiyhoutSapces4(input);
	}

	private static void printStringWiyhoutSapces(String input) {
		char[] inputArray = input.toCharArray();

		StringBuilder sb = new StringBuilder();
		for (char c : inputArray) {

			if (c != ' ') {
				sb.append(c);

			}

		}

		System.out.print(sb.toString());
	}

	private static void printStringWiyhoutSapces2(String input) {
		char[] inputArray = input.toCharArray();
		String result = "";

		for (int i = 0; i <= inputArray.length - 1; i++) {
			if (inputArray[i] != ' ') {
				result = result + inputArray[i];
			}
		}
		System.out.print(result);

//		for (char c : inputArray) {
//
//			if (c != ' ') {
//
//			}
//
//		}

	}

	private static void printStringWiyhoutSapces3(String input) {
		System.out.println(input.replace(" ", ""));

	}
	
	private static void printStringWiyhoutSapces4(String input) {
		System.out.println(input.replaceAll(" ", ""));

	}

}
