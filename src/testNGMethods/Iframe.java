package testNGMethods;

import org.testng.annotations.Test;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Iframe {
	WebDriver driver;
  @Test
  public void iframe() throws InterruptedException {
	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	 Thread.sleep(3000);
	 driver.switchTo().frame("iframeResult");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("/html/body/button")).click();
	 Thread.sleep(2000);
	 driver.switchTo().alert().accept();
	
	 
	 driver.switchTo().defaultContent();
	 
	 driver.findElement(By.xpath("//*[@id=\"getwebsitebtn\"]/span")).click();
	 
	 //for entering into a new tab
	 ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	 driver.switchTo().window(tabs.get(1));
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//*[@id=\"subtopnav\"]/a[5]")).click();
	 Thread.sleep(3000);
	 
	 driver.switchTo().window(tabs.get(0));
	 
	driver.close();

 }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
