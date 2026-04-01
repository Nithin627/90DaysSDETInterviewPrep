package com.day24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoTest1 {

	private WebDriver driver;

	@Parameters({ "browser", "isLamdaTest", "isHeadLess" })
	@BeforeClass
	public void setUp(String browser, String isLamdaTest, String isHeadLess) {
		boolean headless = Boolean.parseBoolean(isHeadLess);

		if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			if (headless) {
				options.addArguments("--headless=new");
			}
			driver = new ChromeDriver(options);
		} else if (browser.equalsIgnoreCase("firefox")) {
			FirefoxOptions options = new FirefoxOptions();
			if (headless) {
				options.addArguments("--headless");
			}
			driver = new FirefoxDriver(options);
		} else {
			throw new IllegalArgumentException("Unsupported browser: " + browser);
		}

		driver.manage().window().maximize();
	}

	@Test
	public void verifyLogin() {
		driver.get("https://example.com/login");

		// Example pseudo-code for login steps
		// driver.findElement(By.id("username")).sendKeys("testuser");
		// driver.findElement(By.id("password")).sendKeys("password123");
		// driver.findElement(By.id("loginButton")).click();

		// Example assertion
		// Assert.assertTrue(driver.findElement(By.id("dashboard")).isDisplayed());

		System.out.println("Login test executed successfully on: " + driver.getTitle());
	}

	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}