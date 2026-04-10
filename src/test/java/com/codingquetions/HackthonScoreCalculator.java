package com.codingquetions;

import java.util.HashMap;
import java.util.Map;

public class HackthonScoreCalculator {

	public static void main(String[] args) {

		String erica = "EHH";
		String bob = "HHH";

		hackthinCalculator(erica, bob);
	}

	private static void hackthinCalculator(String erica, String bob) {
		Map<Character, Integer> scoreMap = new HashMap<>();
		scoreMap.put('E', 1);
		scoreMap.put('M', 3);
		scoreMap.put('H', 5);

		int erica_final_score = 0;
		int bob_final_score = 0;

		for (int i = 0; i < erica.length(); i++) {
			if (erica.length() != bob.length()) {
				System.out.println("length should be same");
				break;
			}

			char ericaPoint = erica.charAt(i);
			char bobPoint = bob.charAt(i);
			erica_final_score = erica_final_score + scoreMap.get(ericaPoint);
			bob_final_score = bob_final_score + scoreMap.get(bobPoint);

		}
//		System.out.println(erica_final_score);
//		System.out.println(bob_final_score);
		
		if (erica.length() == bob.length()) {
			if (erica_final_score > bob_final_score) {
				System.out.println("Winner is erica = " + erica_final_score);
			} else if (bob_final_score > erica_final_score) {
				System.out.println("Winner is bob = " + bob_final_score);
			} else if (bob_final_score == erica_final_score) {
				System.out.println("tie: erica = " + erica_final_score + ", bob = " + bob_final_score);
			}
		}
	}

}
