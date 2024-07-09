package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Gmail extends BaseTest {
  @Test
  public void gmailLogin() throws InterruptedException {
	  
	  
	  test=extent.createTest("Gmail", "GmailSignIn");
	
	   driver.get("https://www.google.com");
	   
	   driver.findElement(By.xpath("//a[text()='Gmail']")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	   WebElement findElement = driver.findElement(By.id("identifierId"));
	   findElement.sendKeys("panda.sourav426@gmail.com");
	   driver.findElement(By.xpath("//span[.='Next']")).click();
	   
	  
	  
	  
  }
}
