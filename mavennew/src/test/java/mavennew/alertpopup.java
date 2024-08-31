package mavennew;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
	WebElement e=	driver.findElement(By.xpath("//input[@id='alert1']"));
		System.out.println(e.getText());
		e.click();
		Alert a1=driver.switchTo().alert();
		String message=driver.switchTo().alert().getText();
		Thread.sleep(2000);
		a1.accept();
//		driver.findElement(By.xpath("//input[@id='prompt']")).click();
//		Alert a2=driver.switchTo().alert();
//		String messagealert=driver.switchTo().alert().getText();
//		a2.dismiss();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='prompt']")).click();
//		a2.accept();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='prompt']")).click();
//		Alert a3=driver.switchTo().alert();
//		String str=driver.switchTo().alert().getText();
//		a3.sendKeys("abhinav");
		
	}}
