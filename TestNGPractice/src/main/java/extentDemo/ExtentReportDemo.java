package extentDemo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ScreenshotUtility;

public class ExtentReportDemo {

	WebDriver driver;
	ExtentReports extent;
	ExtentHtmlReporter reporter;
	ExtentTest logger;

	@BeforeSuite
	public void setupDriver() throws Exception {
		reporter = new ExtentHtmlReporter("./test-output/Extent/ExtentHtmlReportDemo.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	public void launchGoogle1() {
		logger = extent.createTest("Login Testcases 1");
		driver.get("http://www.google.com");
		Assert.assertEquals(driver.getTitle(), "Google");
	}

	@Test
	public void launchGoogle2() {
		logger = extent.createTest("Login Testcases 2");
		driver.get("http://www.yahoo.com");
		Assert.assertEquals(driver.getTitle(), "Yahoo123413");
	}
	
	@Test
	public void launchGoogle3() {
		logger = extent.createTest("Login Testcases 3");
		driver.get("http://www.bing.com");
		Assert.assertEquals(driver.getTitle(), "Bing");
		throw new SkipException(null);
	}

	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {

		if (result.getStatus() == ITestResult.FAILURE) {
			String temp = ScreenshotUtility.getScreenshot(driver);
			logger.fail(result.getThrowable().getMessage(),
					MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
		}
		else if(result.getStatus() == ITestResult.SUCCESS) {
			logger.pass("Test Case Passed");
		}
		else if(result.getStatus() == ITestResult.SKIP) {
			logger.skip("Test Case Skipped");
		}	
		extent.flush();
	}

	@AfterSuite
	public void closeDriver() {
		driver.quit();
	}
}
