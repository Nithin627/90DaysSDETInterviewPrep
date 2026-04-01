package com.SingleToneDesignPattern;

public class Runner {

	public static void main(String[] args) {
//		DBConnector db1 = new DBConnector();
//		System.out.println(db1);
//
//		DBConnector db2 = new DBConnector();
//		System.out.println(db2);

		DBConnector dbC1 = DBConnector.createInsatnce();
		System.out.println(dbC1);

		DBConnector dbC2 = DBConnector.createInsatnce();
		System.out.println(dbC2);
	}

}
