package pompackages1;

import java.io.ObjectInputFilter.Config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


		// TODO Auto-generated method stub
	public static WebElement username_text(WebDriver driver) {
   	 WebElement element=driver.findElement(By.name("userid"));
   	 return element;
   	 
    }
    public static WebElement password_text(WebDriver driver) {
   	 WebElement element=driver.findElement(By.name("password"));
   	 return element;
    }
    public static WebElement login_button(WebDriver driver) {
   	 WebElement element=driver.findElement(By.name("Login"));
   	 return element;
    }


	}
		
