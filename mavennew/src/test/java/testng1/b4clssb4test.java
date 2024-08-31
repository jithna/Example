package testng1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class b4clssb4test {
  @Test
  public void f() {
	  System.out.println("hai");
  }
  @BeforeClass
  public void g() {
	  System.out.println("first");
  }
  @BeforeTest
  public void h() {
	  System.out.println("second");
  }
}
 class c1 extends b4clssb4test{
	@Test
	public void i() {
		System.out.println("fourth");
	}
}
