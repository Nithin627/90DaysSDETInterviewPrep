package com.day5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.openqa.selenium.WebElement;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		m1();

	}

	public void clickOn(WebElement ele) {

		try {

			ele.click();

		} catch (Exception e) {

//			throw new RuntimeException("Click operation Failed ", e);
			throw new InvalidTestDataException("Test Data not found: " + e.getMessage());

		}

	}

	public static void m1() {
		File file = new File("data.txt");
		FileReader fr;
		try {
			fr = new FileReader(file);
		} catch (FileNotFoundException e) {
//			System.out.println("Unable to find the file: " + e.getMessage());
			throw new InvalidTestDataException("Test Data not found: " + e.getMessage());

//			e.printStackTrace();
		}

	}

	public static void m2() throws FileNotFoundException {
		File file = new File("data.txt");
		FileReader fr;
		fr = new FileReader(file);

	}

}
