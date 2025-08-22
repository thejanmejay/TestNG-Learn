package com.ParallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTestingTest {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
	//	driver.get("https://www.google.com/");        
		driver.manage().window().maximize();
		System.out.println("Browser launched " + Thread.currentThread().getId());
	}

	@Test(threadPoolSize = 3, invocationCount = 3, timeOut = 10000)
	public void Test1() {
		driver.get("https://www.google.com/");

		System.out.println("Test 1 is running " + Thread.currentThread().getId());
	}

	@Test
	public void Test2() {
		driver.get("https://www.selenium.com/");

		System.out.println("Test 2 is ruhqnning " + Thread.currentThread().getId());
	}
	@Test
	public void Test3() {
		driver.get("https://www.selenium.com/");

		System.out.println("Test 3 is ruhqnning " + Thread.currentThread().getId());
	}

	@AfterMethod
	public void tearDown() {
		if (driver != null) {
	        driver.quit();
	    }
		System.out.println("Test completed " + Thread.currentThread().getId());
	}
}
