package com.practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GitHubTest {

	public static void main(String[] args) {
		WebDriver driver = initDriver();
		driver.get("https://github.com/signup");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Fill signup form
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys("demuuuuuo@gmail.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys("madman%12345");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login"))).sendKeys("Nithinttaa");

		// Scroll to email preferences section
		WebElement emailPrefText = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//legend[contains(text(),' Email preferences ')]")));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({behavior:'smooth'})", emailPrefText);

		// Open country dropdown
		WebElement selectDropDown = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@id,'select-panel')]")));
		selectDropDown.click();

		// Scroll slightly up
		js.executeScript("window.scrollBy(0, -250)");

		// Type "Canada" in search box
		WebElement countrySearchBox = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[contains(@id,'select-panel') and @type='search']")));
		countrySearchBox.sendKeys("Canada");

		// Wait for available countries list
		List<WebElement> countries = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.xpath("//ul[contains(@aria-label,'Select Country/Region options')]//li")));

		// Click Canada if present
		countries.stream().filter(c -> c.getText().equalsIgnoreCase("Canada")).findFirst().ifPresent(WebElement::click);

		// Close browser
		driver.quit();
	}

	private static WebDriver initDriver() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0)); // rely only on explicit waits
		return driver;
	}

}
