package tasks;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.testng.annotations.BeforeTest;

public class ssc {
	WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  driver.get("https://ssc.gov.in/");
	  Thread.sleep(3000);
	  
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
	  
	  jse.executeScript("scroll(0,500)");
	  Thread.sleep(3000);
	  
	  jse.executeScript("document.querySelector('.innerCardHead').scrollBy(0,500)");
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
