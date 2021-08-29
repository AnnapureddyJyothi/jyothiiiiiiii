package assin;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ttd_assign {
	public static void main(String aargs[]) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\selnuim\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ttdsevaonline.com/#/registration");
		driver.manage().window().maximize();
		
		List<WebElement> radio = driver.findElements(By.xpath("//*[@type='radio']"));
		System.out.println("Radio Button Count: "+radio.size());
		
		List<WebElement> textbox = driver.findElements(By.xpath("//*[@type='text']"));
		System.out.println("Textbox Count: "+textbox.size());

		List<WebElement> checkbox = driver.findElements(By.xpath("//*[@type='checkbox']"));
		System.out.println("Checkbox Count: "+checkbox.size());

		List<WebElement> dropdown = driver.findElements(By.xpath("//select"));
		System.out.println("Dropdown Count: "+dropdown.size());
		
		List<WebElement> button = driver.findElements(By.xpath("//button"));
		System.out.println("Button Count: "+button.size());
		driver.quit();

		

	}
}