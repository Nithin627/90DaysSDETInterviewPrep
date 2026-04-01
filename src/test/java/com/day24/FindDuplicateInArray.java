package com.day24;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateInArray {
	public static void main(String[] args) {

		int[] numbers = { 22, 34, 22, 45, 33, 34 };

		Set<Integer> inputSet = new HashSet<>();

		for (int n : numbers) {

			if (!inputSet.add(n)) {
				System.out.println(n);
			}

		}

	}
}
