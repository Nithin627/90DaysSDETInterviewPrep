package com.interviewcoingquestions;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

//		swapUsingTempVar(a, b);
//		swapUsingWithoutUsingTempvar(a, b);
		usingBitwiseManipulation(a, b);

	}

	private static void usingBitwiseManipulation(int a, int b) {
//		Decimal numbers into binary 
	    
        a=a^b;
        b=a^b;
        a=a^b;
        
       
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		

	}

	private static void swapUsingWithoutUsingTempvar(int a, int b) {

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a: " + a);
		System.out.println("b: " + b);

	}

	private static void swapUsingTempVar(int a, int b) {

		int temp;

		temp = a;

		a = b;
		System.out.println("a: " + a);

		b = temp;
		System.out.println("b: " + b);

	}

}
