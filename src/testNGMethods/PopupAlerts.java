package testNGMethods;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class PopupAlerts {
	WebDriver driver;
  @Test
  public void alertbutton() throws InterruptedException{
	  driver.get("https://seleniumlearn.com/confirmation-dialog-box");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
	  //driver.switchTo().alert().accept();
	  driver.switchTo().alert().dismiss();
  }
  
  @Test
  public void alerttext() throws InterruptedException{
	  driver.get("https://seleniumlearn.com/prompt-dialog-box");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	  Thread.sleep(3000);
	  driver.switchTo().alert().sendKeys("saiiii");
	  driver.switchTo().alert().accept();
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
