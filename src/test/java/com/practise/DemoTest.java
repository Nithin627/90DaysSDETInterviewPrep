package com.practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTest {
//	setTimeout(()=>{debugger},5000)

	public static WebDriver driver;
	public static ChromeOptions option;
	public static WebDriverWait wait;

	@BeforeMethod
	public void intializebrowser() {
		browserSetup();
		goToUrl("https://rahulshettyacademy.com/AutomationPractice");

	}

	@Test
	public void radioButtonTest() {

		By radioBtn1Locator = By.xpath("//input[@name='radioButton' and @value='radio1']");
		WebElement radioBtn1 = wait.until(ExpectedConditions.visibilityOfElementLocated(radioBtn1Locator));
		radioBtn1.click();

	}

	@Test
	public void autoSuggetionDropDown() {
		By inputFieldLocator = By.xpath("//input[@id='autocomplete']");
		By coutriesLocator = By.xpath("//ul[contains(@class,'ui-menu')]//li");
		WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(inputFieldLocator));
		inputField.sendKeys("Indi");
		List<WebElement> coutries = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(coutriesLocator));
		System.out.println(coutries.size());

		for (WebElement coutry : coutries) {
			String visibleCountries = coutry.getText();

			if (visibleCountries.equalsIgnoreCase("India")) {
				coutry.click();
			}
		}

	}

	@Test
	public void selectDropDownTest() {
		By selectDDLocator = By.id("dropdown-class-example");

		WebElement selectDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(selectDDLocator));

		Select select = new Select(selectDropDown);

		select.selectByIndex(2);
		System.out.println(select.isMultiple());
		System.out.println("First selected option: " + select.getFirstSelectedOption().getText());
		List<WebElement> options = select.getOptions();

		for (WebElement option : options) {
			System.out.println(option.getText());
		}

	}

	private static WebDriver browserSetup() {
		option = new ChromeOptions();
		option.addArguments("--start-maximized");
		driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return driver;
	}

	private static void goToUrl(String url) {
		driver.get(url);
	}
}
