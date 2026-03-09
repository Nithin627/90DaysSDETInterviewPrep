package com.codingquetions;

public class NumEvenOrOdd {

	public static void main(String[] args) {
		int num = 21;
		evenOrOddOne(num);
		evenOrOddTwo(num);

	}

	public static void evenOrOddOne(int num) {
		if (num % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

	public static void evenOrOddTwo(int num) {
		while (num > 0) {
			num = num - 2;
		}

		if (num == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

}
