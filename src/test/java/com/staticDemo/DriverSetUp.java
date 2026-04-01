package com.staticDemo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class DriverSetUp {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = DrivareFactory.getDriver(BrowserType.CHROME);
	}

}
