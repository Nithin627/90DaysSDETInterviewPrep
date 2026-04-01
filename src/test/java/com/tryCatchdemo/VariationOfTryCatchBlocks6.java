package com.tryCatchdemo;

public class VariationOfTryCatchBlocks6 {

	public static void main(String[] args) {

		int a;

		try {
			a = 10 / 0;
		} finally {
			System.out.println("Finall block!!");
		}

	}

}
