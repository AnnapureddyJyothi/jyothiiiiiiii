package webdriver_examples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
public class Tc0001{
	public static void main(String args[]) throws Exception{
	System.setProperty("webdriver.gecko.driver","\"D:\\selnuim\\driver\\geckodriver.exe\"");
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	driver.findElement(By.name("txtUsername")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	driver.findElement(By.name("submit")).click();
	Thread.sleep(3000);
	System.out.println("login completed");
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("logout completed");
	driver.quit();
}}
