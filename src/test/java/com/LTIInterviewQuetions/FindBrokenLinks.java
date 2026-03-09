package com.LTIInterviewQuetions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindBrokenLinks {
	public static void main(String[] args) throws IOException {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--start-maximized");
//		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(op);
		driver.get("https://practice-automation.com/broken-links/");
//		driver.get("https://en.wikipedia.org/wiki/West_Bengal");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		By linksLocator = By.tagName("a");

//		List<WebElement> links = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(linksLocator));
//		System.out.println(links.size());

		List<WebElement> alinks = driver.findElements(linksLocator);
		System.out.println(alinks.size());

		for (WebElement aElement : alinks) {
			System.out.println(aElement.getDomAttribute("href"));
			String url = aElement.getDomAttribute("href");
			checkBrokenLinks(url);

		}

	}

	private static void checkBrokenLinks(String url) throws IOException {

		try {

//		Check if the url is broken or not
			URL urlLink = new URL(url);
			HttpURLConnection connection = (HttpURLConnection) urlLink.openConnection();
			connection.setRequestMethod("HEAD");
			connection.connect(); // To make the connection

			int statusCode = connection.getResponseCode();

			if (statusCode >= 400) {
				System.out.println("Broken Link: " + url);

			} else if (statusCode >= 200 && statusCode < 400) {
				System.out.println("Valid Link: " + url);
			}
		} catch (Exception e) {
			System.err.println("Caught the Exception " + e.getMessage());
		}

	}

}
