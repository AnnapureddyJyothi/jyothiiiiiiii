package assin;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_methods {
	public static void main(String aargs[]) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\selnuim\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.get("https://www.platformqedu.com/");
        Actions act = new Actions(driver);
        
        WebElement element = driver.findElement(By.xpath("//div[ text()='About']"));
	    act.moveToElement(element).build().perform();
	    Thread.sleep(3000);
		System.out.println("house over completed");
	    
	    
	    driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
		WebElement fromElement = driver.findElement(By.xpath("//li[@ id='credit2']/a"));
		WebElement toElement = driver.findElement(By.xpath("//ol[@ id ='bank']/li"));
		act.dragAndDrop(fromElement, toElement).build().perform();
		Thread.sleep(3000);
		System.out.println("dropdown completed");
		
		driver.navigate().to("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement eleDobleClick = driver.findElement(By.xpath("//*[text()='Double-Click Me To See Alert']"));
		act.doubleClick(eleDobleClick).build().perform();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		System.out.println("dropdown completed");
		
		WebElement ele = driver.findElement(By.xpath("//span[text() ='right click me']"));
		act.contextClick(ele).build().perform();
		Thread.sleep(3000);
		System.out.println("rigrhtClick completed");
	
		driver.navigate().to("http://www.google.com/");
		WebElement el =driver.findElement(By.name("q"));
		//act.keyDown(el, Keys.SHIFT).build().perform();
		//act.sendKeys("hi,how are u?").build().perform();
		//act.keyUp(Keys.SHIFT).build().perform();
		
		act.keyDown(el, Keys.SHIFT).sendKeys("hi,how are u?").keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(3000);
		System.out.println("Camptal letters written completed");
		
		driver.quit();
		
		
}
}