package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Gmaildisplayed extends BaseTest{
	
	
	
	@Test
	public void isGmailButtonDisplayed() {
		test=extent.createTest("TestCase-5328", "check gmail button is displayed");
		//System.setProperty("webdriver.gecko.driver", "/Users/sourav/eclipse-workspace/AUTOMATIONS/src/main/resources/driver/geckodriver");
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Gmail']")).isDisplayed());
		
		}

		
	}


