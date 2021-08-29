package assin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ttd_Assing15 {
	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\selnuim\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://tirupatibalaji.ap.gov.in/#/registration");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"regdob\"]")).click();
		Select sel=new Select(driver.findElement(By.xpath("(//select[@class='datepick-month-year'])[1]")));
		sel.selectByVisibleText("March");
		Select sel1=new Select(driver.findElement(By.xpath("(//select[@class='datepick-month-year'])[2]")));
		sel1.selectByVisibleText("1984");
		driver.findElement(By.xpath("//a[@ title='Select Sunday, Mar 18, 1984']")).click();
		driver.quit();
	}

}
