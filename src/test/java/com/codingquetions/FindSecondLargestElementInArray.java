package com.codingquetions;

public class FindSecondLargestElementInArray {

	public static void main(String[] args) {
		int nums[] = { 1, 3, 2, 7, 5, 20 };

		secondLargestElement(nums);
		firstLargestElement(nums);
		thirdLargestElement(nums);

	}

	private static void secondLargestElement(int[] nums) {

		int largestNum = Integer.MIN_VALUE;
		int secondLargestNum = Integer.MIN_VALUE;

		for (int num : nums) {
			if (num > largestNum) {
				secondLargestNum = largestNum;
				largestNum = num;
			} else if (num > secondLargestNum && num != largestNum) {
				secondLargestNum = num;
			}
		}

		System.out.println(secondLargestNum);

	}

	private static void firstLargestElement(int[] nums) {

		int largestNum = Integer.MIN_VALUE;

		for (int num : nums) {
			if (num > largestNum) {

				largestNum = num;
			}
		}

		System.out.println(largestNum);

	}

	private static void thirdLargestElement(int[] nums) {

		int largestNum = Integer.MIN_VALUE;
		int secondLargestNum = Integer.MIN_VALUE;
		int thirdLargestNum = Integer.MIN_VALUE;

		for (int num : nums) {
			if (num > largestNum) {
				thirdLargestNum = secondLargestNum;
				secondLargestNum = largestNum;
				largestNum = num;
			} else if (num > secondLargestNum && num != largestNum) {
				thirdLargestNum = secondLargestNum;
				secondLargestNum = num;
			} else if (num > thirdLargestNum && num != secondLargestNum && num != largestNum) {
				thirdLargestNum = num;
			}
		}

		System.out.println(thirdLargestNum);

	}

}
