package com.day20;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtility {

	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	public static ThreadLocal<WebDriverWait> wait = new ThreadLocal<>();

	private Properties prop;

	// Load properties file
	public BrowserUtility() {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("src/test/java/com/day20/config.properties");
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Failed to load config.properties");
		}
	}

	public WebDriver getDriver() {
		return driver.get();
	}

	public WebDriverWait getWait() {
		return wait.get();
	}

	public void setBrowser(String browserName) {
		browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			driver.set(new ChromeDriver());
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver.set(new EdgeDriver());
		} else {
			throw new IllegalArgumentException("Unsupported browser: " + browserName);
		}

		wait.set(new WebDriverWait(getDriver(), Duration.ofSeconds(20)));
	}

	public void quitBrowser() {
		if (driver != null) {
			driver.get().quit();
			driver.remove();
			wait.remove();
		}

	}
}