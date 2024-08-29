package pageObjectModule;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import loginTest.ArrayList;
//import loginTest.List;
//import loginTest.WebElement;
import java.util.*;
import org.openqa.selenium.*;

public class DashboardPage {
	
	WebDriver driver;
	
  By userDropDown = By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']");
  By about         = By.xpath("//a[text()='About']") ;
  
  public DashboardPage( WebDriver driver) {
	  this.driver=driver;
  }
  
//  public void clickOnUserDropdown() {
//	  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
//	  wait.until(ExpectedConditions.presenceOfElementLocated(userDropDown));
//	  driver.findElement(userDropDown).click();
//  }
  
 
  public void clickOnabout() {
	  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	  wait.until(ExpectedConditions.presenceOfElementLocated(about));
	  driver.findElement(about).click();
  }
  
  public List<String> clickOnUserDropdown1() {
	// Wait until the dropdown is present and then click it
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	wait.until(ExpectedConditions.presenceOfElementLocated(userDropDown));
	driver.findElement(userDropDown).click();

	// Locate the dropdown options
	List<WebElement> dropdownOptions = driver.findElements(By.xpath("//a[@class='oxd-userdropdown-link']"));

	// Create a list to store the text of each option
	List<String> optionsText = new ArrayList<String>();

	// Loop through each WebElement and get the text, then add it to the list
	for (WebElement option : dropdownOptions) {
	optionsText.add(option.getText());
	}
	 System.out.println(optionsText);
	
	// Return the list of option texts
	return optionsText;
	
	}
 
}
 
 

