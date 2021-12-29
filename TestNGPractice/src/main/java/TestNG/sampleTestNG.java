package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sampleTestNG {
	
	@Test(priority = 0)
	public void firstTestCase() throws Exception {
		System.out.println("First Test Case");
		Thread.sleep(5000);
	}
	@Test(priority = 1)
	public void secondTestCase() throws Exception {
		Thread.sleep(5000);
		System.out.println("Second Test Case");
		
	}
	@Test(priority = 2, timeOut = 2000)
	public void thirdTestCase() throws Exception {
		Thread.sleep(5000);
		System.out.println("Third Test Case");
		
	}
	@Test(priority = 3)
	public void fourthTestCase() throws Exception {
		Thread.sleep(5000);
		System.out.println("Fourth Test Case");
		
	}
	
	@Test(priority = 4)
	public void testingAssertions() {
		String name = "Akash";
		System.out.println("Assertion Test Started");
		Assert.assertEquals(name, "Akas");
		System.out.println("Assertion Test Completed");
	}
	
}
