package com.day19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IplT20WebTableTest {
//	https://www.iplt20.com/points-table/men

	public static void main(String[] args) {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(op);
		driver.get("https://www.iplt20.com/points-table/men");
	}

}
