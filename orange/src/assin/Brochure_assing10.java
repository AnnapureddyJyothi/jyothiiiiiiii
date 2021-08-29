package assin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brochure_assing10 {
	public static void main(String aargs[]) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\selnuim\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.navigate().to("https://forms-uat.toyotabeta.co.uk/brochure");
        Thread.sleep(3000);
        driver.findElement(By.id("tgbgdpr-overlay-agree")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"car_models\"]/div/ul/li[3]/div/img")).click();
        driver.quit();
 
	}
}