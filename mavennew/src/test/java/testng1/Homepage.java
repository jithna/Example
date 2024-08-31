package testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	public static WebElement txtbx_UserName(WebDriver driver){
		WebElement element = driver.findElement(By.name("userid"));
		return element;
		}
		public static WebElement txtbx_Password(WebDriver driver){
		WebElement element = driver.findElement(By.name("password"));
		return element;
		}
		public static WebElement btn_LogIn(WebDriver driver){
		WebElement element = driver.findElement(By.name("Login"));
		return element;
		}
		public static WebElement lnk_SignIn(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
		}
}
