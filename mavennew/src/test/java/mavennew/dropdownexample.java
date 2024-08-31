package mavennew;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeOptions options=new ChromeOptions();
WebDriver driver=new ChromeDriver();
driver.get("https://demoqa.com/select-menu");
Select dropdown=new Select(driver.findElement(By.xpath("//select[@id='oldSelectMenu']")));
List<WebElement>list1=dropdown.getOptions();
for(WebElement element1:list1)
{
	System.out.println(element1.getText());
}
	}

}
