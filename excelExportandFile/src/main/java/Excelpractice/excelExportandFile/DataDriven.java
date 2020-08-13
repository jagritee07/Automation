package Excelpractice.excelExportandFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		//fileInputStream argument
		FileInputStream fis=new FileInputStream("C:\\INFI\\excelExportandFile\\src\\main\\java\\Excelpractice\\excelExportandFile\\TestTable.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		//counting total number of sheets
		int sheets=workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
		if(workbook.getSheetName(i).equalsIgnoreCase("Test"))
		{
		XSSFSheet sheet=workbook.getSheetAt(i);
		//Identify Testcases coloum by scanning the entire 1st row

		Iterator<Row>  rows= sheet.iterator();// sheet is collection of rows
		Row firstrow= rows.next();
		Iterator<Cell> ce=firstrow.cellIterator();//row is collection of cells
		int k=0;
		int coloumn = 0;
		while(ce.hasNext())
		{
		Cell value=ce.next();

		if(value.getStringCellValue().equalsIgnoreCase("Defect ID"))
		{
		coloumn=k;

		}

		k++;
		}
		System.out.println(coloumn);

		
		while(rows.hasNext())
		{

		Row r=rows.next();
		double value = r.getCell(coloumn).getNumericCellValue();

		if(value==12369)
		{

		Iterator<Cell>  cv=r.cellIterator();
		while(cv.hasNext())
		{
		Cell c= cv.next();
		if(c.getCellTypeEnum()==CellType.STRING)
		{

		String a = c.getStringCellValue();
		System.out.println(a);
		
		}
		}
		}
		}
		}
		}
	}
}


