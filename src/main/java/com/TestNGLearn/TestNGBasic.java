package com.TestNGLearn;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasic {

	public TestNGBasic() {
		// This is a TestNG class to demonstrate the use of annotations
		// @BeforeSuite -- DSetup systtem property for chrome driver
		// @BeforeTest -- Launch Browser
		// @BeforeClass -- Login to application

		// @BeforeMethod -- Enter URL
		// @Test -- Logo Test
		// @AfterMethod -- Log out from application

		// @BeforeMethod -- Enter URL
		// @Test -- Search Text
		// @AfterMethod -- Log out from application

		// @BeforeMethod -- Enter URL
		// @Test -- Verify Title of the page
		// @AfterMethod -- Log out from application

		// @AfterClass -- Delete Cookies
		// @AfterTest -- Close Browser

	}

	// Pre-requisite Annotations
	@BeforeSuite
	public void SetUp() {
		System.out.println("@BeforeSuite -- DSetup systtem property for chrome driver");
	}
	@BeforeTest
	public void LunchBrowser() {
		System.out.println("@BeforeTest -- Launch Browser");
	}
	
	@BeforeClass
	public void Login() {
		System.out.println("@BeforeClass -- Login to application");
	}

	@BeforeMethod
	public void EnterUrl() {
		System.out.println("@BeforeMethod -- Enter URL");
	}

	// Test Annotations
	@Test
	public void Title() {
		System.out.println("@Test -- Verify Title of the page");
	}

	@Test
	public void Search() {
		System.out.println("@Test -- Search Text");
	}
	@Test
	public void LogoTest() {
		System.out.println("@Test -- Logo Test");
	}
	
	// Post-requisite Annotations
	@AfterMethod
	public void LogOut() {
		System.out.println("@AfterMethod -- Log out from application");
	}
	@AfterClass
	public void DeleteCookies() {
		System.out.println("@AfterClass -- Delete Cookies");
	}

	@AfterTest
	public void CloseBrowser() {
		System.out.println("@AfterTest -- Close Browser");
	}



}
