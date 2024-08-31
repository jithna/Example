package mavennew;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class deselectmultiple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions option1=new ChromeOptions();
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://demoqa.com/select-menu");
		Select dropdown=new Select(driver1.findElement(By.xpath("//select[@name='cars']")));
		if(dropdown.isMultiple())
		{
			dropdown.selectByIndex(3);
			Thread.sleep(2000);
			dropdown.deselectByVisibleText("Audi");
		}
		

	}

}
