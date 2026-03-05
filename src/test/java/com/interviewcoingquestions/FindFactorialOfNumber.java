package com.interviewcoingquestions;

import java.math.BigInteger;

public class FindFactorialOfNumber {

	public static void main(String[] args) {
		int num = 50;
//		factorialOfNumber(num);
		factorialOfLargeNumber(num);
	}

	private static void factorialOfLargeNumber(int num) {
		BigInteger fact = BigInteger.ONE;
		for (int i = 1; i <= num; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println(fact);

	}

	private static void factorialOfNumber(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);

	}

}
