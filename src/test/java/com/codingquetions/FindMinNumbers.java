package com.codingquetions;

public class FindMinNumbers {

	public static void main(String[] args) {
		int[] nums = { 24, 86, 65, 78 };

		int minNum = Integer.MAX_VALUE;
		int secondMinNum = Integer.MAX_VALUE;
		int thirdMinNum = Integer.MAX_VALUE;

		for (int num : nums) {

			if (num < minNum) {
				thirdMinNum = secondMinNum;
				secondMinNum = minNum;
				minNum = num;
			} else if (num < secondMinNum && num != minNum) {
				thirdMinNum = secondMinNum;
				secondMinNum = num;
			} else if (num < thirdMinNum && num != secondMinNum && num != minNum) {
				thirdMinNum = num;
			}

		}

		System.out.println("Second Min Numbers: " + secondMinNum);
		System.out.println("Third Min Numbers: " + thirdMinNum);
		System.out.println("First Min Numbers: " + minNum);

	}

}
