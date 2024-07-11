package log4jDemo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4jTutorial {
	WebDriver driver;
  @Test
  public void search(){
	  Logger logger= Logger.getLogger("Mysearch");
	  PropertyConfigurator.configure("Log4j.properties");
	  driver = new ChromeDriver( );
	  logger.info("chrome opened");
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("testng",Keys.ENTER);
	  
	  logger.info("tesng searched in google ");
  }
}
