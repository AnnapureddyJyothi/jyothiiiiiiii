package assin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_18 {
	public static void main(String args[]) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\selnuim\\driver\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get("https://forms-uat.toyotabeta.co.uk/brochure");
	    Thread.sleep(3000);
	    driver.findElement(By.id("tgbgdpr-overlay-agree")).click();
	    Thread.sleep(3000);
	    String aygo = driver.findElement(By.xpath("//*[@id=\"car_models\"]/div/ul/li[1]/label")).getText();
	    System.out.println(aygo);
	    driver.findElement(By.xpath("//*[@id=\"car_models\"]/div/ul/li[1]/div/img")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"order_brochure\"]/div/form/div[7]/div[1]/div[3]/div/div/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"order_brochure\"]/div/form/div[7]/div[1]/div[3]/div/div/ul/li[8]/a")).click();
	    driver.findElement(By.name("firstname")).sendKeys("Test");
	    driver.findElement(By.name("surname")).sendKeys("lady");
	    driver.quit();
	    
	   

	}
}