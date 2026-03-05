package com.day11;

public class FindFirstMaxAndSecondMax {
	public static void main(String[] args) {

		int[] input = { 10, 2, 5, 6 };

		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		for (int num : input) {
			if (num > firstMax) {
				secondMax = firstMax;
				firstMax = num;
			} else if (num > secondMax && num <= firstMax) {
				secondMax = num;
			}

		}

		System.out.println("firstMax: " + firstMax);
		System.out.println("secondMax: " + secondMax);
	}
}
