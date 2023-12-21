package com.simplilearn.seleniumtest.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Phase1AmazonProject {
	
	static WebDriver driver = null;

		public static void main (String[] args) throws InterruptedException {
//			step1: formulate the test domain url and drive path
			String siteUrl = "https://www.amazon.in/";
			String driverPath = "drivers/windows/chromedriver.exe";

//			step2 :  System properties for selenium driver
			System.setProperty("webDriver.chrome.driver", driverPath);

//			step3 : Initiate selenium web driver
			driver = new ChromeDriver();

//			step4 : Launch Browser
			driver.get(siteUrl);

			linktest1();

			Thread.sleep(1000);
			linktest2();

////			Thread.sleep(3000);
//			
////			driver.close();

		}

		/*
		 * verify for the link
		 */
		private static void linktest1() throws InterruptedException {

			WebElement link1 = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]"));
//			
			link1.click();

			Thread.sleep(1000);

			String expectedTitle = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
			String actualTitle = driver.getTitle();

			if (expectedTitle.equals(actualTitle)) {
				System.out.println("test is passed");
			} else {
				System.out.println("test is failed");
			}

			System.out.println("Actual Title :" + actualTitle);
			System.out.println("Expeccted Title :" + expectedTitle);

		}

//			verify the Iphone 13	
		private static void linktest2() throws InterruptedException {

			WebElement link2 = driver.findElement(By.cssSelector("#productTitle"));

			link2.click();

			Thread.sleep(1000);

			String expectedTitle = "Apple iPhone 13 (128GB) - Blue : Amazon.in: Electronics";
			String actualTitle = driver.getTitle();

			if (expectedTitle.equals(actualTitle)) {
				System.out.println("test is passed");
			} else {
				System.out.println("test is failed");
			}

			System.out.println("Actual Title :" + actualTitle);
			System.out.println("Expeccted Title :" + expectedTitle);
		}

	}
			

