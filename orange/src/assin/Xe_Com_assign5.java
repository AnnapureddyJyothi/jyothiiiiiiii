package assin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xe_Com_assign5 {
	public static void main(String args[]) throws Exception {
		WebDriver driver;
		 System.setProperty("webdriver.chrome.driver","D:\\selnuim\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.navigate().to("https://www.xe.com/");
		 System.out.println(driver.findElement(By.id("amount")).getAttribute("value"));
		 System.out.println(driver.findElement(By.xpath("//h2[@ class='heading__Heading1-n07sti-0 heading__Heading2-n07sti-1 iXbZUl'][1]")).getText());
		 driver.quit();

	}
}