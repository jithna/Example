package mavennew;

import java.awt.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frameexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeOptions options=new ChromeOptions();
WebDriver driver=new ChromeDriver();
driver.get("https://testpages.herokuapp.com/styled/iframes-test.html");
JavascriptExecutor java=(JavascriptExecutor)driver;
driver.switchTo().frame("thedynamichtml");
//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='thedynamichtml']")));
java.executeScript("window.scrollBy(0,5000)");
driver.switchTo().defaultContent();
Thread.sleep(3000);
java.executeScript("window.scrollBy(0,6000)");



	}

}
