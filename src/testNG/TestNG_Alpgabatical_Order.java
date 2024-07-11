package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_Alpgabatical_Order {
	WebDriver driver;
  @Test
  public void twitter(){
	  driver.get("https://www.x.com");
  }
  
  @Test
  public void facebook() {
	  driver.get("https://www.facebook.com");
  }

  @Test
  public void google() {
	  driver.get("https://www.google.com");
  }
  
  @Test
  public void instagram() {
	  driver.get("https://www.instagram.com");
}
  @Test
  public void youtube() {
	  driver.get("https://www.youtube.com");
  }
  
  @Test
  public void selenium() {
	  driver.get("https://www.selenium.dev");
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
  }

}
