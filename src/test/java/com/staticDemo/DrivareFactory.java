package com.staticDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DrivareFactory {

	public static WebDriver getDriver(BrowserType browserType) {
		WebDriver driver;

		switch (browserType) {
		case CHROME:
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			driver = new FirefoxDriver();
			break;
		case EDGE:
			driver = new EdgeDriver();
			break;
		default:
			throw new IllegalArgumentException("BrowserType is not supported: " + browserType);

		}
		return driver;

	}

}
