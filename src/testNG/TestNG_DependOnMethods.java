package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_DependOnMethods {
	WebDriver driver;
  @Test(dependsOnMethods="method2")
  public void method1(){
	  driver.findElement(By.name("q")).sendKeys("testNG",Keys.ENTER);
	  driver.findElement(By.xpath("//div[@id='hdtb-tls']")).click();
	  driver.findElement(By.xpath("//span[@class='KTBKoe']")).click();
	
	  
  }
  @Test
  public void method2(){
	  driver.get("https://www.google.com");
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
  }

}
