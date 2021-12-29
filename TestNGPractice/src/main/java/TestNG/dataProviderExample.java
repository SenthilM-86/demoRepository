package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.HighlightUtility;

public class dataProviderExample {
	WebDriver driver;

	@Test(dataProvider = "LoginData", dataProviderClass = customDataProvider.class)
	public void loginTest(String userName, String passWord) throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement loginbtn = driver.findElement(By.className("login"));
		HighlightUtility.highlightElement(driver, loginbtn);
		loginbtn.click();
		
		WebElement emailbox = driver.findElement(By.id("email"));
		HighlightUtility.highlightElement(driver, emailbox);
		emailbox.sendKeys(userName);
		
				
		WebElement passwordbox = driver.findElement(By.id("passwd"));
		HighlightUtility.highlightElement(driver, passwordbox);
		passwordbox.sendKeys(passWord);
		
		
		WebElement submitbtn = driver.findElement(By.id("SubmitLogin"));
		HighlightUtility.highlightElement(driver, submitbtn);
		submitbtn.click();
		
		
		WebElement logoutbtn = driver.findElement(By.className("logout"));
		HighlightUtility.highlightElement(driver, loginbtn);
		logoutbtn.click();
		driver.quit();
	}
}
