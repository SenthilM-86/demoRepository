package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterizeExample {
	
	@Test
	@Parameters("pName")
	public void displayName(String name) {
		System.out.println("Name is "+name);
	}

}
