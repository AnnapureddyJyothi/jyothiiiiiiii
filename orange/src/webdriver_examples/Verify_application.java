package webdriver_examples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_application {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\selnuim\\driver\\chromedriver.exe") ;
		WebDriver driver = new ChromeDriver();
		//TestCase steps
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
			System.out.println("title matched");
		}
		else {
			System.out.println("title not machedand expected is "+driver.getTitle());
		}
		//To Enter Data in textBox
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		//To perfom click on Action on button
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("Login completed");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
		driver.close();
		
		
	}
	
	

}



