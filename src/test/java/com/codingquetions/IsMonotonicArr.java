package com.codingquetions;

public class IsMonotonicArr {
	public static void main(String[] args) {
		
//		Monotonic :- Arra either inc or dec order

		int[] input = { 1, 2, 3, 4};

		boolean inc = true;
		boolean dec = true;

		for (int i = 1; i <= input.length - 1; i++) {
//			System.out.println(input[i]);

			if (input[i - 1] < input[i]) {
				dec = false;
			} else if (input[i - 1] > input[i]) {
				inc = false;
			}
		}

//		System.out.print("Is monotonic: ");
//		System.out.println(inc || dec);
		
		if(inc || dec) {
			System.out.print("Is monotonic");
		}else {
			System.out.print("Non monotonic");
		}
	}

}
