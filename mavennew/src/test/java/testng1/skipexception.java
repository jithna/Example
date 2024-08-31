package testng1;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class skipexception {
  @Test
  public void f() {
	  System.out.println("12345");
	  throw new SkipException("skiped");
}
}