package mavennew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Administrator/Desktop/text2.html");
		driver.switchTo().frame(0);
		WebElement wb=driver.findElement(By.xpath("(//input[@id='t1'])[1]"));
		wb.sendKeys("hai");
		driver.switchTo().defaultContent();
		WebElement wb1=driver.findElement(By.xpath("//input[@id='t2']"));
		wb1.sendKeys("hello");
		
	}

}
