package testNGMethods;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class PagescrollDownandUP {
	WebDriver driver;
  @Test
  public void pageScrollDown() throws InterruptedException {
	  driver.get("https://www.selenium.dev/downloads/");
	  Thread.sleep(3000);
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
	  jse.executeScript("scroll(0,3300)");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/div/main/div[9]/div/div/p[1]/a")).click();
  }
  @Test
  public void pageScrollUP() throws InterruptedException {
	//  driver.get("https://www.selenium.dev/downloads/");
	//  Thread.sleep(3000);
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
	  jse.executeScript("scroll(2700,0)");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/div/main/div[2]/div/div/p[2]/a")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
