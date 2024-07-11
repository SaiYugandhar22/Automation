package junitprograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

class JunitDisabled {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Test
	void google() throws Exception {
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);

	}
	@Test
	void selenium() throws Exception {
		driver.get("https://www.selenium.dev");
		Thread.sleep(3000);

		
	}
	//@Disabled
	@Test
	void twitter() throws Exception {
		driver.get("https://www.x.com");
		Thread.sleep(3000);

	}
	
	@Test
	void instagram() throws Exception {
		driver.get("https://www.instagram.com");
		Thread.sleep(3000);

		
	}

	@Disabled
	@Test
	void edge() {
		driver = new EdgeDriver();
	}

}