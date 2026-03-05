package com.day15;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenShots {

	public static void main(String[] args) {

		try {
			WebDriver driver = new ChromeDriver();

			driver.get("http://www.google.com");

			TakesScreenshot ts = (TakesScreenshot) driver;
			File srcfile = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("screenshot.png");
			FileUtils.copyFile(srcfile, dest);
		} catch (IOException e) {

			System.out.println("File not found: " + e.getMessage());
		}

	}

}
