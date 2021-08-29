package assin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cwk_assign4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\selnuim\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://collegeweeklive.com/go-signup/");
		 Thread.sleep(8000);
		 driver.findElement(By.id("submit")).click();
		 System.out.println(driver.findElement(By.id("firstNameError")).getText());
		 System.out.println(driver.findElement(By.id("lastNameError")).getText());
		 System.out.println(driver.findElement(By.id("emailAddressError")).getText());
		 Thread.sleep(3000);
		 System.out.println(driver.findElement(By.id("phoneNumberError")).getText());
		 System.out.println(driver.findElement(By.id("passwordError")).getText());
		 System.out.println(driver.findElement(By.id("ConfirmPasswordError")).getText());
		 Thread.sleep(3000);
		 System.out.println(driver.findElement(By.id("nationalityError")).getText());
		 System.out.println(driver.findElement(By.id("attendeeTypeError")).getText());
		 System.out.println(driver.findElement(By.id("questions_137Error")).getText());
		 driver.quit();
		 
		





		 

}
}
