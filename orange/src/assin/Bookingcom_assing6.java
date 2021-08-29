package assin;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Bookingcom_assing6 {
	public static void main(String aargs[]) {
		WebDriver driver;
	System.setProperty("webdriver.chrome.driver","D:\\selnuim\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.booking.com/");
		driver.manage().window().maximize();
		List<WebElement> aaa= driver.findElements(By.tagName("a"));
		System.out.println(aaa.size());
		
		//for(int i=0;i<aaa.size();i++) {
		//System.out.println(aaa.get(i).getText());
		for(WebElement WebElement:aaa ) {
			System.out.println(WebElement.getText());
		
		driver.quit();
			
		}
	}

	}

//}
