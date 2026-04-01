package com.codingquetions;

import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {

		String input = "[{([])}]";

		boolean result = checkValidParanthesis(input);
		System.out.println(result);
		if (result) {
			System.out.println("Valid");
		} else {
			System.out.println("Not valid");
		}
//		checkValidParanthesis(input);
	}

	private static boolean checkValidParanthesis(String input) {

		char[] inputArray = input.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (char c : inputArray) {

			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);

			} else {
				

					if (stack.isEmpty()) {
						return false;
					}
					char pop= stack.pop();
					if ((c == ')' && pop != '(') || (c == '}' && pop != '{') || (c == ']' && pop != '[')) {
						return false;
					}
				}

			}
		return stack.isEmpty();

	}

	private static boolean checkValidParanthesis2(String input) {
		char[] inputArray = input.toCharArray();
		Stack<Character> stack = new Stack<>();

		for (char c : inputArray) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				char pop = stack.pop();
				if ((c == ')' && pop != '(') || (c == '}' && pop != '{') || (c == ']' && pop != '[')) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

}
