package mavennew;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multipledropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Select dropdown=new Select(driver.findElement(By.xpath("//select[@name='cars']")));
		if(dropdown.isMultiple())
		{
		dropdown.selectByVisibleText("Volvo");
		dropdown.selectByIndex(3);
		}
		List<WebElement>list2=dropdown.getAllSelectedOptions();
		for(WebElement option:list2)
		{
			System.out.println(option.getText());
		}
	}
	

}
