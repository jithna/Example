package mavennew;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandler2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
WebElement wb=driver.findElement(By.xpath("//span[@title='Software & IT']"));
WebElement wb1=driver.findElement(By.xpath("//span[@title='Fresher']"));
		wb.click();
wb1.click();
		Set<String>s1=driver.getWindowHandles();
		int conut=s1.size();
		System.out.println(s1.size());
		Thread.sleep(2000);
		for(String str:s1)
		{	
			driver.switchTo().window(str);
			System.out.println(str);
			String title=driver.getTitle();
			System.out.println(title);
			Thread.sleep(2000);
		if(str.equals(driver.getWindowHandle()))
		{
			driver.close();
			break;
		}
		
	}

}}
