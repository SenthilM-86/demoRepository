package TestNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class listenersExample {
	@Test
	public void test1() {
		System.out.println("We are in Test 1 and it will pass");
	}
	
	@Test(expectedExceptions = RuntimeException.class)
	public void test2() {
		System.out.println("We are in Test 2 and it will fail");		
	}
	
	
	@Test
public void test3() {
		throw new SkipException("We are in Test 3 and it will skip");
	}
	
	
	@Test(timeOut = 2000)
public void test4() throws Exception {
		Thread.sleep(3000);
		System.out.println("We are in Test 4 and it will fail due to timeout");
	
}
	
	int i = 0;
	@Test(successPercentage = 60, invocationCount = 5)
public void test5() {
		i++;
		System.out.println("We are in Test 5 and invocation count: "+i);
		if (i==1||i==2) {
			Assert.assertEquals(i, 8);
			System.out.println("Test 5 is Failed");
		}
		
	
}
}
