package pomframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class googleclasss {
	public static WebElement textbox_search(WebDriver driver){
		WebElement element = driver.findElement(By.name("q"));
		return element;
		}
		public static WebElement button_search(WebDriver driver){
		WebElement element = driver.findElement(By.name("btnK"));
		return element;
		}

		}

