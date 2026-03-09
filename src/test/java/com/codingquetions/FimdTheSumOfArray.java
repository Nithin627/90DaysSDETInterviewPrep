package com.codingquetions;

public class FimdTheSumOfArray {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40 };

		sumOfArray(arr);

	}

	private static void sumOfArray(int[] arr) {

		int sum = 0;
//		for (int i = 0; i <= arr.length - 1; i++) {
//
//			sum = sum + arr[i];
//
//		}

		for (int d : arr) {
			sum = sum + d;
		}

		System.out.println(sum);

	}

}
