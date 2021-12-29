package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assertionExample {
	
	WebDriver driver;
	
	@BeforeSuite
	public void launchDriver() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();		
	}
	
	@Test
	public void titleTest() throws Exception {
		Thread.sleep(3000);
		String title = driver.getTitle();
		Assert.assertEquals("Google1", title, "Title is not matching");
	}
	@Test
	public void logoTest() throws Exception {
		Thread.sleep(3000);
		WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
		Assert.assertTrue(logo.isDisplayed(), "Logo not displayed");
	}
	
	@AfterSuite
	public void closeDriver() {
		driver.quit();
	}
	

}
