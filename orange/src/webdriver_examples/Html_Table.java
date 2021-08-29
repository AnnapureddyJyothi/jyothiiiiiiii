package webdriver_examples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html_Table {

	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\selnuim\\driver\\chromedriver.exe") ;
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///C:/Users/LENOVO/AppData/Local/Temp/Rar$EXa932.19044/WebTable.html");
		int row=driver.findElements(By.xpath("/html/body/table/tbody/tr[7]/td[4]")).size();
		int col =driver.findElements(By.xpath("/html/body/table/tbody/tr[1]/td[4]")).size();
		int rowcal=driver.findElements(By.xpath("/html/body/table/tbody/tr/td")).size();
		System.out.println(row);
		System.out.println(col);
		System.out.println(rowcal);
	    @SuppressWarnings("unused")
		String data1=driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]")).getText();
		System.out.println("data1");
		for(int i=1;i<=row;i++) {
			//for(int j=1;j<=com;j++) {
				String data=driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]")).getText();
				System.out.println(data);
			}
		}
}
