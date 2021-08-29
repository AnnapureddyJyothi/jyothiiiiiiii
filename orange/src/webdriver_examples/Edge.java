package webdriver_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
  public static void main(String[] args) {
	  System.setProperty("webdriver.edge.driver","D:\\selnuim\\driver\\msedgedriver.exe") ;
	  WebDriver driver = new EdgeDriver();
	    driver.navigate().to("https://www.justrechargeit.com/SignIn.aspx");
	    driver.findElement(By.name("txtUserName")).sendKeys("jjjjjjj111112@gmail.com");
	    driver.findElement(By.name("txtPasswd")).sendKeys("12333455j");
	    driver.findElement(By.name("txtCaptcha")).sendKeys("62");
	    driver.findElement(By.name("imgbtnSignin")).click();
	    System.out.println("JRI login completed");
}
}
