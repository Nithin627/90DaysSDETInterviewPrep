package com.day14;

import java.util.ArrayList;
import java.util.List;

public class EYStringManipulation {

	public static void main(String[] args) {
		String input = "a1b2c3";
//		output = "a3b2c1"

		List<Character> list = new ArrayList();
		for (char c : input.toCharArray()) {
			if (Character.isDigit(c)) {
				list.add(c);
			}
		}
//		System.out.println(list);

		int index = list.size() - 1;
//		System.out.println(index);

		StringBuilder sb = new StringBuilder();

		for (char c : input.toCharArray()) {
			if (Character.isDigit(c)) {
				sb.append(list.get(index));
				index--;
			} else {
				sb.append(c);
			}
		}
		System.out.println(sb);

	}

}
