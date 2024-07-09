package mypackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Docker {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-extensions");
		options.addArguments("--headless");
		options.addArguments("--disable-gpu");
		options.addArguments("--start-maximized");
		options.addArguments("--disable-infobars");
		options.addArguments("--disable-dev-shm-usage"); 

		String hub = "http://localhost:4444/wd/hub";


		WebDriver driver = new RemoteWebDriver(new URL(hub),options);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());


	}




	

}
