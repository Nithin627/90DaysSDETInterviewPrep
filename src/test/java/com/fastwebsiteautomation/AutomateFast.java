package com.fastwebsiteautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomateFast {

	public static void main(String[] args) {

		By speedValueLocator = By.id("speed-value");
		By speedUnitLocator = By.id("speed-units");

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--start-maximized");

		WebDriver driver = new ChromeDriver(op);
		driver.get("https://fast.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		String className;

		while (true) {
			WebElement speedValue = wait.until(ExpectedConditions.visibilityOfElementLocated(speedValueLocator));
			WebElement speedUnit = wait.until(ExpectedConditions.visibilityOfElementLocated(speedUnitLocator));

			System.out.println(speedValue.getText() + " " + speedUnit.getText());

			className = speedValue.getAttribute("class");

			if (className != null && className.contains("succeeded")) {
				break;
			}

		}

		WebElement speedValue = wait.until(ExpectedConditions.visibilityOfElementLocated(speedValueLocator));
		WebElement speedUnit = wait.until(ExpectedConditions.visibilityOfElementLocated(speedUnitLocator));

		System.out.println("Final Speed ........" + speedValue.getText() + " " + speedUnit.getText());

		driver.quit();

	}

}
