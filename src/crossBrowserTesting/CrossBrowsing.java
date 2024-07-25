package crossBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsing {
	WebDriver driver;

 @Parameters({"browser"})	
 @BeforeTest
 public void openBrowser(String browser) {
	  try {
		  if(browser.equalsIgnoreCase("Firefox"))
		  {
			  driver = new FirefoxDriver();
			  driver.manage().window().maximize();
		  }
		  else if(browser.equalsIgnoreCase("GoogleChrome"))
		  {
			  driver = new ChromeDriver();
			  driver.manage().window().maximize();
		  }
		  else if(browser.equalsIgnoreCase("Edge"))
		  {
			  driver = new EdgeDriver();
			  driver.manage().window().maximize();
		  }
	  }
	  catch (WebDriverException e) {
		  System.out.println(e.getMessage());
	  }
  }
  
  @Test
  public void google() {
	  driver.get("https://www.zomato.com");
	  
  }
  @Test
  public void firefox() {
	  driver.get("https://www.redmine.org");
	  
  }
  
  @Test
  public void edge() {
	  driver.get("https://www.facebook.com");
  }
 
}
