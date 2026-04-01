package com.interviewProgramFormPavan;

public class SplitTheString {

	public static void main(String[] args) {
		String s = "Java,Selenium,Testng,Maven";

		String[] s1 = s.split(",");

		for (String x : s1) {
			System.out.println(x);
		}

//		System.out.println(Arrays.toString(s1));
	}

}
