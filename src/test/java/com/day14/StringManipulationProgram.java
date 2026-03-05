package com.day14;

public class StringManipulationProgram {

	public static void main(String[] args) {
//		String input = "r@56vi ku$%mar67";
		String input = "N%I*T()45";
//		output = rvi Kumar 24

		StringBuilder sb = new StringBuilder();
		int sum = 0;

		for (char c : input.toCharArray()) {
//			System.out.println(c);
			if (Character.isLetter(c) || c == ' ') {
//				System.out.print(c);
				sb.append(c);
			}

			else if (Character.isDigit(c)) {
				sum = sum + Character.getNumericValue(c);
			}
		}
		sb.append(" ");
		sb.append(sum);
//		System.out.println(sum);
		System.out.println(sb);

	}

}
