package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_Different_pacakges {
	WebDriver driver;
  @Test(groups="social")
  public void redmine(){
	  driver.get("https://www.redmine.org");
	  
  }
  @Test(groups="news")
  public void ndtv() {
	  driver.get("https://www.ndtc.com");
  }
  
  @Test(groups="food")
  public void swiggy() {
	  driver.get("https://www.swiggy.com");
  }
  
  @Test(groups="food")
  public void zomato() {
	  driver.get("https://www.zomato.com");
  }
  @BeforeTest(groups="food")
  public void beforeTest() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
  }

}
