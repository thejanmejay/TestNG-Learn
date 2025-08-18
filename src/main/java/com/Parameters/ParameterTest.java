package com.Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	WebDriver driver;

	@Test
	@Parameters({ "env", "browser", "url", "username" })
	public void yahooLoginTest(String env, String browser, String url, String username) {
		if (browser.equals("chrome")) {
			System.out.println("Running test on Chrome browser");
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.out.println("Ruuning test on firefox browser");
			driver = new FirefoxDriver(); // Uncomment if you want to use Firefox
		} else {
			System.out.println("Browser not supported: " + browser);
			return; // Exit if the browser is not supported
		}
		driver.get(url);
		driver.manage().window().maximize(); // MAXIMIZE THE BROWSER WINDOW
		driver.findElement(By.xpath("//input[@id='login-username']")).clear();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(username); // ENTER USERNAME
		driver.findElement(By.xpath("//input[@id='login-signin']")).click(); // CLICK ON NEXT BUTTON

	}

}
