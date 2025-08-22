package com.parallel.driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FireFoxTest {
	 @Test
	    public void openFireFox() {
	        WebDriver driver = DriverFactory.getDriver();
	        driver.get("https://www.facebook.com");
	        System.out.println("Title (FireFox): " + driver.getTitle() + " | Thread: " + Thread.currentThread().getId());
	    }
}
