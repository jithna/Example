package mavennew;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tableexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Administrator/Desktop/t1.html");
		List<WebElement>l1=driver.findElements(By.xpath("//tr"));
		int trows=l1.size();
		System.out.println(trows);
		List<WebElement>l2=driver.findElements(By.xpath("//th"));
		int tcol=l2.size();
		System.out.println(tcol);
	WebElement w1=driver.findElement(By.xpath("//td[text()=\"10\"]"));
	WebElement w2=driver.findElement(By.xpath("//td[text()=\"40\"]"));
	WebElement w3=driver.findElement(By.xpath("//td[text()=\"50\"]"));
	int sum=0;
String str=w1.getText();
String str1=w2.getText();
String str2=w3.getText();
int n1=Integer.parseInt(str);
int n2=Integer.parseInt(str1);
int n3=Integer.parseInt(str2);
System.out.println(n1);
System.out.println(n2);
System.out.println(n3);
sum=sum+n1+n2+n3;
System.out.println(sum);
		
		
	}

}
