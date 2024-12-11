package test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicDemo {
	public static WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		//open the browser and url
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@AfterTest
	public void afterTest() {
		//close the browser
		driver.quit();
	}
	
	@Test
	public void pageTitleValidation() {
		//Assignment I from Harry
		//2nd try, from Harry
		//from Kane, here should be Deutsch
		String expectedResult = "Facebook – Anmelden oder Registrieren";
		String actualResult = driver.getTitle();
		
		Reporter.log("Expected Result = " + expectedResult);
		Reporter.log("Actual Result = " + actualResult);
		
		assertTrue(actualResult.equals(expectedResult), "mismatch in the page title");
	}
	
	@Test
	public void welcomeMessageValidation() {
		//Assignment I from Kane
		//2nd try, from Kane
		String expectedResult = "Auf Facebook bleibst du mit Menschen in Verbindung und teilst Fotos, Videos und vieles mehr mit ihnen.";
		String actualResult = driver.findElement(By.xpath("//h2[@class='_8eso']")).getText();
		
		Reporter.log("Expected Result = " + expectedResult);
		Reporter.log("Actual Result = " + actualResult);
		
		assertTrue(actualResult.equals(expectedResult), "mismatch in the page title");
		
	}
}
