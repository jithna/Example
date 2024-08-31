package mavennew;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Administrator/Desktop/table.html");
		List<WebElement>l1=driver.findElements(By.xpath("//tr"));
		int trows=l1.size();
		System.out.println(trows);
		List<WebElement>l2=driver.findElements(By.xpath("//th"));
		int col=l2.size();
		System.out.println(col);
		List<WebElement>allcells=driver.findElements(By.xpath("//th|//td"));
		int tcells=allcells.size();
		System.out.println(tcells);
		//to print tottal numbers
		int numbers=0;
		int sum=0;
		for(WebElement web:allcells)
		{
		String values=web.getText();
		try {
		int n=Integer.parseInt(values);
		System.out.println(n);
		numbers++;
		sum=sum+numbers;
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(numbers);
		}
		
		
	}

}
