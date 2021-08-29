package assin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ttd_assign8 {
	public static void main(String aargs[]) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\selnuim\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://tirupatibalaji.ap.gov.in/#/login");
		driver.manage().window().maximize();

		//get current page url
		String ddd=driver.getCurrentUrl();
		System.out.println("Tts seva url: "+ddd);
		
		String ddf=driver.getTitle();
		System.out.println("Ttd sevs title: "+ddf);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[9]/div[2]/div/div[1]/form/fieldset[5]/span/a")).click();
		
		String ddj=driver.getCurrentUrl();
		System.out.println("Tts seva sinup page url: "+ddj);
		
		String ddp=driver.getTitle();
		System.out.println("Ttd sevs sinuo page title: "+ddp);
		driver.quit();
		
		
	}

}
