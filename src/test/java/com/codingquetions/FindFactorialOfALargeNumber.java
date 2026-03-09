package com.codingquetions;

import java.math.BigInteger;

public class FindFactorialOfALargeNumber {

	public static void main(String[] args) {
		int num = 5;
		factorialNum(num);
		factorialOfLargeNum(num);
	}

	private static void factorialNum(int num) {

		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;

		}
		System.out.println(fact);

	}

	private static void factorialOfLargeNum(int num) {

		BigInteger result = BigInteger.ONE;

		for (int i = 1; i <= num; i++) {

			result = result.multiply(BigInteger.valueOf(i));

		}
		
		System.out.println(result);

	}

}
