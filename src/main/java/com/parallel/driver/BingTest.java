package com.parallel.driver;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class BingTest extends BaseTest {

    @Test
    public void openBing() {
        WebDriver driver = DriverFactory.getDriver();
        driver.get("https://www.instagram.com");
        System.out.println("Title (Instagram): " + driver.getTitle() +
                           " | Thread: " + Thread.currentThread().getId());
    }
}