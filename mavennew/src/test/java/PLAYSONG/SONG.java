package PLAYSONG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import pomframework.POM;

public class SONG {
	public static void playsong(WebDriver driver) {
		POM.text_search(driver).sendKeys("SAJINI");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		POM.serach_button(driver).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		POM.search_card(driver).click();

		}

		}
