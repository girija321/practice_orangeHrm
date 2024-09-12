package pageObjectModule;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.*;
import org.openqa.selenium.*;

public class DashboardPage {

    WebDriver driver;
    
    By userDropDown = By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']");
    By dropdownOptionsLocator = By.xpath("//a[@class='oxd-userdropdown-link']");
  
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }
  
    public void clickOnUserDropdown() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.presenceOfElementLocated(userDropDown));
        driver.findElement(userDropDown).click();
    }
  /*  public List<String> getUserDropdownOptions() {
        
        // Click on dropdown
        clickOnUserDropdown();
        
        // Fetch the dropdown options
        List<WebElement> dropdownOptions = driver.findElements(dropdownOptionsLocator);
        List<String> optionsText = new ArrayList<String>();
        
        // Print the number of dropdown options found
        System.out.println("Number of dropdown options found: " + dropdownOptions.size());
        
        // Loop through each WebElement and get the text, then add it to the list
        for (WebElement option : dropdownOptions) {
            String text = option.getText();
            optionsText.add(text);
            // Print each dropdown option's text
            System.out.println("Dropdown option text: " + text);
        }
        
        // Return the list of option texts
        return optionsText;
    }*/

  //working
    public List<String> getUserDropdownOptions() {
    	
    	// Click on dropdown
        clickOnUserDropdown();
        
        // Fetch the dropdown options
        List<WebElement> dropdownOptions = driver.findElements(dropdownOptionsLocator);
        List<String> optionsText = new ArrayList<String>();
        
        // Loop through each WebElement and get the text, then add it to the list
        for (WebElement option : dropdownOptions) {
            optionsText.add(option.getText());
         
        }
        System.out.println("Actual Options List"+optionsText);
      return optionsText; // Return the list of option texts
    }
    
    
    
 

    
    
    





 
  


 
}
 


