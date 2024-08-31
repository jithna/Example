package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomframework.pom2;

public class script2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		ChromeOptions options=new ChromeOptions();
		driver.get("https://www.saucedemo.com/");
		pom2.web(driver).sendKeys("standard_user");
		pom2.web2(driver).sendKeys("secret_sauce");
		pom2.web3(driver).click();
	}

}
