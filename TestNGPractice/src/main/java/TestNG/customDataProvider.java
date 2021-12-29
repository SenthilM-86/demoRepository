package TestNG;

import org.testng.annotations.DataProvider;

public class customDataProvider {
	
	@DataProvider(name = "LoginData")
	public Object[][] getData() {
		Object[][] data = utilities.getData.getExcelData("D:\\Automation\\Test Data\\Credentials.xlsx","LoginData");
		return data;
	}	
		
}


