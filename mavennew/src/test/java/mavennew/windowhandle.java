package mavennew;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeOptions option=new ChromeOptions();
WebDriver driver=new ChromeDriver();
driver.get("http://omayo.blogspot.com/");
WebElement wb=driver.findElement(By.linkText("Open a popup window"));
wb.click();
String parent=driver.getWindowHandle();
Set<String>s1=driver.getWindowHandles();
Iterator<String>it=s1.iterator();
while(it.hasNext())
{
	String childwindow=it.next();
	if(!parent.equals(childwindow)) 
	{
		driver.switchTo().window(childwindow);
		System.out.println(driver.switchTo().window(childwindow).getTitle());
		driver.close();
	}
}
driver.switchTo().window(parent);
	}

}
