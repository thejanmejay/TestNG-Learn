package com.TestNGLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;   // ✅ Correct Assert import
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTitleTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        driver.get("https://www.google.com");
    }

    @Test
    public void googleTitleTest() {
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);

        Assert.assertEquals(title, "Facebook", "Title is not matched");
    }
    @Test
    public void GoogleLogoTest() {
		boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
		System.out.println("Google logo is displayed: " + b);
		Assert.assertTrue(b);
		// Assert.assertEquals(b, true);
	}

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        System.out.println("Browser closed.");
    }
}
