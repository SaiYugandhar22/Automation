package fitpeo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class FitepeoAssignment {
	WebDriver driver;

	@Test
	public void fitpeoooooo() throws InterruptedException {

		driver.get("https://www.fitpeo.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div[3]/div[6]/a/div")).click();

		Thread.sleep(2000);
		JavascriptExecutor s = (JavascriptExecutor) driver;
		s.executeScript("scroll(0,500)");

		Thread.sleep(2000);
Actions act = new Actions(driver);

		WebElement source = driver.findElement(By.xpath("//span[@style=\"left: 10%;\"]"));
		WebElement target = driver.findElement(By.xpath("//span[@style=\"left: 90%;\"]"));
		act.dragAndDrop(source, target).build().perform();

        Thread.sleep(5000);
        
	/*	driver.findElement(By.xpath("(//input[@max=\"2000\"])[2]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@max=\"2000\"])[2]")).click();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.sendKeys("500").build().perform();
		Thread.sleep(2000);

		act.sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[@max=\"2000\"])[2]")).sendKeys("5"); */

	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
	}

}
