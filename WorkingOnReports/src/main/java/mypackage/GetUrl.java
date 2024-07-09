package mypackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GetUrl	 extends BaseTest{
	
	
  @Test
  public void currentUrl() {
	  
	  
	    test=extent.createTest("URL", "current url");
		driver.get("https://www.google.com");
		
		System.out.println(driver.getCurrentUrl());
		
		
		
  }
}
