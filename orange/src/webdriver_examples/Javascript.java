package webdriver_examples;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class Javascript {
	public static  void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\selnuim\\driver\\chromedriver.exe") ;
		WebDriver driver = new ChromeDriver();
		//TestCase steps
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		//To Enter Data in textBox
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		WebElement element = driver.findElement(By.name("Submit"));
		JavascriptExecutor executer = (JavascriptExecutor)driver;
		executer.executeScript("arguments[0].click();",element);
		Thread.sleep(3000);
		System.out.println("Login completed");
		WebElement logout = driver.findElement(By.linkText("Logout"));
		@SuppressWarnings("unused")
		JavascriptExecutor executer1 = (JavascriptExecutor)driver;
		executer.executeScript("arguments[0].click();",logout);
		Thread.sleep(3000);
		System.out.println("Logout completed");
		driver.close();
		
		
}
}