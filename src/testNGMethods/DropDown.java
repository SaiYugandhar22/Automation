package testNGMethods;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class DropDown {
	WebDriver driver;
  @Test
  public void dropDown() throws InterruptedException{
	  Thread.sleep(3000);
	  driver.get("http://baalabharathi.com/upload-story//");
	  Thread.sleep(3000);
	  Select obj = new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]")));
	  //obj.selectByVisibleText("Bermuda");
	  //obj.selectByValue("VG");
	  obj.selectByIndex(3);
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
