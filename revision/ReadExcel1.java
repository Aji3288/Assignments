package week6.revision;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {

	public static String[][] readData(String sheets) throws IOException {
		XSSFWorkbook wbook = new XSSFWorkbook ("Revision/CreateLead1.xlsx");
		XSSFSheet sheet = wbook.getSheet(sheets);
		int rowCount = sheet.getLastRowNum();
		short colCount = sheet.getRow(0).getLastCellNum();
		String [][] data = new String [rowCount][colCount];
		for (int i = 1; i <=rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
		//short colCount = row.getLastCellNum();		
		for (int j = 0; j <colCount; j++) {			
 		   XSSFCell cell = row.getCell(j);		
		String stringCellValue = cell.getStringCellValue();
		data[i-1][j]= cell.getStringCellValue();
		System.out.println(stringCellValue);
		}
		}
		wbook.close();
		return data;
		
	}

}
