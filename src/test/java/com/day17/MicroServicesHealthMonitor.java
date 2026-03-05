package com.day17;

import java.util.Arrays;
import java.util.List;

public class MicroServicesHealthMonitor {

	public static void main(String[] args) {

//		

		String[] input = { "YYY", "YNY", "YYY", "YYY", "YYY" };

		List<String> weekLogs = Arrays.asList("YYY", "YNY", "YYY", "YYY", "YYY");

		calculateMaxStreak(weekLogs);

	}

	private static void calculateMaxStreak(List<String> weekLogs) {

		int currentStreak = 0;
		int maxStreak = 0;

		for (String data : weekLogs) {
//			System.out.println(data);
//			Check streak or not
			if (!data.contains("N")) {

				currentStreak = currentStreak + 1;
				maxStreak = Math.max(currentStreak, maxStreak);
//				System.out.println(data);

			} else {
				currentStreak = 0;

			}
		}

		System.out.println("Max Streak: " + maxStreak);

	}

}
