package com.day20;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ThreatLocalTest extends BrowserUtility {


	@BeforeMethod
	public void setup(String browserName) {
		setBrowser(browserName); // Initialize browser before each test
	}

	@Test
	public void test1() {
		getDriver().get("https://www.google.com");
		System.out.println("Page title is: " + getDriver().getTitle());
	}

//	@AfterMethod
//	public void tearDown() {
//		quitDriver(); // Close browser after test
//	}
}