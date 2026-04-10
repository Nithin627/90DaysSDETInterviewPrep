package com.existingBrowserInvoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ConnectingToExistingBrowserSession {

	public static void main(String[] args) {
		ChromeOptions op = new ChromeOptions();
		op.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");
		WebDriver driver = new ChromeDriver(op);

		driver.get("https://www.google.com/");
		driver.get("https://www.facebook.com/");
		driver.get("https://www.youtube.com/");
		driver.get("https://www.Instagram.com/");

	}

}
