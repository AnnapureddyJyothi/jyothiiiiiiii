package assin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Flipkart {
	public static void main(String aargs[]) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\selnuim\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Grocery']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// enter pin
		driver.findElement(By.name("pincode")).sendKeys("500001");
		driver.findElement(By.name("pincode")).sendKeys(Keys.RETURN);
		Actions act =new Actions(driver);
		WebElement menu =driver.findElement(By.name("//*[@id=\"container\"]/div/div[2]/div/div/div[2]/a/div[1]/div/img"));
		act.moveToElement(menu).build().perform();
		driver.findElement(By.name("")).click();

	}
		

		
}