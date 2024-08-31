package testng1;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class allannotation {
  @Test
  public void f() {
	  System.out.println("A");
  }
  @BeforeMethod
  public void g()
  {
	  System.out.println("B");
  }
  @AfterMethod
  public void h()
  {
	System.out.println("c");  
  }
@org.testng.annotations.BeforeClass
public void i() {
	System.out.println("D");
}
@AfterClass
public void j() {
	System.out.println("E");
}
@BeforeTest
public void k() {
	System.out.println("F");
}
@AfterTest
public void l() {
	System.out.println("G");
}
@BeforeSuite
public void m() {
	System.out.println("H");
}
@AfterSuite
public void n() {
	System.out.println("i");
}
}
