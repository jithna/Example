package pomframework;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class youtube {
	 WebDriver driver;

		@BeforeTest
		public void bl() {
			System.setProperty("WebDriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chrmedriver.exe");
			 driver=new ChromeDriver();
			 driver.get("https://www.youtube.com/");
		}
		@Test(priority = 1)
		public void act() throws InterruptedException {
			youtube_pom_class.element1(driver).sendKeys("sajini");
		Thread.sleep(3000);
		}
		@Test(priority = 2)
		public void act3() {
			Actions action=new Actions(driver);
			action.keyDown(Keys.ENTER);
			action.build().perform();
		}
		@Test(priority = 3)
		public void act1() throws InterruptedException {
			Thread.sleep(1000);
			youtube_pom_class.element2(driver).click();
		}
		
	}
