package assin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class platformqute_assign12 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\selnuim\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.platformqedu.com/");
		
		Actions aaa=new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//div[ text()='About']"));
	    aaa.moveToElement(element).build().perform();
	    
	    WebElement element2 = driver.findElement(By.xpath("//div[text()='Compare']"));
	    aaa.moveToElement(element2).build().perform();
	    
	    driver.quit();
	    
  

	}
}   