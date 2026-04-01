package com.window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SwitchToSpecificWindow {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		// Assume multiple windows/tabs are already opened
		Set<String> windowHandles = driver.getWindowHandles();

		// Convert Set to List for index-based access
		List<String> handlesList = new ArrayList<>(windowHandles);

		// Switch to the 18th window (index 17 because list is 0-based)
		if (handlesList.size() >= 18) {
			driver.switchTo().window(handlesList.get(17));
			System.out.println("Switched to 18th window.");
		} else {
			System.out.println("Less than 18 windows are open.");
		}
	}
}