package junitprograms;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class SeleniumLocators2 {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@Test
	void linktext() {
		driver.get("http://www.hyderabadreport.com");
		driver.findElement(By.linkText("Telangana")).click();
		
	}

	@Test
	void partiallinktext() {
		driver.get("https://www.ndtv.com");
		driver.findElement(By.partialLinkText("India")).click();
		
	}
	@Test
	void tagname() {
		driver.get("https://www.ndtv.com");
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total count: "+images.size());
	}
	@Test
	void xpath() {
		driver.get("http://www.hyderabadreport.com/user");
		driver.findElement(By.xpath("//*[@id=\"edit-name\"]")).sendKeys("Hello user");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/section/div/div[1]/form/div/div[2]/input")).sendKeys("1233345678");
        driver.findElement(By.xpath("//*[@id=\"edit-submit\"]")).submit();
        driver.findElement(By.xpath("//*[@id=\"edit-name\"]")).clear();
        //driver.findElement(By.xpath("//*[@id=\"edit-name\"]")).sendKeys("null");
	}

}


