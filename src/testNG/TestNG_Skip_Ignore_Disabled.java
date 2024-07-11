package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

public class TestNG_Skip_Ignore_Disabled {
	WebDriver driver;
	 @Test(priority=2,enabled=false)
	  public void twitter(){
		  driver.get("https://www.x.com");
	  }
	  
	  @Test(priority=1)
	  public void facebook() {
		  driver.get("https://www.facebook.com");
	  }

	  @Ignore
	  @Test(priority=0)
	  public void google() {
		  driver.get("https://www.google.com");
	  }
	  @Ignore
	  @Test
	  public void instagram() {
		  driver.get("https://www.instagram.com");
	}
	  @Test(enabled=false)
	  public void youtube() {
		  driver.get("https://www.youtube.com");
	  }
	  
	  @Test(enabled=false)
	  public void selenium() {
		  driver.get("https://www.selenium.dev");
	  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
