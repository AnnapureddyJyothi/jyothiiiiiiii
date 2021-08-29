package assin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

public class cwl_assin2 {
	public static void main(String args[]) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\selnuim\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://collegeweeklive.com/go-signup/");
		System.out.println("login completed");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("jyottii");
		driver.findElement(By.name("lastName")).sendKeys("a");
		driver.findElement(By.name("emailAddress")).sendKeys("jyoa222@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("phoneNumber")).sendKeys("7261945281");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("123456");
		Thread.sleep(3000);
		Select aaa = new Select(driver.findElement(By.name("nationality")));
		aaa.selectByVisibleText("UNITED STATES");
		Thread.sleep(3000);
		Select aab = new Select(driver.findElement(By.name("attendeeType")));
		aab.selectByVisibleText("Student Looking for Graduate Degree");
		Thread.sleep(3000);
		Select aac = new Select(driver.findElement(By.id("questions[q_134]")));
	    aac.selectByVisibleText("Spring 2022");
		Select aad = new Select(driver.findElement(By.id("questions_16_Month")));
		aad.selectByVisibleText("April");
		Select aaf = new Select(driver.findElement(By.id("questions_16_DayOfMonth")));
		aaf.selectByVisibleText("19");
		Select aag = new Select(driver.findElement(By.id("questions_16_DOBYear")));
		aag.selectByVisibleText("1997");
		driver.findElement(By.id("questions[q_19]")).click();
		driver.findElement(By.name("questions[q_19][0]")).click();
		driver.findElement(By.id("questions[q_19]")).click();
		Thread.sleep(300);
		driver.findElement(By.id("questions[q_135]")).click();
		driver.findElement(By.id("questions[q_136]")).click();
		driver.findElement(By.id("questions[q_137]")).click();
		Thread.sleep(300);
		driver.findElement(By.id("submit")).click();
		driver.quit();
		
	}

}
	





	