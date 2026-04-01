package com.codingquetions;

import java.security.SecureRandom;

public class RandomStrigWithGivenLength {

	public static void main(String[] args) {
		int length = 6;
		generateRandomString(length);

	}

	private static void generateRandomString(int length) {

		final String CHRACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz" + "0123456789";
		StringBuilder sb = new StringBuilder();
		SecureRandom random = new SecureRandom();
		for (int i = 0; i <= length; i++) {
			int index = random.nextInt(CHRACTERS.length());
			sb.append(CHRACTERS.charAt(index));
		}

		System.out.println(sb.toString());

	}

}
