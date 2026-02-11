package com.day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FinallyBlockTest {

	public static void main(String[] args) {

		WebDriver driver = null;

		try {

			driver = new ChromeDriver();
			driver.get("https://google.com/");
			throw new RuntimeException("Test failed unecpetedly");

		} catch (Exception e) {

			System.out.println("Exception caught:" + e.getMessage());

		} finally {

			if (driver != null) {
				driver.quit();
				System.out.println("Browser closed successfully!..");

			}

		}

	}

}
