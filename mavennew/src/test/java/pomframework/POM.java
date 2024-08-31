package pomframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POM {

	public static WebElement text_search(WebDriver driver) {
		WebElement element=driver.findElement(By.xpath("//input[@id='search']"));
		return element;
		}

		public static WebElement serach_button(WebDriver driver) {
		WebElement element=driver.findElement(By.id("search-icon-legacy"));
		return element;
		}
		   public static WebElement search_card(WebDriver driver) {
		WebElement element=driver.findElement(By.xpath("//div[@id='thumbnail-container']"));
		return element;
		}
		}