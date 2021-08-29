package assin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Commands {
	public static void main(String args[]) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\selnuim\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.name("email")).sendKeys("efgtih1700fhr");
		Thread.sleep(5000);
		
		//click on reload icon (page refresh)
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		//Go back to fb login page
		driver.navigate().back();
		Thread.sleep(5000);
		
		//Click on forword icon
		driver.navigate().forward();
		
		
	}

}
