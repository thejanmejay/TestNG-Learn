package com.parallel.driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

    @Test
    public void openGoogle() {
        WebDriver driver = DriverFactory.getDriver();
        driver.get("https://www.x.com");
        System.out.println("Title (X): " + driver.getTitle() +
                           " | Thread: " + Thread.currentThread().getId());
    }
}
