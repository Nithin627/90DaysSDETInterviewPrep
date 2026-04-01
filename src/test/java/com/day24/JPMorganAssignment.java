package com.day24;

import java.util.Arrays;

public class JPMorganAssignment {

	public static void main(String[] args) {

//		input[] = {1,3,0,4,5,0,2,0} => op={1,2,3,4,5,0,0,0}

		int input[] = { 1, 3, 0, 4, 5, 0, 2, 0 };

		int index = 0;

		for (int num : input) {

			if (num != 0) {
				input[index] = num;
				index++;
			}

		}

		for (int i = index; i <= input.length - 1; i++) {
			input[i] = 0;
		}

		Arrays.sort(input, 0, 5);

		System.out.println(Arrays.toString(input));

	}

}
