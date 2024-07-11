package screenshot;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;

public class BugScreenshot {
	WebDriver driver;
	
	public void bugscreenshot() throws IOException {
		File obj = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(obj,new File("C:\\Users\\licious.DESKTOP-SSHCSEN\\OneDrive\\Text Book\\screenshot\\bug.png"));
	}
	
  @Test
  public void googlesearch() throws IOException {
	  driver.get("https://www.google.com");
	  try 
	  {
		  driver.findElement(By.name("q"));
		  
		  driver.findElement(By.name("q")).sendKeys("Tirupathi" +Keys.ENTER);
		  
		  driver.findElement(By.xpath("htps"));
		 
	  }
	  catch (Exception e) {
		  System.out.println("bug founded: " + e);
		  bugscreenshot();
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();;
  }

}
