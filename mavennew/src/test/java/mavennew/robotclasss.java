package mavennew;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class robotclasss {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.mesrajaschool.com/");
		WebElement ele=driver.findElement(By.xpath("//a[text()='About MES']"));
		//int x=ele.getLocation().getX();
		//int y=ele.getLocation().getY();
		Robot r=new Robot();
		//r.mouseMove(x, y);
		Thread.sleep(3000);
		r.mousePress(InputEvent.BUTTON3_DOWN_MASK);
		Thread.sleep(3000);
		r.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
		driver.close();
	}

}
