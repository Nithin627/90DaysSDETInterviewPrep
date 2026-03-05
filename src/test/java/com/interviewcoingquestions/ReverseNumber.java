package com.interviewcoingquestions;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 214;
//		revNumber(num);
		revNumberOverFlowCondition(num);

	}

	private static void revNumberOverFlowCondition(int num) {
		int revNum = 0;
		int lastDigit;

		while (num != 0) {

			lastDigit = num % 10;

			if (revNum > Integer.MAX_VALUE / 10 || (revNum == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
				System.out.println(0);
				System.exit(0);
			}

			if (revNum < Integer.MIN_VALUE / 10 || (revNum == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
				System.out.println(0);
				System.exit(0);
			}

			revNum = revNum * 10 + lastDigit;
			num = num / 10;

		}

		System.out.println(revNum);
	}

	private static void revNumber(int num) {
		int revNum = 0;
		int lastDigit;

		while (num != 0) {

			lastDigit = num % 10;
			revNum = revNum * 10 + lastDigit;
			num = num / 10;

		}

		System.out.println(revNum);

	}

}
