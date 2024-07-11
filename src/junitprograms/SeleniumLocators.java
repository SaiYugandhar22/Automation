package junitprograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class SeleniumLocators {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@Test
	void idnameclassnamecssselectors() throws Exception {
		driver.get("http://www.hyderabadreport.com/user");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.findElement(By.linkText("International")).click();
		//driver.findElement(By.partialLinkText("Tela")).click();
		//driver.findElement(By.xpath("//*[@id=\"menu-444-3\"]/a")).click();
		driver.findElement(By.id("edit-name")).sendKeys("SaiYugandhar");
		driver.findElement(By.name("pass")).sendKeys("12345678");
		//driver.findElement(By.className("form-submit")).click();
//	driver.findElement(By.cssSelector(".form-submit")).click();
		driver.findElement(By.cssSelector("#edit-submit")).click();
		
		
		
		
	}

}
