package com.day3;

public class Account {
	private String name;
	private double balance;
	public static final String BANK_NAME;

	static {
		System.out.println("Hello from static bloack");
		BANK_NAME = "HDFC BANK";
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", balance=" + balance + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if (balance < 0) {
			System.out.println("Amount can not be negative");

		} else {
			this.balance = balance;
		}

	}

}
