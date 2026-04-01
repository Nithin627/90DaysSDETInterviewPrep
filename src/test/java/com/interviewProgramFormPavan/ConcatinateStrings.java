package com.interviewProgramFormPavan;

public class ConcatinateStrings {

	public static void main(String[] args) {

		String str1 = "ABC";
		String str2 = "XYZ";
		String str3 = "PQR";
//
		String str4 = str1.concat(str2).concat(str3);
		System.out.println(str4);

//		StringBuilder sb = new StringBuilder();
//		sb.append(str1).append(str2).append(str3);
//		System.out.println(sb);

		String s = str1 + str2 + str3;
		System.out.println(s);
	}

}
