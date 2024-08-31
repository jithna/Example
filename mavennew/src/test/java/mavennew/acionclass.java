package mavennew;

import static org.junit.Assert.assertEquals;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class acionclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeOptions options=new ChromeOptions();
WebDriver driver=new ChromeDriver(options);
driver.get("https://demoqa.com/text-box");
Actions a1=new Actions(driver);
WebElement wb=driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
wb.sendKeys("ulliyeri");
a1.keyDown(Keys.CONTROL);
a1.sendKeys("A");
a1.keyUp(Keys.CONTROL);
a1.build().perform();
a1.keyDown(Keys.CONTROL);
a1.sendKeys("c");
a1.keyUp(Keys.CONTROL);
a1.build().perform();
a1.sendKeys(Keys.TAB);
a1.build().perform();
a1.keyDown(Keys.CONTROL);
a1.sendKeys("v");
a1.keyUp(Keys.CONTROL);
a1.build().perform();
WebElement wb2=driver.findElement(By.id("permanentAddress"));
assertEquals(wb.getAttribute(("value")),wb2.getAttribute("value"));



	}

}
