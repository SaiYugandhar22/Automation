package screenshot;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TimeFormatscreenshot {
WebDriver driver;

public void takescreenshot() throws IOException {
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MMM_dd_HH_mm_ss");
	Date date = new Date();
	String time = dateFormat.format(date);

	File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(f, new File("C:\\Users\\licious.DESKTOP-SSHCSEN\\OneDrive\\Documents\\Lib\\Screenshots\\Google_" + time + ".png"));
//FileHandler.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File("C:\\Users\\licious.DESKTOP-SSHCSEN\\OneDrive\\Documents\\Lib\\Screenshots\\Google_"+time+".png"));

}


	@Test
	public void googlesearch() throws Exception {
		driver.get("https://google.com");
		Thread.sleep(2000);
		takescreenshot();
		
		driver.findElement(By.name("q")).sendKeys("Tirupati");
		Thread.sleep(1000);
		takescreenshot();
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		takescreenshot();
		
		driver.findElement(By.id("hdtb-tls")).click();
		Thread.sleep(1000);
		takescreenshot();
		
		driver.findElement(By.className("KTBKoe")).click();
		Thread.sleep(1000);
		takescreenshot();
	}

	@Test(enabled=false)
	public void facebook() throws Exception {
		driver.get("http://seleniumlearn.com/selenium-commands");
		Thread.sleep(6000);
		takescreenshot();
		String selectalltext = Keys.chord(Keys.CONTROL, "a"); // select all text in techlearn.in home page
		driver.findElement(By.xpath("//*[@id=\"edit-submit\"]")).sendKeys(selectalltext);		           
	//	Screenshot();
	}

	
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
}
