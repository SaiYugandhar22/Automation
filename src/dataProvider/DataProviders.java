package dataProvider;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class DataProviders {
	WebDriver driver;
	public String str;
	
  @DataProvider(name = "input")
  public String[][] login() {
	  return new String[][] {
		  {"validdata","validpass"}, {"hello","pass"} 
	  };
  }
  @Test(dataProvider = "input")
  public void login(String user,String pass) throws InterruptedException {
	  driver.get("http://hyderabadreport.com/user");
	  driver.findElement(By.xpath("//*[@name=\"name\"]")).clear();
	  driver.findElement(By.xpath("//*[@name=\"name\"]")).sendKeys(user);
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@name=\"pass\"]")).sendKeys(pass);
	  driver.findElement(By.xpath("//*[@name=\"op\"]")).click();
	  
	  try {
		  driver.findElement(By.linkText("Log out")).click();
		  str = "pass";
		  System.out.println("str");
	  }
	  catch (Exception a) {
		  str = "fail";
		  System.out.println("str" + a);
	  }
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
