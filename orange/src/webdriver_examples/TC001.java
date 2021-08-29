package webdriver_examples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC001 {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\selnuim\\driver\\chromedriver.exe") ;
		WebDriver driver = new ChromeDriver();
		//TestCase steps
	    driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	    driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		//To perfom click on Action on button
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("process completed");
		driver.close();
		
		
	}
	
	

}
