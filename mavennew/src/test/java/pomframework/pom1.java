package pomframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pom1 {
	public static WebElement web(WebDriver driver) {
		WebElement web1=driver.findElement(By.name("q"));
return web1;
	}
	public static WebElement web2(WebDriver driver) {
		WebElement web3=driver.findElement(By.name("btnK"));
		return web3;
	}

}
