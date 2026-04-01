package com.SingleToneDesignPattern;

public class DBConnector {
	private static DBConnector db;

	private DBConnector() {
		System.out.println("DB Connector");
	}

	public static DBConnector createInsatnce() {
		if (db == null) {
//			Thread safety (only one thread can access the DBConncetor at a time bcz of synchronized)
			synchronized (DBConnector.class) {
				if (db == null) {// double check
					db = new DBConnector();
				}
			}

		}

		return db;
	}

}
