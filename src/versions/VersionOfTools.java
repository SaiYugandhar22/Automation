package versions;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class VersionOfTools {
	WebDriver driver;
  @Test
  public void selenium() {
	  driver.get("https://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("show the latest version of selenium webdriver",Keys.ENTER);
	  
	  String sv = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/block-component/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div[1]/div/span/span")).getText();
	  
	  System.out.println("Selenium Version: "+sv);
  }
  
  @Test
  public void testNG() {
	  driver.get("https://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("",Keys.ENTER);
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
