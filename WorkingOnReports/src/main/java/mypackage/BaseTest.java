package mypackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseTest {
	
	
	ExtentReports extent;
	ExtentTest test;
	
	WebDriver driver;
		
		
	
	@BeforeTest
	public void startReport() {
	
		
		
	ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/testReport.html");
	//ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("/Users/sourav/eclipse-workspace/WorkingOnReports/test-output/ExtentReport"+"ext.html");
	extent= new ExtentReports();
	htmlReporter.config().setDocumentTitle("AutomationReport");
	htmlReporter.config().setReportName("report");
	extent.attachReporter(htmlReporter);
	htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
	htmlReporter.config().setTheme(Theme.DARK);
	//System.setProperty("webdriver.gecko.driver", "/Users/sourav/eclipse-workspace/AUTOMATIONS/src/main/resources/driver/geckodriver");
	 driver = new FirefoxDriver();
	
	
	
	/*<plugin>
	<artifactId>maven-compiler-plugin</artifactId>
	<configuration>
		<compilerVersion>1.5</compilerVersion>
		<source>1.7</source>
		<target>1.7</target>
	</configuration>
</plugin>*/

	}
	
	@AfterMethod
	public void close(ITestResult result) throws IOException {
		
		
		
		
		
		
		if(result.getStatus()==ITestResult.FAILURE) {
			
			
			test.log(Status.FAIL, "test case failed is"+result.getName());
		
			
			
			
			
		}
		
		else if(result.getStatus()==ITestResult.SUCCESS){
			
		test.log(Status.PASS, "test case passed is"+result.getName());
		
		}
		
		else if(result.getStatus()==ITestResult.SKIP) {
			test.log(Status.SKIP, "test case skipped is"+result.getName());
		}
		
		
	
	
	
	

}
	
@AfterTest
public void test() {
	extent.flush();
	driver.close();
	
	
}
	
}


