package com.day12;

public class NumberEvenOrOddUsingPlusOrMinus {
//	can not use modulus, multiplication and divide operator
//	Only allow to use plus or minus
	public static void main(String[] args) {
		int num = 6;
		while (num > 1) {
			num = num - 2;
		}
		System.out.println(num);

		if (num == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

}
