package webdriver_examples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover2 {
		public static void main(String args[]) throws Exception {
			System.setProperty("webdriver.chrome.driver","D:\\selnuim\\driver\\chromedriver.exe") ;
			WebDriver driver = new ChromeDriver();
			//TestCase steps
			driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
			//To Enter Data in textBox
			driver.findElement(By.name("txtUserName")).sendKeys("admin");
			driver.findElement(By.name("txtPassword")).sendKeys("admin");
			driver.findElement(By.name("Submit")).click();
			Thread.sleep(3000);
			driver.manage().window().maximize();
			//mouseover on pim mainmanu
			WebElement element = driver.findElement(By.linkText("Admin"));
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();
			Thread.sleep(3000);
			WebElement element1 = driver.findElement(By.linkText("Company Info"));
			Actions action1 = new Actions(driver);
			action1.moveToElement(element1).perform();
			Thread.sleep(3000);
			System.out.println("admin clicked");
			driver.findElement(By.linkText("General")).click();
			Thread.sleep(3000);
			System.out.println("general completed");
			driver.close();
		}
}
