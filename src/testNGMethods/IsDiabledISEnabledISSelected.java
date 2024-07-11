package testNGMethods;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class IsDiabledISEnabledISSelected {
	WebDriver driver;
  @Test
  public void isDisplayed() throws InterruptedException{
	  driver.get("https://redmine.org/");
	  Thread.sleep(2000);
	  
	  boolean sigin = driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[1]/a")).isDisplayed();
	  
	  if(sigin==true) {
		  System.out.println("sigin is displayed");
	  }
	  else {
		  System.out.println("sigin is not displayed");
	  }
  }
  
  @Test
  public void isEnabled() throws InterruptedException {
	  driver.get("https://www.redmine.org");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[1]/a")).click();
	  
	  boolean login = driver.findElement(By.xpath("//*[@id=\"username\"]")).isEnabled();
	  
	  if(login == true) {
		  System.out.println("login is enabled");
		  driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("sai");
	  }
	  else {
		  System.out.println("login is not enabled");
	  }
  }
  
  @Test
  public void isSelected() throws InterruptedException {
	  driver.get("https://www.redmine.org");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"autologin\"]")).click();
		
		boolean checkbox = driver.findElement(By.xpath("//*[@id=\"autologin\"]")).isSelected();
	  
	  if(checkbox==true) {
		  System.out.println("Checkbox is selected");
	  }
	  else {
		  System.out.println("Checkbox is not selected");
	  }
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
