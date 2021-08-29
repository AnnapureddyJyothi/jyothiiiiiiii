package webdriver_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Allbrowser {
   public static void main(String[] args) {
	   WebDriver driver;
		  System.setProperty("webdriver.edge.driver","D:\\selnuim\\driver\\msedgedriver.exe") ;
	    driver = new EdgeDriver();
	    System.out.println("Edge browser opend");
	    
	    //JRI
	    driver.get("https://www.justrechargeit.com/SignIn.aspx");
	    driver.findElement(By.name("txtUserName")).sendKeys("jjjjjjj111112@gmail.com");
	    driver.findElement(By.name("txtPasswd")).sendKeys("12333455j");
	    driver.findElement(By.name("txtCaptcha")).sendKeys("62");
	    driver.findElement(By.name("imgbtnSignin")).click();
	    System.out.println("JRI login completed");
	    
	    //FB
	    driver.get("https://www.facebook.com/");
	    driver.findElement(By.name("email")).sendKeys("jjjjjjjjjjj111@gmail.com");
	    driver.findElement(By.name("pass")).sendKeys("1234444j");
	    driver.findElement(By.name("login")).click();
	    System.out.println("FB login completed");
	    
}
}
