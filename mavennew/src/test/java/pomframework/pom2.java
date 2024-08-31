package pomframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.bytebuddy.asm.Advice.Return;

public class pom2 {
	public static WebElement web(WebDriver driver) {
WebElement element=driver.findElement(By.id("user-name"));
return element;
}
	public static WebElement web2(WebDriver driver) {
		WebElement element1=driver.findElement(By.id("password"));
		return element1;
	}
	
	public static WebElement web3(WebDriver driver) {
		WebElement element2=driver.findElement(By.id("login-button"));
		return element2;
	}
	
	
	
}