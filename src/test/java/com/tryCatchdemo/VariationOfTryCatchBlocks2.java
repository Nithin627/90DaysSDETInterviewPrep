package com.tryCatchdemo;

public class VariationOfTryCatchBlocks2 {

	public static void main(String[] args) {
		int a;
		int num[] = { 1, 2, 3, 4, 5 };

		try {
			a = 10 / 2;

			System.out.println(num[10]);
			System.out.println(a);

		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException are) {
			System.out.println(are.getMessage());
			are.printStackTrace();
		}

	}

}
