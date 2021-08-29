package assin;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void main(String args[]) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\selnuim\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Date d = new Date();
		System.out.println(d);
		
		DateFormat dd = new SimpleDateFormat("yyyymmmddhhmmss");
		String timestamp=dd.format(d);
		System.out.println(timestamp);
		
		
		File f1 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f1, new File(".\\Screenshot/fb"+timestamp+".PNG"));
		driver.quit();
		

}}
