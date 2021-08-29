package assin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment16 {
	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\selnuim\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://blazedemo.com/");
		Select aaa=new Select(driver.findElement(By.name("fromPort")));
		aaa.selectByVisibleText("Paris");
		Select aab=new Select(driver.findElement(By.name("toPort")));
		aab.selectByVisibleText("Rome");
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[1]/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("inputName")).sendKeys("jjjjjj");
		driver.findElement(By.id("address")).sendKeys("duttalur");
		driver.findElement(By.id("city")).sendKeys("nellore");
		driver.findElement(By.id("state")).sendKeys("Andrapradesh");
		driver.findElement(By.id("zipCode")).sendKeys("524228");
		Select aac = new Select(driver.findElement(By.name("cardType")));
		aac.selectByVisibleText("Visa");
		driver.findElement(By.id("creditCardNumber")).sendKeys("123456789123");
		driver.findElement(By.id("creditCardMonth")).sendKeys("12");
		driver.findElement(By.id("creditCardYear")).sendKeys("2108");
		driver.findElement(By.id("nameOnCard")).sendKeys("jjjjjjj");
		driver.findElement(By.id("rememberMe")).click();
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		Thread.sleep(3000);
		String mainHeading =driver.findElement(By.xpath("/html/body/div[2]/div/h1")).getText();
		System.out.println(mainHeading);
		String id =driver.findElement(By.xpath("/html/body/div[2]/div/table/tbody/tr[1]/td[2]")).getText();
		System.out.println(id);
		String stats =driver.findElement(By.xpath("/html/body/div[2]/div/table/tbody/tr[2]/td[2]")).getText();
		System.out.println(stats);
		String amount =driver.findElement(By.xpath("/html/body/div[2]/div/table/tbody/tr[3]/td[2]")).getText();
		System.out.println(amount);
		String cardNamber =driver.findElement(By.xpath("/html/body/div[2]/div/table/tbody/tr[4]/td[2]")).getText();
		System.out.println(cardNamber);
		String expiration =driver.findElement(By.xpath("/html/body/div[2]/div/table/tbody/tr[5]/td[2]")).getText();
		System.out.println(expiration);
		String authCode =driver.findElement(By.xpath("/html/body/div[2]/div/table/tbody/tr[6]/td[2]")).getText();
		System.out.println(authCode);
		String date =driver.findElement(By.xpath("/html/body/div[2]/div/table/tbody/tr[7]/td[2]")).getText();
		System.out.println(date);
		driver.quit();
		
	}

}