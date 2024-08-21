package pageObjectModule;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginPage  {
	WebDriver driver;
	
	 By username = By.name("username");
	 By password = By.name("password");
	 By submit =   By.xpath("//button");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	public void clickOnUsername(String user) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.presenceOfElementLocated(username));
		driver.findElement(username).sendKeys(user);
		
	}
	

	public void clickOnPassword(String passwor) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.presenceOfElementLocated(password));
		driver.findElement(password).sendKeys(passwor);
		
	}
	
	public void clickOnSubmit() {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.presenceOfElementLocated(submit));
		driver.findElement(submit).click();
	}
}
