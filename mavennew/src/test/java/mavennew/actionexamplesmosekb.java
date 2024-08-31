package mavennew;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionexamplesmosekb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeOptions options=new ChromeOptions();
WebDriver driver=new ChromeDriver();
driver.get("http://43.225.54.129/medlab/demo/");
Actions a1=new Actions(driver);
WebElement wb=driver.findElement(By.xpath("//a[@href='mailto:support@smartwaveindia.com']"));
WebElement wb1=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
a1.dragAndDrop(wb, wb1);
a1.build().perform();


	}

}
