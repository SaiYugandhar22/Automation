package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_Description {
	WebDriver driver;
		
  @Test(description="Top menu bars",priority=0)
  public void menus() throws InterruptedException{
	  //driver.get("https://www.redmine.org/");
	  driver.get("https://www.redmine.org/");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//a[@class='overview']")).click();
	  
	  
  }
  @Test(description="menuuuu",priority=1)
  public void repomenu() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//a[@class='repository']")).click();

  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  //driver.get("https://www.redmine.org/");
  }

}
