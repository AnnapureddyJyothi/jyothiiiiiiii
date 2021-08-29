package assin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ttd_assing7 {
	public static void main(String aargs[]) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\selnuim\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://tirupatibalaji.ap.gov.in/#/registration");
		driver.findElement(By.xpath("//*[@type='radio'][2]")).click();
		System.out.println("female button cliked");
		driver.quit();
	}

}
