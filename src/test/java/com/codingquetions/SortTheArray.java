package com.codingquetions;

import java.util.Arrays;
import java.util.Collections;

public class SortTheArray {
	public static void main(String[] args) {
		int[] a = { 5, 4, 3, 7, 2, 8 };
		sortArrayInAscending(a);
	}

	private static void sortArrayInAscending(int[] a) {
		Arrays.sort(a); // sorts in ascending order
		System.out.println(Arrays.toString(a));
	}

	private static void sortArrayInDescending(Integer[] a) {
		Arrays.sort(a, Collections.reverseOrder()); // sort descending
		System.out.println(Arrays.toString(a));
	}

	private static void sortArrayInDescending2(int[] a) {
		// Two-pointer selection sort (descending)
		for (int left = 0; left < a.length - 1; left++) {
			int maxIndex = left;
			for (int right = left + 1; right < a.length; right++) {
				if (a[right] > a[maxIndex]) {
					maxIndex = right;
				}
			}
			// swap max with current left
			int temp = a[left];
			a[left] = a[maxIndex];
			a[maxIndex] = temp;
		}

		// Print result
		System.out.print("[");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i < a.length - 1)
				System.out.print(", ");
		}
		System.out.println("]");
	}

	private static void sortArrayInAscending2(int[] a) {
		// Two-pointer selection sort (ascending)
		for (int left = 0; left < a.length - 1; left++) {
			int minIndex = left;
			for (int right = left + 1; right < a.length; right++) {
				if (a[right] < a[minIndex]) {
					minIndex = right;
				}
			}
			// swap min with current left
			int temp = a[left];
			a[left] = a[minIndex];
			a[minIndex] = temp;
		}

		// Print result
		System.out.print("[");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i < a.length - 1)
				System.out.print(", ");
		}
		System.out.println("]");
	}

}
