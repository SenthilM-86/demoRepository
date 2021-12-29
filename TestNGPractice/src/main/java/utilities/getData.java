package utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class getData {
	
public static String[][] getExcelData(String fileName, String sheetName) {
		
		String[][] arrayExcelData = null;

		FileInputStream fs;
		XSSFWorkbook wb;
		try {
			fs = new FileInputStream(fileName);
			wb = new XSSFWorkbook(fs);
			XSSFSheet sh  = wb.getSheet(sheetName);
			XSSFRow row = sh.getRow(0);
			XSSFCell cell;
			
			int nrows = sh.getPhysicalNumberOfRows();
			int ncols = row.getLastCellNum();
			
			arrayExcelData = new String[nrows-1][ncols];
			for(int i=1; i<nrows;i++) {
				for(int j=0;j<ncols;j++) {
					row = sh.getRow(i);
					cell = row.getCell(j);
					arrayExcelData[i-1][j] = cell.getStringCellValue();
				}
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return arrayExcelData;
}

}
