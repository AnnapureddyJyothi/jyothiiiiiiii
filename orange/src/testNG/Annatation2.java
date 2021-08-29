package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Annatation2 {
  @Test
  public void f() {
	  System.out.println("meted executed");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class executed");
  }

  @AfterClass
  public void afterClass() {
	  System.out.print("After class executed");
  }

}
