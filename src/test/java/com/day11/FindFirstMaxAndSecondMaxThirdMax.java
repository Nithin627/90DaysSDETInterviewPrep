package com.day11;

public class FindFirstMaxAndSecondMaxThirdMax {
	public static void main(String[] args) {

		int[] input = { 10, 2, 5, 6, 70 };

		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;

		for (int num : input) {
			if (num > firstMax) {
				thirdMax = secondMax;
				secondMax = firstMax;
				firstMax = num;
			} else if (num > secondMax && num <= firstMax) {
				thirdMax = secondMax;
				secondMax = num;
			} else if (num > thirdMax && num <= secondMax) {
				thirdMax = num;
			}

		}

		System.out.println("firstMax: " + firstMax);
		System.out.println("secondMax: " + secondMax);
		System.out.println("thirdMax: " + thirdMax);
	}
}
