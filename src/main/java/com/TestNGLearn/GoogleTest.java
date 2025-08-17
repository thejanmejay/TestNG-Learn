package com.TestNGLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {

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

	@Test(priority=1, groups="Title")
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
		
	}

	@Test(priority=2, groups="Logo")
	public void GoogleLogoTest() {
		boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
		System.out.println("Google logo is displayed." + b);
	}

	@Test(priority=3, groups="Search")
	public void googleSearchTest() {
		driver.findElement(By.name("q")).sendKeys("Selenium WebDriver");
		driver.findElement(By.name("btnK")).click();
		String searchResultTitle = driver.getTitle();
		System.out.println("Search result title is: " + searchResultTitle);
	}	
	@Test(priority=4, groups="SearchBox")
	public void googleSearchBoxTest() {
		boolean isSearchBoxDisplayed = driver.findElement(By.name("q")).isDisplayed();
		System.out.println("Google search box is displayed: " + isSearchBoxDisplayed);
	}
	@Test(priority=5, groups="SearchButton")
	public void googleSearchButtonTest() {
		boolean isSearchButtonDisplayed = driver.findElement(By.name("btnK")).isDisplayed();
		System.out.println("Google search button is displayed: " + isSearchButtonDisplayed);
	}
	@Test(priority=6, groups="FeelingLuckyButton")
	public void googleFeelingLuckyButtonTest() {
		boolean isFeelingLuckyButtonDisplayed = driver.findElement(By.name("btnI")).isDisplayed();
		System.out.println("Google 'I'm Feeling Lucky' button is displayed: " + isFeelingLuckyButtonDisplayed);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		System.out.println("Browser closed successfully.");
	}
}
