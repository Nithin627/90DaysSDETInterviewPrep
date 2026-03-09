package com.codingquetions;

public class RevInteger {

	public static void main(String[] args) {

		int num = 123;

		int revNum = revIntegerOne(num);
		System.out.println(revNum);

	}

	private static int revIntegerOne(int num) {

		int revNum = 0;
		int rem;
		while (num != 0) {
			rem = num % 10;

//			Overflow check
			if (revNum > Integer.MAX_VALUE / 10 || (revNum == Integer.MAX_VALUE / 10 && rem > 7)) {
				System.out.println(0);
				System.exit(0);

			}
//          Under flow
			if (revNum < Integer.MIN_VALUE / 10 || (revNum == Integer.MIN_VALUE / 10 && rem < -8)) {
				System.out.println(0);
				System.exit(0);
			}

			revNum = revNum * 10 + rem;
			num = num / 10;

		}

		return revNum;

	}

}
