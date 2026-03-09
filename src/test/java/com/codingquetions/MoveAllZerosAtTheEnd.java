package com.codingquetions;

import java.util.Arrays;

public class MoveAllZerosAtTheEnd {

	public static void main(String[] args) {

		int[] nums = { 1, 0, 2, 0, 3, 0 };
//		output nums[] = {1,2,3,0,0,0};

		moveAllZeros(nums);

	}

	private static void moveAllZeros(int[] nums) {

		int putNonZeroValue = 0;
		int temp;
		for (int current = 0; current < nums.length; current++) {
			if (nums[current] != 0) {
				temp = nums[putNonZeroValue];
				nums[putNonZeroValue] = nums[current];
				nums[current] = temp;
				putNonZeroValue++;
			}
		}

		System.out.println(Arrays.toString(nums));

	}

}
