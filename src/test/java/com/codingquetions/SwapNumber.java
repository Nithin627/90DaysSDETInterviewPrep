package com.codingquetions;

public class SwapNumber {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		swapingSolutionOne(a, b);
		swapingSolutionTwo(a, b);
		swapingSolutionThree(a, b);
	}

	private static void swapingSolutionOne(int a, int b) {

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a:" + a + " " + "b:" + b);

	}

	private static void swapingSolutionTwo(int a, int b) {

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println("a:" + a + " " + "b:" + b);

	}

	private static void swapingSolutionThree(int a, int b) {

		int temp = a;
		a = b;
		b = temp;

		System.out.println("a:" + a + " " + "b:" + b);

	}

}
