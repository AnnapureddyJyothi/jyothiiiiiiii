package assin;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assin25 {
	public static void main(String RGS[]) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\selnuim\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
				driver.get("https://www.applevacations.com/#!/");
				driver.manage().window().maximize();
	    Thread.sleep(5000);
		driver.findElement(By.id("orgAC_value")).sendKeys("lo");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class=\"angucomplete-title ng-binding ng-scope\"])[2]")).click();
		driver.findElement(By.id("desAC_value")).sendKeys("lo");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"desAC_dropdown\"]/div[4]/div")).click();
		driver.findElement(By.id("depDT_value")).clear();
		driver.findElement(By.id("depDT_value")).sendKeys("08/23/2021");
		driver.findElement(By.id("scc_rt_submit")).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		Random r = new Random();
		int i = r.nextInt(20);
		System.out.println(i);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement A = driver.findElement(By.xpath("(//button[@class=\"link clickable-hotel-main-link\"])[" + i + "]"));
		js.executeScript("arguments[0].click()", A);
		Thread.sleep(3000);
		driver.switchTo().alert();
		Actions act= new Actions(driver);
		//driver.findElement(By.xpath("//html[@lang=\"en\"]/body[@class=\"culture_en-US\"]")).sendKeys(Keys.CONTROL+"t");
		Thread.sleep(3000);
		//js.executeScript("window.scrollBy(0,600)", "");
		//Thread.sleep(3000);
		int j= r.nextInt(2);
		System.out.println(j);
		WebElement C= driver.findElement(By.xpath("(//input[@name=\"hotelComponentBtn\"])["+j+"]"));
		act.moveToElement(C).click().build().perform();
		
		
		
		
		driver.quit();
		
		

	}}
