package utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
// This is a Screenshot Reusable Utility
public class ScreenshotUtility {
	
	public static String getScreenshot(WebDriver driver) {
		
	
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"/test-output/Extent/Screenshots/"+System.currentTimeMillis()+".png";
		File dest = new File(path);		
		try {	
		FileUtils.copyFile(src, dest);		
		}		
		catch (Exception e) {
			System.out.println("Capture Failed "+e.getMessage());
		}		
		
		return path;
	}

}
