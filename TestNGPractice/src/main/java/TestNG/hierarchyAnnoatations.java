package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hierarchyAnnoatations {
	
	@BeforeSuite
	public void beforesuitemethod() {
		System.out.println("This is Before Suite");
	}
	
	
	@AfterSuite
	public void aftersuitemethod() {
		System.out.println("This is After Suite");
	}
	
	
	@BeforeClass
	public void beforeclassmethod() {
		System.out.println("This is Before Class");
	}
	
	
	@AfterClass
	public void afterclassmethod() {
		System.out.println("This is After Class");
	}
	
	
	@BeforeTest
	public void beforetestemethod() {
		System.out.println("This is Before Test");
	}
	
	
	@AfterTest
	public void aftertestmethod() {
		System.out.println("This is After Test");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("This is Before Method");
	}
	
	@AfterMethod
	public void aftertmethod() {
		System.out.println("This is After Method");
	}
	
	
	@Test
	public void test1() {
		System.out.println("This is actual test case 1");
		
	}
	
	
	 @Test 
	 public void test2() { 
		 System.out.println("This is actual test case 2");
	 
	 }

}
