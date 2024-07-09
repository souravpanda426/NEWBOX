package mypackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest extends BaseTest{
  @Test
  public void f() {
	  
	  
	  
	  test=extent.createTest("getTitle", "get title of webPage");
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		String title = driver.getCurrentUrl();
		Assert.assertEquals(title, "https://mail.rediff.com/cgi-bin/login.cgi");
  }
}
