package testnggg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datadriven1 {
	WebDriver driver;
	  @Test(dataProvider="testdata")
	  public void democlass(String username,String password) throws InterruptedException
	  {
		  WebDriverManager.chromedriver().setup();
		  ChromeOptions options=new ChromeOptions();
		  WebDriver driver=new ChromeDriver(options);
	 driver.get("https://www.demo.medlablive.in");
	  driver.findElement(By.name("userid")).sendKeys(username);
	  driver.findElement(By.name("password")).sendKeys(password);
	  driver.findElement(By.name("Login")).click();
	  Thread.sleep(3000);
	 //String tit= driver.getTitle();
	 //System.out.println(tit);
//	  Assert.assertTrue(driver.getTitle().matches("Med-Lab"));
//	  System.out.println("Login successful");
	  }
	  @AfterMethod
	  void ProgramTermination() {
	  driver.close();
	  }
	  @DataProvider(name="testdata")
	  public Object[][] testDataExample(){
	  datadriven2 configuration = new datadriven2("D:\\Aswathi_SoftwareTesting\\Book1.xlsx");
	  int rows = configuration.getRowCount(0);
	  Object[][]signin_credentials = new Object[rows][2];
	 
	 
	  for(int i=0;i<rows;i++)
	  {
	 
	signin_credentials[i][0] = configuration.getData(0, i, 0);
	  signin_credentials[i][1] = configuration.getData(0, i, 1);
	  }
	  return signin_credentials;
	}}
	

