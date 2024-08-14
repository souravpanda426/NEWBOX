package mypackage;

import org.testng.annotations.Test;

public class GetUrl	 extends BaseTest{
	
	
  @Test
  public void currentUrl() {
	  
	  
	    test=extent.createTest("URL", "current url");
		driver.get("https://www.google.com");
		
		System.out.println(driver.getCurrentUrl());
		
		
		
  }
}
