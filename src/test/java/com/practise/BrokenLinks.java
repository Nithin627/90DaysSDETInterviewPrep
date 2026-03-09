package com.practise;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.AsynchronousSocketChannel;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinks {

	private static int brokenLinkCount = 0;
	private static int validLinkCount = 0;

	public static void main(String[] args) {

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(op);
//		driver.get("https://en.wikipedia.org/wiki/West_Bengal");
		driver.get("https://practice-automation.com/broken-links/");

		By linkLocator = By.tagName("a");

		List<WebElement> aLinks = driver.findElements(linkLocator);

		System.out.println(aLinks.size());

		for (WebElement link : aLinks) {
			String url = link.getDomAttribute("href");

			checkBrokenLink(url);
			printSummary();

		}

	}

	private static void checkBrokenLink(String url) {

		try {
			URL urlLink = new URL(url);
			HttpsURLConnection connection = (HttpsURLConnection) urlLink.openConnection();
			connection.setRequestMethod("HEAD");
			connection.connect();
			int statusCode = connection.getResponseCode();

			if (statusCode >= 400) {
				System.out.println("Broken Link: " + url);
				brokenLinkCount++;

			} else if (statusCode >= 200 && statusCode < 400) {
				System.out.println("Valid Link: " + url);
				validLinkCount++;

			}

//			System.out.println("Total Broken Links: " + brokenLinkCount);
//			System.out.println("Total Valid Links: " + validLinkCount);

		} catch (Exception e) {

			System.err.println("Caught excetion: " + e.getMessage());

		}

	}

	public static void printSummary() {
		System.out.println("Total Broken Links: " + brokenLinkCount);
		System.out.println("Total Valid Links: " + validLinkCount);
	}

}
