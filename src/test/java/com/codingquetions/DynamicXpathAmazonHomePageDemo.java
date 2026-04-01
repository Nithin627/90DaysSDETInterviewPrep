package com.codingquetions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicXpathAmazonHomePageDemo {
	public static void main(String[] args) {
		

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(op);
		driver.get("https://amazon.in/");
		
		//img[contains(@class,'product-image')]//..
		//li[@data-sgproduct]//a
		//li[@data-sgproduct]/child::span/a

	}

}
