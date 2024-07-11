package testNGMethods;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class WebTitleURLText {
	WebDriver driver;
  @Test
  public void webTitle() throws InterruptedException{
	  driver.get("https://www.google.com");
	  Thread.sleep(2000);
	  String exp = "Google";
	  String act = driver.getTitle();
	  Assert.assertEquals(act,exp);
  }
  
  @Test
  public void verifyURL() throws InterruptedException {
	  driver.get("https://www.google.com");
	  Thread.sleep(2000);
	  String exp = "https://www.google.com/";
	  String act = driver.getCurrentUrl();
	  
	  Assert.assertEquals(act,exp);
  }
  
  @Test
  public void verifyText() throws InterruptedException {
	  driver.get("https://www.google.com");
	  Thread.sleep(2000);
	  
	 String expt = "Gmail";
	 String act = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).getText();
	 
	 Assert.assertEquals(act, expt);
	 
	 
  }
  
  @Test
  public void verifyTagNamae() throws InterruptedException {
	  driver.get("https://www.google.com");
	  Thread.sleep(2000);
	  String expt = "a";
	  String act = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[2]/a")).getTagName();
	  
	  Assert.assertEquals(act,expt);
	  System.out.println(act);
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
