package webdriver_examples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Robot_Key {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\selnuim\\driver\\chromedriver.exe") ;
		WebDriver driver = new ChromeDriver();
		//TestCase steps
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		//To Enter Data in textBox
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		//To perfom click on Action on button
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("Login completed");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		System.out.println("Enter");
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();
		
		
	}
}

