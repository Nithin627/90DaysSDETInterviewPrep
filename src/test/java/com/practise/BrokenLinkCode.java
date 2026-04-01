package com.practise;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkCode {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice-automation.com/broken-links/");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (WebElement link : links) {
			String url = link.getAttribute("href");

			getBrokenLinks(url);
		}

	}

	private static void getBrokenLinks(String url) {
		try {
			URL pageUrl = new URL(url);
			HttpURLConnection connection = (HttpURLConnection) pageUrl.openConnection();
			connection.setRequestMethod("HEAD");

			connection.connect();
			int responseCode = connection.getResponseCode();
			if (responseCode >= 200 && responseCode < 400) {
				System.out.println("Valid link: " + pageUrl);
			} else {
				System.out.println("InValid link: " + pageUrl);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
