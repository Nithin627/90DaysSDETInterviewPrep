package com.codingquetions;

public class String101 {

	public static void main(String[] args) {
//		String name = "Nithin";
//		String NAME = "NITHIN";
//		name = "Aman";
//		System.out.println(name + "\n" + NAME);

		String n1 = "Python";// Stored in String Intern pool
		String n2 = "Python";// Stored in String Intern pool
		boolean equal1 = isBothEqual(n1, n2);
		System.out.println(equal1);

		String name1 = "Java";// Stored in String Intern pool
		String name2 = new String("Java");// Stored in heap memory

		boolean equal = isBothEqual(name1, name2);
		System.out.println(equal);

		String x = new String("Ram");
		String y = x.intern();
		System.out.println(y);
		boolean equal3 = isBothEqual(x, y);
		System.out.println(equal3);
		
		String vowel = "aeiouAEIOU";
		System.out.println(vowel.indexOf("T"));
		
		String value = "4";
		int int1 = Integer.parseInt(value);
		System.out.println(int1);

	}

	public static boolean isBothEqual(String n1, String n2) {

		if (n1 == n2) {
			return true;
		}

		return false;

	}
}
