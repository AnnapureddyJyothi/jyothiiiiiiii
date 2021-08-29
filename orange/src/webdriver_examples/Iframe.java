package webdriver_examples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Iframe {
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
		//Entering to frame
		driver.switchTo().frame("rightMenu");
		//Clicking on add botton
		driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[1]")).click();
		Thread.sleep(2000L);
		driver.findElement(By.name("txtEmpLastName")).sendKeys("selenium");
		Thread.sleep(2000L);
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("java");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@id=\"btnEdit\"]")).click();
		Thread.sleep(2000L);
		System.out.println("New employee added");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id='option-menu']/li[3]/a")).click();
		driver.close();
		
		
	}
		
	}


