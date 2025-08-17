package com.TestNGLearn;

import org.testng.annotations.Test;

public class TestNGFeatures {

	@Test(priority = 1, groups="login")
	public void loginTest() {
		System.out.println("Login Test");
		int i = 9 / 3; // This will cause an ArithmeticException
		System.out.println("Result of division: " + i);
	}

	@Test(groups="login",dependsOnMethods = "loginTest")
	public void HomnePageTest() {
		System.out.println("Homes page Test");
	}
	
	@Test(groups="login",dependsOnMethods = "HomnePageTest")
	public void SearchPageTest() {
		System.out.println("Search page Test");
	}
	@Test(priority = 2, groups="logout")
	public void LogoutTest() {
		System.out.println("Logout Test");
	}
}
