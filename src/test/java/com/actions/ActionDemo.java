package com.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionDemo {

	@Test
	public void clickAndHold() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebElement Ele1 = driver.findElement(By.xpath("//li[text()='A']"));
		WebElement Ele2 = driver.findElement(By.xpath("//li[text()='C']"));

		Actions ac = new Actions(driver);
		ac.moveToElement(Ele1);
		ac.clickAndHold();
		ac.moveToElement(Ele2);
		ac.release().perform();

	}

}
