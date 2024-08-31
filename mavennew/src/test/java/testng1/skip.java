package testng1;

import org.testng.annotations.Test;

public class skip {
  @Test(enabled=false)
  public void f() {
	  System.out.println("fuygui");
  }
}
