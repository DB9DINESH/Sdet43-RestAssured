package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;





public class ExcelUtility  {
	
	public String readdatafromExcel(String sheetName, int rowNo,int coloumnNo) throws EncryptedDocumentException, IOException
	{
		FileInputStream fi=new FileInputStream(IPathConstants.excelPath);
		Workbook wb=WorkbookFactory.create(fi);
		 Sheet sh = wb.getSheet(sheetName);
		 Row ro = sh.getRow(rowNo);
		  Cell cel = ro.getCell(coloumnNo);
		  String value = cel.getStringCellValue();
		  return value;
					
	}
	
	public Object[][] readMultipledata(String sheetName) throws EncryptedDocumentException, IOException
	{

		FileInputStream fi=new FileInputStream(IPathConstants.excelPath);
		Workbook wb=WorkbookFactory.create(fi);
		Sheet sh=wb.getSheet(sheetName);
		
		int lastrow = sh.getLastRowNum()+1;
		int lastcell = sh.getRow(0).getLastCellNum();
		
		Object[][] obj=new Object[lastrow][lastcell];
		
		for(int i=0;i<lastrow;i++)
		{
			for(int j=0;j<lastcell;j++)
			{
				
				obj[i][j] =sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return obj;
	}

}
