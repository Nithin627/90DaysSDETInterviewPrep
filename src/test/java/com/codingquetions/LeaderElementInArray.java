package com.codingquetions;

public class LeaderElementInArray {

	public static void main(String[] args) {

		int[] a = { 16, 17, 4, 3, 5, 2 };
		findLeaderNumbers(a);

	}

	private static void findLeaderNumbers(int[] a) {

		int length = a.length;
		// System.out.println(length);

		int maxRight = a[length - 1];
		System.out.println(maxRight);

		for (int i = length - 2; i >= 0; i--) {
			if (a[i] > maxRight) {
				maxRight = a[i];
				System.out.println(maxRight);
			}
		}

	}

}
