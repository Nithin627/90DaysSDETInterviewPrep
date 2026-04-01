package com.codingquetions;

import java.util.Arrays;

public class MaxProductOfTriplet {

	public static void main(String[] args) {
		int[] input = { -10, -3, 5, 6, -20 };

//		maxProduct1(input);
		maxProduct2(input);
	}

	private static void maxProduct2(int[] input) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;

		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;

		for (int num : input) {
//			System.out.println(num);
			if (num > max1) {
				max3 = max2;
				max2 = max1;
				max1 = num;
			} else if (num > max2 && num != max1) {
				max3 = max2;
				max2 = num;
			} else if (num > max3 && num != max2) {
				max3 = num;
			}

			if (num < min1) {
				min2 = min1;
				min1 = num;
			} else if (num < min2 && num != min1) {
				min2 = num;
			}

		}

		int result1 = max1 * max2 * max3;
		int result2 = min1 * min2 * max1;
		System.out.println(Math.max(result1, result2));

	}

//	not selects in interview(bcz of sorting)
	private static void maxProduct1(int[] input) {
		Arrays.sort(input);
//		System.out.println(Arrays.toString(input));
		int length = input.length;
		if (length < 3) {
			System.out.println("Element count less than 3");
			System.exit(0);
		} else {

			int result1 = input[length - 1] * input[length - 2] * input[length - 3];
			int result2 = input[0] * input[1] * input[length - 1];

			System.out.println(Math.max(result1, result2));
		}

	}

}
