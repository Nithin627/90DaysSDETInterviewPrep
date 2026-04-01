package com.codingquetions.pyramid;

public class NumericPyramid {

	public static void main(String[] args) {

		int totalNumOfRows = 5;

		for (int i = 1; i <= totalNumOfRows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}

	}

}
