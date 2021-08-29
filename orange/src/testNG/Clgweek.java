package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Clgweek {
	
  @Test
  public void f() throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\selnuim\\driver\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://collegeweeklive.com/go-signup/");
	  driver.manage().window().maximize();
	  Thread.sleep(8000);
	  Select am= new Select(driver.findElement(By.name("attendeeType")));
	  am.selectByVisibleText("Student Looking for Graduate Degree");
	  Select MN= new Select(driver.findElement(By.id("questions_16_Month")));
	  MN.selectByVisibleText("July");
	  Select Day= new Select(driver.findElement(By.id("questions_16_DayOfMonth")));
	  Day.selectByVisibleText("11");
	  Select Year= new Select(driver.findElement(By.id("questions_16_DOBYear")));
	  Year.selectByVisibleText("1986");
	  Select AS= new Select(driver.findElement(By.id("questions[q_134]")));
	  AS.selectByVisibleText("Fall 2021");
  }


  
  @BeforeMethod
  public void beforeMethod() { 
  
}
	  
  

  @AfterMethod
  public void afterMethod() {
  }
  

  @BeforeClass
  public void beforeClass() {
		  
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
}

  @AfterTest
  public void afterTest() {
	
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {

  }
	
}