package com.actionsClassdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(op);
		driver.get("https://automationteststore.com/");

		By searchLocator = By.id("filter_keyword");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15L));

		WebElement searchField = wait.until(ExpectedConditions.visibilityOfElementLocated(searchLocator));

		searchField.sendKeys("Hello");
//		searchField.sendKeys(Keys.CONTROL + "a");

		Actions ac = new Actions(driver);

		ac.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		ac.keyDown(Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		ac.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		Thread.sleep(3000);
		ac.keyDown(Keys.SHIFT).sendKeys("Nithin").keyUp(Keys.SHIFT).perform();

//		Hover mouse on the element
		By ApparelLocator = By.xpath("//ul[contains(@class,'nav-pills categorymenu')]//a[contains(text(),'Apparel')]");
		ac.moveToElement(wait.until(ExpectedConditions.visibilityOfElementLocated(ApparelLocator))).perform();

	}

}
