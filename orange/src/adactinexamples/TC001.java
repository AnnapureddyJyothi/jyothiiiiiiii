package adactinexamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC001 {
 public static void main(String args[]) throws Exception {
	 System.setProperty("webdriver.chrome.driver","D:\\selnuim\\driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.navigate().to("http://adactinhotelapp.com/");
	 Thread.sleep(5000);
	 driver.findElement(By.name("username")).sendKeys("annapureddyjyothi6");
	 driver.findElement(By.name("password")).sendKeys("jyothireddy180");
	 Thread.sleep(3000);
	 driver.findElement(By.name("login")).click();
	 System.out.println("login completed");
	 driver.close();
	 
 }
}
