package mypackage;

import org.testng.annotations.Test;

public class RediffMail extends BaseTest{
	
	
	
	@Test
	public void mail() {
		test=extent.createTest("getTitle", "get title of webPage");
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		String title = driver.getTitle();
		System.out.println(title);
		
		
	}

}
