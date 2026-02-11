package com.day4;

public class Runner {

	public static void main(String[] args) {

//		Bank hdfcBank = new Bank();
//		hdfcBank.createAccount("passport");
//
//		Bank hdfcBank2 = new Bank();
//		hdfcBank2.createAccount("PAN");

		MumbaiBranch mb = new MumbaiBranch();
		mb.createAccount("EB");

		DelhiBranch db = new DelhiBranch();
		db.createAccount("EB");
	}

}
