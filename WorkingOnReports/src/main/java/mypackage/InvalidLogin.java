package mypackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class InvalidLogin extends BaseTest{
	
	
	
	@Test
	public void invalidLogin() {
		
	test=extent.createTest("testcase-CAP-5678", "invalidloginmessage");
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys("panrtyui.opert678@gmail.com");
		driver.findElement(By.id("password")).sendKeys("890TYIUOk%^&");
		driver.findElement(By.xpath("//input[@title='Sign in']")).sendKeys("890TYIUOk%^&");
		
		
	}

}
