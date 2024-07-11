package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_TimeOutFeature {
	WebDriver driver;
  @Test(timeOut=22000)
  public void timeOutFeature() throws InterruptedException{
	  driver.get("https://www.google.com/");
	  Thread.sleep(3000);
	  driver.findElement(By.name("q")).sendKeys("TestNG",Keys.ENTER);
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
  }
  @Test(invocationCount=3)
  public void invocationCount(){
	  driver.get("https://www.facebook.com");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
		  
  }

}
