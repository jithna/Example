package testng1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest{
WebDriver driver;
  @BeforeTest
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions options=new ChromeOptions();
	   driver=new ChromeDriver();
	 System.out.println("before test");
  }

@Test
public void g() {
	driver.get("https://www.google.com/");
}
@Test
public void a() {
	System.out.println("hello");
}
@AfterTest
public void h() {
	System.out.println("after test");
}
}
