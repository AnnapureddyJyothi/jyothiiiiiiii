package webdriver_examples;
import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;

public class Exeel {
	public static void main(String args[]) throws	Exception{
FileInputStream f1=new FileInputStream("C:\\Users\\LENOVO\\Downloads\\ReadExcel.xlsx");
Workbook w1=Workbook.getWorkbook(f1);
		Sheet s1 =w1.getSheet("1");
		int rows = s1.getRows();
		System.out.println(rows);
		for(int i=1;i<rows;i++) {
		String EmpID= s1.getCell(0,i).getContents();
		String EmpName= s1.getCell(1,i).getContents();
		String EmpMail= s1.getCell(2,i).getContents();
		System.out.println(EmpID);
		System.out.println(EmpName);
		System.out.println(EmpMail);	
	}
	
	}
}
