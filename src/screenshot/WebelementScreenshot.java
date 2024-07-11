package screenshot;

import org.testng.annotations.Test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;

public class WebelementScreenshot {
	WebDriver driver;
	
  @Test
  public void webelement() throws Exception{
	  driver.get("https://www.google.com");
	  Thread.sleep(2000);
	  
	  WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));
	  
	  File a = logo.getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(a,new File("C:\\Users\\licious.DESKTOP-SSHCSEN\\OneDrive\\Text Book\\Text Book\\ABC\\logo.png"));
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
