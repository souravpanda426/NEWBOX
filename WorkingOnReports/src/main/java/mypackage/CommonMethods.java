package mypackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class CommonMethods {
	
	
public static String getDataFromExcel(String sheetName,int row,int col) throws EncryptedDocumentException, IOException{
		
		String path = "/Users/apple/Desktop/myconttents/github/workingonFramework/workingOnFramework/WorkingOnReports/src/main/java/Resources/testData.xlsx";
		FileInputStream fi = new FileInputStream(path);
		Workbook create = WorkbookFactory.create(fi);
		Cell cell = create.getSheet(sheetName).getRow(row).getCell(col);
		return cell.toString();
		
		
		
	}


public static int getRownum(String sheetName) throws EncryptedDocumentException, IOException {
	
	String path = "/Users/apple/Desktop/myconttents/github/workingonFramework/workingOnFramework/WorkingOnReports/src/main/java/Resources/testData.xlsx";
	FileInputStream fi = new FileInputStream(path);
	Workbook create = WorkbookFactory.create(fi);
	
	int activeSheetIndex = create.getSheet(sheetName).getLastRowNum();
	
	return activeSheetIndex;
}




public static void main(String[] args) throws EncryptedDocumentException, IOException{
	
	
	 int rownum = getRownum("mysheet");
	 System.out.println(rownum);
	

}

}
