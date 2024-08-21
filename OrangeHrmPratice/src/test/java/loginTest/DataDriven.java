package loginTest;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ExcelReader;

public class DataDriven {

	  @DataProvider(name = "testData")
	    public Object[][] testData() throws IOException {
	        return ExcelReader.getTestData("path/to/your/excelfile.xlsx", "Sheet1");
	    }

	    @Test(dataProvider = "testData")
	    public void testWithData(String username, String password) {
	        // Your test logic using the data
	        System.out.println("Username: " + username);
	        System.out.println("Password: " + password);
	        // Add assertions or actions here
	    }
}
