package testnggg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class NewTest {
  @Test
  public void f() {
	  
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions options=new ChromeOptions();
	  WebDriver driver=new ChromeDriver(options);
	  System.out.println("Launching Google Chrome browser"); 
	driver.get("https://www.toolsqa.com/");
	  Reporter.log("We used Google Chrome Ver 80 for this test",true);
	  String testTitle = "Tools gQA";
	  String originalTitle = driver.getTitle();
	  org.testng.Assert.assertEquals(originalTitle, testTitle);
  }
}
