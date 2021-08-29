package assin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Women_Assign14 {
	public static void main(String RGS[]) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\selnuim\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	    driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img")).click();
	    driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
	    
	    String aaa =driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).getText();
	    System.out.println(aaa);
	    
	    driver.quit();
	

	}
}