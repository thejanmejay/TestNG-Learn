package com.DataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Test.Utility.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelfeBayTest {
	WebDriver driver;

	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://practicesoftwaretesting.com/auth/register");
	}

	@DataProvider
    public Object[][] getTestData() {
        return TestUtil.getDataFromExcel();
    }

    @Test(dataProvider = "getTestData")
	public void RegistrationTest(String FirstName, String LastName, String DOB, String Street, String PostalCode,
			String City, String State, String Country, String Phone, String Email, String Password) {
		// FIRST NAME
		driver.findElement(By.xpath("//input[@id='first_name']")).clear();
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(FirstName); // ENTER FIRST NAME
		// LAST NAME
		driver.findElement(By.xpath("//input[@id='last_name']")).clear();
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys(LastName); // ENTER LAST NAME

		// DOB
		driver.findElement(By.xpath("//input[@id='dob']")).clear();
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys(DOB); // ENTER DATE OF BIRTH

		// Street Address
		driver.findElement(By.xpath("//input[@id='street']")).clear();
		driver.findElement(By.xpath("//input[@id='street']")).sendKeys(Street); // ENTER STREET ADDRESS

		// postal code
		driver.findElement(By.xpath("//input[@id='postal_code']")).clear();
		driver.findElement(By.xpath("//input[@id='postal_code']")).sendKeys(PostalCode); // ENTER POSTAL CODE

		// city
		driver.findElement(By.xpath("//input[@id='city']")).clear();
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys(City); // ENTER CITY

		// state
		driver.findElement(By.xpath("//input[@id='state']")).clear();
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys(State); // ENTER STATE

		// country
	//	driver.findElement(By.xpath("//input[@id='country']")).clear();
		Select select = new Select(driver.findElement(By.id("country")));
		select.selectByVisibleText(Country);

		// phone
		driver.findElement(By.xpath("//input[@id='phone']")).clear();
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(Phone); // ENTER PHONE NUMBER

		// email
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Email);

		// password
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password); // ENTER PASSWORD

		// register button click
		driver.findElement(By.xpath("//button[normalize-space()='Register']")).click(); // CLICK ON REGISTER BUTTON

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
