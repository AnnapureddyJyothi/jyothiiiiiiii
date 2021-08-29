package assin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alerts_assign9 {
	public static void main(String aargs[]) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\selnuim\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/alerts");
        Thread.sleep(3000);
        
        driver.findElement(By.id("alertButton")).click();
        String aaaa =driver.switchTo().alert().getText();
        System.out.println(aaaa);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        
        driver.findElement(By.id("timerAlertButton")).click();
        Thread.sleep(8000);
        String aaab =driver.switchTo().alert().getText();
        System.out.println(aaab);
        driver.switchTo().alert().accept();
        
        driver.findElement(By.id("confirmButton")).click();
        String aaac =driver.switchTo().alert().getText();
        System.out.println(aaac);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);

        System.out.println(driver.findElement(By.id("confirmResult")).getText());
        driver.quit();
            
        
        
        
      
}}
