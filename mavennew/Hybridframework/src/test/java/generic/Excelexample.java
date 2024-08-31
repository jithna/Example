package generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindAll;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pompackages1.LoginPage;

public class Excelexample {
	WebDriver driver;
  @Test(dataProvider = "testdata")
  public void democlass(String username,String password)throws InterruptedException{
	  
	// System.setProperty("webdriver.chrome.driver",".\\driver2\\chromedriver.exe");
	 ChromeOptions options=new ChromeOptions();
	 WebDriver driver=new ChromeDriver(options);
	 
	
	 driver.get("https://www.demo.medlablive.in");
	 LoginPage.username_text(driver).sendKeys(username);
		
	 LoginPage.password_text(driver).sendKeys(password);
	 LoginPage.login_button(driver).click();
	 
	 
	 
	 
	  Thread.sleep(3000);
	//  String s=driver.getTitle();
	  //System.out.println(s);
	  //Assert.assertTrue(driver.getTitle().matches("Med-Lab"));
	  WebElement element = driver.findElement(By.xpath("//a [@href='BillEntrySCR.php']"));
	  if(element.isDisplayed())
	  {
	  
	  System.out.println("Login successfully");
	  }
	  else
	  { System.out.println("invalid login");}
  }
//  @AfterMethod
 //public void ProgramTermination() {
	//  driver.close();
  //}
  @DataProvider(name="testdata")
  public Object[][]testdataexample(){
	  ReadExcelFile configuration=new ReadExcelFile("C:\\Users\\Administrator\\Desktop\\Book1.xlsx");
	  int rows=configuration.getRowCount(0);
	  Object[][]signin_credentials =new Object[rows][2];
	  
	  
	  for(int i=0;i<rows;i++)
	  {
		  signin_credentials[i][0]=configuration.getData(0,i,0);
		  signin_credentials[i][1]=configuration.getData(0,i,1);
	  }
	  return signin_credentials;
  }}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

