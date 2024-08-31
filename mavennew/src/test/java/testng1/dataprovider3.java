package testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataprovider3 {
  WebDriver driver;
	@BeforeMethod()
  public void f() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		ChromeOptions options=new ChromeOptions();
		driver.get("https://www.facebook.com/");
	}
	@Test(dataProvider ="n1")
	public void g(String user,String pass) {
	
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.name("login")).click();
  }
	@DataProvider(name="n1")
	public Object[][] a1() {
		return new Object[][] {new Object[] {"user1","pass1"},{"user2","pass2"}};
		
	}
}
