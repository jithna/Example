package testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataprovider2 {
  WebDriver driver;
	@BeforeMethod
  public void f() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		ChromeOptions options=new ChromeOptions();
		driver.get("https://www.facebook.com/");
  }
	@DataProvider(name="d1")
	public Object[][]getData(){
		Object[][]obj=new Object[2][2];
		obj[0][0]="fb";
		obj[0][1]="321";
		obj[1][0]="data";
		obj[1][1]="098";
		return obj;
	}
	@Test(dataProvider ="d1" )
	public void h(String username,String pasword) {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(pasword);
		driver.findElement(By.name("login")).click();
	}
}
