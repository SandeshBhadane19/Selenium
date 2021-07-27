package sandeshselenium;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("‪./login.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("login");
		int rowCount = sh.getPhysicalNumberOfRows();
		int colCount = sh.getRow(0).getLastCellNum();

		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				Cell cl = sh.getRow(i).getCell(j);
				System.out.println(cl);
			}
		}
	}


public static String readCell(String path,String sheetName,int row,int col) throws Exception, Exception, Exception {
	FileInputStream fis = new FileInputStream("‪./login.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetName);
	Cell cl = sh.getRow(row).getCell(col);
	return cl.toString();
	
}
}





