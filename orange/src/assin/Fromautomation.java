package assin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fromautomation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\selnuim\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/Downloads/NSR_Selenium%20Automation.html");
		driver.findElement(By.name("firstname")).sendKeys("jjjjjjjjjo");
		driver.findElement(By.name("lastname")).sendKeys("aaaaaaaaaaa");
		driver.findElement( By.id("sex-2")).click();
		driver.findElement(By.name("exp")).click();
		driver.findElement(By.id("datepicker")).sendKeys("2008");
		driver.findElement(By.xpath("//*[@id=\"profession-2\"]")).click();
		driver.findElement(By.id("tool-0")).click();
		driver.findElement(By.id("tool-1")).click();
		driver.findElement(By.id("tool-2")).click();
		driver.findElement(By.id("tool-3")).click();
		driver.findElement(By.id("tool-4")).click();
		driver.findElement(By.id("tool-5")).click();
		Select aaa =new Select(driver.findElement(By.xpath("//*[@id=\"continents\"]")));
		aaa.selectByVisibleText("Asia");
		Select aab =new Select(driver.findElement(By.xpath("//*[@id=\"countries\"]")));
		aab.selectByVisibleText("India");
		Thread.sleep(5000);
		driver.findElement(By.name("submit")).click();
		System.out.println("completed");
	}

}
