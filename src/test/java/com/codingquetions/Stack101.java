package com.codingquetions;

import java.util.Stack;

public class Stack101 {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();
//		Stack<Integer> stack1 = new Stack<Integer>();
//		Stack<Character> stack2 = new Stack<Character>();
//		Stack<Float> stack3 = new Stack<Float>();

		stack.push("Java");
		System.out.println(stack);

		stack.push("book");
		System.out.println(stack);

		stack.push("Pen");
		System.out.println(stack);

		String peek = stack.peek();
		System.out.println(peek);

		stack.pop();
		System.out.println(stack);

		String peek2 = stack.peek();
		System.out.println(peek2);

		boolean empty = stack.isEmpty();
		System.out.println(empty);

		int search = stack.search("Java");
		int search2 = stack.search("bookd");
		System.out.println(search2);

	}

}
