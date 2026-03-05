package com.day11;

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

public class GitHubAccountTest {

	public static void main(String[] args) {
		By emailLocator = By.id("email");
		By passwordLocator = By.id("password");
		By userNameLocator = By.id("login");
		By emailPrefTextLocator = By.xpath("//legend[contains(text(),' Email preferences ')]");
		By selectropDownLocator = By.xpath("//button[contains(@id,'select-panel')]");
		By emailLableTextLocator = By.xpath("//label[contains(text(),'Email')]");
		By countrySearchBoxLocator = By.xpath("//input[contains(@id,'select-panel') and @type='search']");
		By allAvailableCoutriesLocator = By.xpath("//ul[contains(@aria-label,'Select Country/Region options')]//li");
		By countryBtnLocator = By.xpath("//span[contains(text(),'Canada')]//..");
		By checkBox = By.id("user_signup[marketing_consent]");

//		GitHub account creation
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(op);
		driver.get("https://github.com/signup");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOfElementLocated(emailLocator)).sendKeys("demuuuuuo@gmail.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(passwordLocator)).sendKeys("madman%12345");
		wait.until(ExpectedConditions.visibilityOfElementLocated(userNameLocator)).sendKeys("Nithinttaa");

		WebElement emailPrefText = wait.until(ExpectedConditions.visibilityOfElementLocated(emailPrefTextLocator));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({behavior:'smooth'})", emailPrefText);

		WebElement selectDropDown = wait.until(ExpectedConditions.elementToBeClickable(selectropDownLocator));
		selectDropDown.click();

		js.executeScript("window.scrollBy(0, -250)");

		WebElement countrySerchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(countrySearchBoxLocator));
		countrySerchBox.sendKeys("Canada");

		WebElement countryBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(countryBtnLocator));
		countryBtn.click();

		/**
		 * List<WebElement> availableCountries = wait
		 * .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(allAvailableCoutriesLocator));
		 * System.out.println(availableCountries.size());
		 * 
		 * for (WebElement country : availableCountries) {
		 * System.out.println(country.getText()); if
		 * (country.getText().equalsIgnoreCase("Canada")) {
		 * 
		 * country.click(); break;
		 * 
		 * }
		 **/

//			js.executeScript("arguments[0].scrollIntoView({behaviour:'smooth'})", emailPrefText);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(checkBox)).click();

//		WebElement emailLabelText = wait.until(ExpectedConditions.visibilityOfElementLocated(emailLableTextLocator));
//		js.executeScript("arguments[0].scrollIntoView({behaviour:'smooth'})", emailLabelText);

//		driver.quit();

	}

}
