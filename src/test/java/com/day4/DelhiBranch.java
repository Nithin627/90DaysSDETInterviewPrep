package com.day4;

public class DelhiBranch extends Bank {

	@Override
	boolean validateDocument(String document) {
		if (document.equalsIgnoreCase("passport")) {
			return true;
		} else {
			System.out.println("Invalid document type: " + document);
			return false;
		}
	}
//	Passport

}
