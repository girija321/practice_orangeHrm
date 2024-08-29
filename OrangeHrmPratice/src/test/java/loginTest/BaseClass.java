package loginTest;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	WebDriver driver;
	
	String URL= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" ;
	String username = "admin";
	String password = "admin123";
 
	Logger Logger;

	@BeforeClass
	@Parameters("browser")
	public void setup(String browser) {
		
		if(browser.equals("chrome")) {
		driver= new ChromeDriver();}
		
		else if(browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
		driver.get(URL);
		driver.manage().window().maximize();
		
		Logger = Logger.getLogger("orangeHrm");
				
	}
	
//	@AfterClass
//	public void teardown() {
//		driver.quit();
//	}
//	
}
