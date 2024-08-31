package testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataprovider {
	WebDriver driver;
	@BeforeTest
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  ChromeOptions options=new ChromeOptions();
	  driver.get("https://www.facebook.com/");
  }
	@DataProvider(name="dp1")
	public Object[][]getData(){
		Object[][] d1=new Object[2][2];
		d1[0][0]="facebook";
		d1[0][1]="1234";
		d1[1][0]="user";
		d1[1][1]="567";
		return d1;
	}
	@Test(dataProvider ="dp1")
	public void g(String user1,String pass) {
		driver.findElement(By.id("email")).sendKeys(user1);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.name("login")).click();
		
		
	}
	
	
	
	
	
}
