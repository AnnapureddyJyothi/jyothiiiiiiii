package webdriver_examples;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Key {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\selnuim\\driver\\chromedriver.exe") ;
		WebDriver driver = new ChromeDriver();
		//TestCase steps
		driver.navigate().to("https://www.google.com/search?q=sensex&oq=se&aqs=chrome.4.69i60j69i57j69i59j35i39j0i131i433j69i61l2j69i60.6948j1j7&sourceid=chrome&ie=UTF-8");
		//To Enter Data in textBox
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("Keys.ARROW_DOWN");
		Thread.sleep(3000);
	    System.out.println("fristtime down arrow pressed");
	    driver.findElement(By.name("q")).sendKeys("Keys.ARROW_DOWN");
		Thread.sleep(3000);
	    System.out.println("secondtime down arrow pressed");
	    Thread.sleep(3000);
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		System.out.println("clicked on enter bottun");
		driver.close();
		
}
}