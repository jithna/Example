package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomframework.pom1;

public class script1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
ChromeOptions options=new ChromeOptions();
driver.get("https://www.google.com/");
pom1.web(driver).sendKeys("cars");
Thread.sleep(3000);
pom1.web2(driver).click();
	}

}
