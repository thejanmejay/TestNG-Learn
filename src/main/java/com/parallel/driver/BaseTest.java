package com.parallel.driver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseTest {

	@Parameters("browser")
	@BeforeMethod
	public void setUp(String browser) {
		DriverFactory.setDriver(browser);
	}

	@Test
	public void baseTest() {
		System.out.println("This is base test message."); // This is a placeholder for any base test logic you might
															// want to implement.
		// It can be used to verify that the setup is working correctly.
	}

	@AfterMethod
	public void tearDown() {
		DriverFactory.quitDriver();
	}
}
