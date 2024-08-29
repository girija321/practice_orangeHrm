package loginTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;

import pageObjectModule.DashboardPage;
import pageObjectModule.LoginPage;
import utility.ExcelReader;

public class Test extends BaseClass {
	LoginPage login;
	DashboardPage dashboard;
	@DataProvider(name = "testData")
    public Object[][] testData() throws IOException {
        return ExcelReader.getTestData("C:/Users/admin/git/practice_orangeHrm/OrangeHrmPratice/src/test/resources/data driven.xlsx", "Sheet1");
    }
   
	@org.testng.annotations.Test(dataProvider = "testData", priority=0 ) 
	    public void testWithData(String username, String password) {
	        // Your test logic using the data
		login = new LoginPage(driver);
		login.clickOnUsername(username);
		Logger.info("entered username"+ username );
		
		login.clickOnPassword(password);
		Logger.info("entered password");
		
		login.clickOnSubmit();
		Logger.info("clicked on submit button");
		
		if(driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")) {
		Assert.assertTrue(true);
		Logger.info("test pass"); }
		
	else { Assert.assertTrue(false);
	    Logger.info("test fail");
	    
	   
	}
		
	    }
	
	
//	@org.testng.annotations.Test
//	public void login() {
//		login = new LoginPage(driver);
//		login.clickOnUsername(username);
//		Logger.info("entered username");
//		
//		login.clickOnPassword(password);
//		Logger.info("entered password");
//		
//		login.clickOnSubmit();
//		Logger.info("clicked on submit button");
//		
//		if(driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")) {
//		Assert.assertTrue(true);
//		Logger.info("test pass"); }
//		
//	else { Assert.assertTrue(false);
//	    Logger.info("test fail");
//	}
//	
//	}
//	
	
	@org.testng.annotations.Test (priority = 1) 
	public void dashboard() {
		dashboard = new DashboardPage(driver);
		//dashboard.clickOnUserDropdown(); 
		dashboard.clickOnUserDropdown1();
	

	
	}


}
