package com.day8;

import java.util.*;

public class StringRevTowPointer {

	public static void main(String[] args) {
//        String input = "Hello";
//        char[] charArr=input.toCharArray();
//        StringBuilder sb= new StringBuilder();
//        
//        for(int i=charArr.length-1;i>=0;i--){
//            // System.out.print( charArr[i]);
//            sb.append( charArr[i]);
//            
//        }
//        System.out.print(sb);

		// String rev="";

		// for(int i=input.length() -1;i>=0;i--){
		// rev =rev+input.charAt(i);
		// }
		// System.out.print(rev);

		String input = "Hello";
		char[] charArr = input.toCharArray();
		// Two pointer method
		int left = 0;
		int right = charArr.length - 1;
		char temp;

		while (left < right) {
			temp = charArr[left];
			charArr[left] = charArr[right];
			charArr[right] = temp;
			left++;
			right--;
		}

		System.out.println(Arrays.toString(charArr));
	}

}
