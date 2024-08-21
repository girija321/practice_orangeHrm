package utility;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {

	private static Workbook workbook;
    private static Sheet sheet;

    public static Object[][] getTestData(String filePath, String sheetName) throws IOException {
        FileInputStream file = new FileInputStream(filePath);
        workbook = WorkbookFactory.create(file);
        sheet = workbook.getSheet(sheetName);

        int rowCount = sheet.getLastRowNum();
        int colCount = sheet.getRow(0).getLastCellNum();
        Object[][] data = new Object[rowCount][colCount];

        for (int i = 0; i < rowCount; i++) {
        	 Row row = sheet.getRow(i + 1);
             for (int j = 0; j < colCount; j++) {
                 data[i][j] = row.getCell(j).toString();
             }
         }

         file.close();
         return data;
     }
 }
        


