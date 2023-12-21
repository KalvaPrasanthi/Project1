package com.simplilearn.seleniumtestGoogle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglehomepageTittleTest {
	public static void main(String[] args) {

		// step1: formulate a test domain url & driver path
		String siteUrl = "https://www.google.com/";
		String driverPath = "drivers/windows/chromedriver.exe";

		// step2: set system properties for selenium dirver
		System.setProperty("webdriver.chrome.driver", driverPath);

		// step3: instantiate selenium webdriver
		WebDriver driver = new ChromeDriver();

		// step4: launch browser
		driver.get(siteUrl);

		// step5 : Evaluate the Test
		String Title="Google";
		if(Title.equals(driver.getTitle())) {
			System.out.println("Test is Passed !");
		} else {
			System.out.println("Test is Failed !");
		}
		
		System.out.println("Expected Title :: " + Title);
		System.out.println("Actual Title :: " + driver.getTitle());
		
		
		// step6: Close browser
		driver.close();
	}
}

