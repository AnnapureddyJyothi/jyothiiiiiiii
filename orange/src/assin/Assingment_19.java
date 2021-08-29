package assin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment_19 {
	public static void main(String args[]) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\selnuim\\driver\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get("http://mis.nyiso.com/public/");
	    Thread.sleep(3000);
	    driver.switchTo().frame("MENU");
	    System.out.println("freme");
	    driver.findElement(By.xpath("/html/body/table/tbody/tr[6]/td/a")).click();
	    System.out.println("Zonal link clicked");
	    
	    driver.quit();
	    

}}
