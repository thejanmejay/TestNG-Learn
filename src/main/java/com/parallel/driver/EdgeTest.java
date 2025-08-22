package com.parallel.driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class EdgeTest extends BaseTest {

    @Test
    public void openEdge() {
        WebDriver driver = DriverFactory.getDriver();
        driver.get("https://www.facebook.com");
        System.out.println("Title (Facebook): " + driver.getTitle() +
                           " | Thread: " + Thread.currentThread().getId());
    }
}