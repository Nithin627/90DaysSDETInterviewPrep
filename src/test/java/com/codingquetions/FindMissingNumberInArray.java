package com.codingquetions;

import java.util.HashSet;
import java.util.Set;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 6 };

//		findMissingNumberOne(arr);
//		findMissingNumbers(arr, 21);
		findMissingNumberUsingXor(arr, 6);
	}

	private static void findMissingNumberOne(int[] input) {
		int totalNumbers = 6;
		int totalSumOfAllNums = totalNumbers * ((totalNumbers + 1)) / 2;
		int sumOfArray = 0;
		for (int i = 0; i <= input.length - 1; i++) {
			sumOfArray = sumOfArray + input[i];
		}

		System.out.println(sumOfArray);

		int missingNum = totalSumOfAllNums - sumOfArray;
		System.out.println("Misssing number is: " + missingNum);
	}

	private static void findMissingNumbers(int[] input, int totalNumbers) {
		Set<Integer> set = new HashSet<>();
		for (int i = 1; i <= totalNumbers; i++) {
			set.add(i);
		}
		for (int num : input) {
			set.remove(num);
		}
		System.out.println("Missing numbers are: " + set);
	}

	private static void findMissingNumberUsingXor(int[] input, int totalNum) {

		int missingNum = 0;

		for (int num : input) {
			missingNum = missingNum ^ num;
			for (int i = 0; i <= totalNum; i++) {

				missingNum = missingNum ^ i;

			}
			
		}

		System.out.println("Missing Number: " + missingNum);

	}

}
