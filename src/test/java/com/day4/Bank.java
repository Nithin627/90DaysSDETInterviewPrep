package com.day4;

public abstract class Bank {

	private static final String BANK_NAME = "HDFC Bank";

	public void createAccount(String document) {
		if (validateDocument(document)) {
			System.out.println("Craeting the account with the documnet: " + document);
			System.out.println("Account created successfully!!!");
		}

	}
	
	
	abstract boolean validateDocument(String document);

//	private boolean validateDocument(String document) {
//		if (document.equalsIgnoreCase("passport") || document.equalsIgnoreCase("EB")) {
//			return true;
//		} else {
//			System.out.println("Invalid document type");
//			return false;
//		}
//
//	}

}
