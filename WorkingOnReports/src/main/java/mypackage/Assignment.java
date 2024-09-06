package mypackage;




import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.mongodb.assertions.Assertions;

public class Assignment extends BaseTest{

	
	
	@Test
	public void fileUploading() throws InterruptedException {
		
	
		driver.get("https://try.vikunja.io/register");
		
		
		test=extent.createTest("Assignment", "test assignment");
		
		String userName = RandomStringUtils.randomAlphabetic(2).toString();
		String password = RandomStringUtils.randomAlphabetic(8).toString();
		
		driver.findElement(By.id("username")).sendKeys(userName);
		
		driver.findElement(By.id("email")).sendKeys("username455@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.id("register-submit")).click();
		
	Assertions.isTrue("error message is displayed", driver.findElement(By.xpath("//div[text()='Invalid Data']")).isDisplayed());
		
		
		
		
		
		
		
	
		
		
}
	
}
