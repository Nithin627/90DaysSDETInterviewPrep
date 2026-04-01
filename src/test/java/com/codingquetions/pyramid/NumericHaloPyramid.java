package com.codingquetions.pyramid;

public class NumericHaloPyramid {

	public static void main(String[] args) {
		int totalNumOfRows = 5;

		for (int row = 1; row <= totalNumOfRows; row++) {
			for (int col = 1; col <= row; col++) {
				if (col == 1 || col == row || row == totalNumOfRows) {
					System.out.print(col);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}

	}

}
