package pomframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public  class youtube_pom_class{

	
		public static WebElement element1(WebDriver driver) {

			WebElement y_search=driver.findElement(By.xpath("//input[@id='search']"));
			return y_search;
		}
		public static WebElement element2(WebDriver driver) {
		    
			 WebElement y_vedio=driver.findElement(By.xpath("(//a[@id='video-title'])[2]"));
			 return y_vedio;
			
		}
		
	}


