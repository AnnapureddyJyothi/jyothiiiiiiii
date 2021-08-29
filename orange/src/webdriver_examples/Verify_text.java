package webdriver_examples;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_text {

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
		Thread.sleep(5000);
		System.out.println("login completed");
		assertTrue(driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[1]")).getText().matches("Welcome admin"));
		driver.close();
        System.out.print("completed");
	}
	
	

}
