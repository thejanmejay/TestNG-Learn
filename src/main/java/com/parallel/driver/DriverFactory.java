package com.parallel.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void setDriver(String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver.set(new ChromeDriver());
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver.set(new FirefoxDriver());
                break;
            case "edge":
                // Use local EdgeDriver path
                System.setProperty("webdriver.edge.driver",
                        "C:\\Users\\JanmejaySingh\\Downloads\\edgedriver_win64\\msedgedriver.exe");
                driver.set(new EdgeDriver());
                break;
            default:
                throw new IllegalArgumentException("Browser not supported: " + browser);
        }
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {
        driver.get().quit();
        driver.remove();
    }
}
