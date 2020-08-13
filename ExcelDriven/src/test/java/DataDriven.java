 import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDriven {
	
	static Workbook book;
	static Sheet sheet;
	public static String TESTDATA_SHEET_PATH ="C:\\INFI\\ExcelDriven\\src\\test\\java\\demodata.xlsx";

	public static Object[][] getTestData(String testdata) throws Exception
	{
		//load workbook
		FileInputStream file=null;
		try {
			file=new FileInputStream(TESTDATA_SHEET_PATH);	
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		try {
			
				book=WorkbookFactory.create(file);
			} 
			
		catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		//load sheet
		sheet=book.getSheet("testdata");
		//create array and pass rows and columns
		Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		//// This will run a loop and each iteration  it will fetch new row
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
			for(int k=0;k<sheet.getRow(0).getLastCellNum();k++)
			{
				data[i][k]=sheet.getRow(i + 1).getCell(k).toString();
			}
		}
		return data;
		
		
	}	
	
}
