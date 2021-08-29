package assin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class Assign11 {
	public static void main(String RGS[]) throws Exception {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","D:\\selnuim\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	
	Actions abc =new Actions(driver);
	WebElement fromElement = driver.findElement(By.xpath("//li[@ id='credit2']/a"));
	WebElement toElement = driver.findElement(By.xpath("//ol[@ id ='bank']/li"));
	abc.dragAndDrop(fromElement, toElement).build().perform();
	Thread.sleep(3000);
	System.out.println("1 dropdown completed");
	
	WebElement fromElement2 = driver.findElement(By.xpath("//li[@ id='fourth']/a"));
	WebElement toElement2 = driver.findElement(By.xpath("//ol[@ id='amt7']/li"));
	abc.dragAndDrop(fromElement2, toElement2).build().perform();
	Thread.sleep(3000);
	System.out.println("2 dropdown completed");
	
	WebElement fromElement3 = driver.findElement(By.xpath("//li[@ id='credit1']/a"));
	WebElement toElement3 = driver.findElement(By.xpath("//ol[@ id='loan']/li"));
	abc.dragAndDrop(fromElement3, toElement3).build().perform();
	Thread.sleep(3000);
	System.out.println("3 dropdown completed");
	
	WebElement fromElement4 = driver.findElement(By.xpath("//*[@ id='fourth']/a"));
	WebElement toElement4 = driver.findElement(By.xpath("//ol[@ id='amt8']/li"));
	abc.dragAndDrop(fromElement4, toElement4).build().perform();
	Thread.sleep(3000);
	System.out.println("4 dropdown completed");
	
	WebElement abcd=driver.findElement(By.xpath("//div[@ id='equal']/a"));
	System.out.println(abcd.getText());

	driver.quit();

}
}