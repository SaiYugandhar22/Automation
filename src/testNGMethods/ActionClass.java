package testNGMethods;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class ActionClass {
	WebDriver driver;
	@Test
  public void rightclick() throws InterruptedException{
	driver.get("https://www.seleniumlearn.com");
	Thread.sleep(2000);
	
	Actions obj = new Actions(driver);
	obj.contextClick(driver.findElement(By.xpath("//*[@id=\"menu-393-1\"]/a"))).build().perform();
  }
	
	@Test 
	public void dragandDrop() throws InterruptedException {
		driver.get("https://seleniumlearn.com/drag-and-drop");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		
		WebElement target = driver.findElement(By.xpath("//*[@id=\"droptarget\"]"));
		
		act.dragAndDrop(source,target).build().perform();
	}
	
	@Test
	public void mouseover() throws InterruptedException {
		driver.get("https://www.seleniumlearn.com");
		Thread.sleep(2000);
		
		Actions Act = new Actions(driver);
		
		Act.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-336-1\"]/a"))).build().perform();
		
		Act.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-365-1\"]/a"))).click().build().perform();
	}
	
	@Test
	public void doubleclick() throws InterruptedException {
		driver.get("https://seleniumlearn.com/double-click");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		act.doubleClick(driver.findElement(By.xpath("//*[@id=\"node-104\"]/div/div[1]/div/div/button"))).build().perform();
		//act.moveToElement(driver.findElement(By.xpath("//*[@id=\"node-104\"]/div/div[1]/div/div/button"))).doubleClick().build().perform();
	}
	
	@Test
	public void keyboardFunction() {
		driver.get("https://www.redmine.org/login");
		Actions act = new Actions(driver);
		
		act.sendKeys("username"+Keys.TAB).build().perform();
		
		act.sendKeys(Keys.ENTER).build().perform();
		
		
		
	}
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
