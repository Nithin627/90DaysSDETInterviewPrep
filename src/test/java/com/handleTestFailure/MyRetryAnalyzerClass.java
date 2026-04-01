package com.handleTestFailure;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyzerClass implements IRetryAnalyzer {

	private static final int MAX_NUMBER_OF_ATTEMPTS = 2;

	private static int CurrentAtempt = 1;

	@Override
	public boolean retry(ITestResult result) {
		if (CurrentAtempt <= MAX_NUMBER_OF_ATTEMPTS) {
			CurrentAtempt++;
			return true;
		}

		return false;
	}

}
