package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class beforeAfterSuiteExample {

	WebDriver driver;
	@BeforeSuite(groups = {"Search","Cart"})
	public void launchDriver() {
		WebDriverManager.chromedriver().setup();
		driver = (WebDriver) new ChromeDriver();
	}

	@Test(groups={"Search"})
	public void openGoogle() {

		driver.get("https://www.google.com");
		System.out.println("Google Search Engine Launched");
	}

	@Test(groups={"Search"})
	public void openBing() {
		driver.get("https://www.bing.com");
		System.out.println("Bing Search Engine Launched");
	}

	@Test(groups={"Search"})
	public void openYahoo() {
		driver.get("https://www.yahoo.com");
		System.out.println("Yahoo Search Engine Launched");
	}
	
	@Test(groups={"Cart"})
	public void openAmazon() {

		driver.get("https://www.amazon.in/");
		System.out.println("Amazon Shopping site Launched");
	}

	@Test(groups={"Cart"})
	public void openFlipkart() {
		driver.get("https://www.flipkart.com/");
		System.out.println("Flipkart Shopping site Launched");
	}

	@Test(groups={"Cart"})
	public void openMyntra() {
		driver.get("https://www.myntra.com/");
		System.out.println("Myntra Shopping site Launched");
	}

	@AfterSuite(groups = {"Search","Cart"})
	public void closeDriver() {
		driver.quit();
	}

}
