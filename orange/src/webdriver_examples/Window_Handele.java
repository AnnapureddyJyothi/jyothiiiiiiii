package webdriver_examples;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handele {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\selnuim\\driver\\chromedriver.exe") ;
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///C:/Users/LENOVO/AppData/Local/Temp/Rar$EXa8548.12501/multiplewindows.html");
		driver.findElement(By.id("btn2")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("btn2")).click();
		Thread.sleep(3000);
		ArrayList<String>wind = new
				ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wind.get(0));
		Thread.sleep(3000);
		System.out.println("proccess completed");
		driver.quit();
	}

}
