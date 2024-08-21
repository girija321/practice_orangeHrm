package loginTest;

import org.testng.Assert;

import pageObjectModule.LoginPage;

public class Test extends BaseClass {
	LoginPage login;
	
	@org.testng.annotations.Test
	public void login() {
		login = new LoginPage(driver);
		login.clickOnUsername(username);
		Logger.info("entered username");
		
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
	
	public void dashboard() {
		
	}

}
