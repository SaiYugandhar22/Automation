package tasks;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class FacebookLogin {
	WebDriver driver;
  @Test
  public void facebook() throws InterruptedException {
	  driver.get("https://www.flipkart.com");
	  driver.findElement(By.xpath("//*[@alt=\"Chevron\"]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("(//*[@class=\"AT0fUR\"])[1]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("7386049650");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
