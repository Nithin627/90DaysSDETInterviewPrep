package com.tryCatchdemo;

public class VariationOfTryCatchBlocks {

	public static void main(String[] args) {

//		int a = 10 / 0;

//		System.out.println(a);

		try {
			int a = 10 / 0;
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		}

	}

}
