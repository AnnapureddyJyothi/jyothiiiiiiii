package assin;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;

public class ttdsevaonline_asind3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		 System.setProperty("webdriver.chrome.driver","D:\\selnuim\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
			driver.get("https://ttdsevaonline.com/#/registration");
			Thread.sleep(5000);
		    driver.findElement(By.name("fName")).sendKeys("jyooo");
			driver.findElement(By.name("lName")).sendKeys("aaaaaaa");
			driver.findElement(By.name("mobNo")).sendKeys("7653000345");
			driver.findElement(By.xpath("//*[@id=\"regdob\"]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"regdob\"]")).click();
			Select sel=new Select(driver.findElement(By.xpath("(//select[@class='datepick-month-year'])[1]")));
			sel.selectByVisibleText("March");
			Select sel1=new Select(driver.findElement(By.xpath("(//select[@class='datepick-month-year'])[2]")));
			sel1.selectByVisibleText("1984");
			driver.findElement(By.xpath("//a[@ title='Select Sunday, Mar 18, 1984']")).click();
			System.out.println("clander completed");
			driver.findElement(By.xpath("//*[@id=\"container\"]/div[4]/div/div[1]/form/div[1]/div[2]/div[5]/span[2]/input")).click();
			driver.findElement(By.name("address1")).sendKeys("jajjjipalli");
			driver.findElement(By.name("address2")).sendKeys("duttalur");
			driver.findElement(By.name("cityS")).sendKeys("Hyderabad");
			Select a=new Select(driver.findElement(By.name("countryS")));
			a.selectByVisibleText("India"); 
			Select aah=new Select(driver.findElement(By.name("stateS")));
			aah.selectByVisibleText("Andhra Pradesh"); 
			Thread.sleep(3000);
			driver.findElement(By.name("zipCode")).sendKeys("262778");
			Select aac=new Select(driver.findElement(By.name("proofS")));
			aac.selectByVisibleText("Aadhaar Card" );
			driver.findElement(By.name("proofId")).sendKeys("247799999492");
			driver.findElement(By.name("emailId")).sendKeys("jjjjj124@gmail.com");
			driver.findElement(By.name("password")).sendKeys("123456jA@");
			driver.findElement(By.name("repassword")).sendKeys("123456jA@");
			driver.findElement(By.xpath("//*[@id=\"txtInput\"]")).sendKeys("CDZ1TX1");
			driver.findElement(By.id("regi_continue")).click();
			Thread.sleep(5000);
			System.out.println("Process completed");
			driver.quit();
			
	}

}
