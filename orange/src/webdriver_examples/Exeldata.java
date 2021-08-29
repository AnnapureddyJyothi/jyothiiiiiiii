package webdriver_examples;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Exeldata {
	public static void main(String args[]) throws Exception	{
		FileInputStream fis = new FileInputStream("C:\\Users\\LENOVO\\Downloads\\WriteData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("test");
		System.out.println(sheet.getSheetName());
		System.out.println(sheet.getLastRowNum());
		System.out.println("Before updating Cell Data"+sheet.getRow(2).getCell(1));
		XSSFCell cell = sheet.getRow(2).getCell(1);
		cell.setCellValue("Test123");
		fis.close();
		FileOutputStream fileOut=new FileOutputStream("C:\\Users\\LENOVO\\Downloads\\WriteData");
		workbook.write(fileOut);
		System.out.println("Updated data after write is done"+cell.getStringCellValue());
		fileOut.close();
	}
	
}
