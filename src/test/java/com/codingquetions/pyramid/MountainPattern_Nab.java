package com.codingquetions.pyramid;

public class MountainPattern_Nab {
	public static void main(String[] args) {

		int n = 5;

		for (int r = 0; r <= n; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print(c + " ");
			}
			System.out.println();
		}

		for (int r = n - 1; r >= 0; r--) {
			for (int c = 1; c <= r; c++) {
				System.out.print(c + " ");
			}
			System.out.println();
		}

	}

}
