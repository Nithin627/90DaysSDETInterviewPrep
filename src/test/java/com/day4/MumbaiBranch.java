package com.day4;

public class MumbaiBranch extends Bank {
//EB
	@Override
	boolean validateDocument(String document) {
		if (document.equalsIgnoreCase("EB")) {
			return true;
		} else {
			System.out.println("Invalid document type: " + document);
			return false;
		}
	}

}
