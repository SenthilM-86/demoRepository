package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallelTesting {
	
	WebDriver driver;

	@Test
	public void openGoogle() {
		WebDriverManager.chromedriver().setup();
		driver = (WebDriver) new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Google Search Engine Launched");
		driver.quit();
	}

	@Test
	public void openBing() {
		WebDriverManager.chromedriver().setup();
		driver = (WebDriver) new ChromeDriver();
		driver.get("https://www.bing.com");
		System.out.println("Bing Search Engine Launched");
		driver.quit();
	}

	@Test
	public void openYahoo() {
		WebDriverManager.chromedriver().setup();
		driver = (WebDriver) new ChromeDriver();
		driver.get("https://www.yahoo.com");
		System.out.println("Yahoo Search Engine Launched");
		driver.quit();
	}

}
