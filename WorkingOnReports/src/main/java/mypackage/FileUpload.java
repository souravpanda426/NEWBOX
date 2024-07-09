package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

public class FileUpload extends BaseTest{

	@Test
	public void fileUploading() throws InterruptedException {
		
		
    test=extent.createTest("testfileupload", "need to upload an file");
    
    System.out.println("hello");

	driver.get("https://www.selenium.dev/");
	driver.findElement(By.linkText("About")).click();
	driver.findElement(By.linkText("About Selenium")).click();
	Thread.sleep(7000);
	driver.findElement(By.xpath("(//a[@class='nav-link'])[1]")).click();
	
	
	
	
	}
	
	
	
	@Test(enabled=false)
	  public void getTitle() {
		  
		    test=extent.createTest("testprint", "tittle of webpage");
			
			driver.get("https://www.google.com");
			
			System.out.println(driver.getTitle());
			

	  }
}
