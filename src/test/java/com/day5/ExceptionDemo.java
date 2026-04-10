 package com.day5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {

	public static void main(String[] args) {

		File file = new File("data.txt");
		FileReader fr;
		try {
			fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println("Unable to find the file: " + file + ", " + e.getMessage());

			e.printStackTrace();
		}
	}

}
