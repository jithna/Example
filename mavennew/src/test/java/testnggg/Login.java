package testnggg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	
		WebDriver driver;
		
		@FindBy(id="user-name")
		private WebElement unTB;
		@FindBy(name="password")
		private WebElement pwTB;
		@FindBy(name="login-button")
		private WebElement loginBtn;
		

		 public void Loginpage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	


		public void setUsername(String un){
		unTB.sendKeys(un);
		}

		public void setPassword(String pw){
		pwTB.sendKeys(pw);
		}

		public void clickLogin(){

		loginBtn.click();
		

		

	}

}
