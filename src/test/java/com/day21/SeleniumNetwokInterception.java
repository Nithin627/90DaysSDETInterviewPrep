package com.day21;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v144.fetch.Fetch;
import org.openqa.selenium.devtools.v144.fetch.model.RequestPattern;
import org.openqa.selenium.devtools.v144.fetch.model.RequestStage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumNetwokInterception {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

//		Access to the DevTools 
		DevTools devTools = ((ChromeDriver) driver).getDevTools();
		devTools.createSession(); // Mandatory!!
		devTools.send(Fetch.enable(
				Optional.of(List
						.of(new RequestPattern(Optional.of("*"), Optional.empty(), Optional.of(RequestStage.REQUEST)))),
				Optional.empty()));

		devTools.addListener(Fetch.requestPaused(), request -> {
			System.out.println("Interceptred!!!");
			System.out.println(request.getRequest().getMethod());
			System.out.println(request.getRequest().getUrl());
			String url = request.getRequest().getUrl();
			if (url.contains("verify")) {
//				intercept and mock the response!!
				System.out.println("Need to mock this api response!!");
				String jsonResponse = """
												{
						    "status": "SUCCESS",
						    "message": "Citizen registration verified successfully.",
						    "transaction_id": "MOCK TXN-TECH-WITH-JATIN",
						    "amount_deducted": "₹00.00 (~$0.00 USD)",
						    "username": "jatin",
						    "timestamp": "2026-03-15T06:15:54.231Z"
						}
												""";
				String jsonResponseBase64 = Base64.getEncoder()
						.encodeToString(jsonResponse.getBytes(StandardCharsets.UTF_8));

				devTools.send(Fetch.fulfillRequest(request.getRequestId(), 200, Optional.empty(), Optional.empty(),
						Optional.of(jsonResponseBase64), Optional.empty()));

			} else {
				devTools.send(Fetch.continueRequest(request.getRequestId(), Optional.empty(), Optional.empty(),
						Optional.empty(), Optional.empty(), Optional.empty()));
			}

		});

		driver.get("http://mock-api.techwithjatin.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement usernameTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		usernameTextBox.sendKeys("jatin123");

		WebElement passwordTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		passwordTextBox.sendKeys("jatin123");

		WebElement registerBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("registerBtn")));
		registerBtn.click();

		System.out.println("register button clicked successfully");
	}

}
