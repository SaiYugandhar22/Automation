package launchbrowers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingBrowsers {
	static WebDriver driver;

	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		driver = new EdgeDriver();
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
	    
		driver = new FirefoxDriver();
		//driver.close();
		driver.quit();
		//WebDriver driver3 = new SafariDriver();
	}

}
