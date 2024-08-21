package pageObjectModule;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
	
	WebDriver driver;
	
  By userDropDown = By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']");
  By about         = By.xpath("//a[text()='About']") ;
  
  public DashboardPage( WebDriver driver) {
	  this.driver=driver;
  }
  
  public void clickOnUserDropdown() {
	  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	  wait.until(ExpectedConditions.presenceOfElementLocated(userDropDown));
	  driver.findElement(userDropDown).click();
  }
  
  public void clickOnabout() {
	  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	  wait.until(ExpectedConditions.presenceOfElementLocated(about));
	  driver.findElement(about).click();
  }
  
}
