package webdriver_examples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Dropdown {
	public static void main(String args[]) throws Exception {
	System.setProperty("webdriver.chrome.driver","D:\\selnuim\\driver\\chromedriver.exe") ;
	WebDriver driver = new ChromeDriver();
	//TestCase steps
	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	System.out.println(driver.getTitle());
	//To Enter Data in textBox
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	//To perfom click on Action on button
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
    System.out.println("logincompleted");
    //Enter frame
    driver.switchTo().frame("rightMenu");
    Select st = new Select(driver.findElement(By.name("loc_code")));
    st.selectByVisibleText("Emp. ID");
    Thread.sleep(4000);
    driver.findElement(By.name("loc_name")).sendKeys("0027");
    Thread.sleep(4000);
    driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[2]/input[2]")).click();
    Thread.sleep(4000);
	driver.findElement(By.name("chkLocID[]")).click();
	System.out.println("deleted emp");
    Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@value='Delete']")).click();
    Thread.sleep(4000);
	driver.quit();
}
}