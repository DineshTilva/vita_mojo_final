package Utility;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import net.bytebuddy.asm.Advice.This;

public class DriverManagement {
	
	
	
	
	public WebDriver getDriver(String BrowserType)
	{
		WebDriver driver = null;
		
		if (BrowserType.equals("EDGE"))
		{
			System.setProperty("webdriver.edge.driver", System.getProperty ("user.dir") + "\\src\\test\\resources\\Tools\\edgedriver_win32\\msedgedriver.exe");
			
			HashMap<String, Object> edgePrefs = new HashMap<String, Object>();
			edgePrefs.put("profile.default_content_settings.popups", 0);
			EdgeOptions options = new EdgeOptions();
			
			// Start Edge Session
			driver = new EdgeDriver(options);
			driver.manage().window().maximize(); 
			
		}
		else if(BrowserType.equals("CROME"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty ("user.dir") + "\\src\\test\\resources\\Tools\\chromedriver_win32 (1)\\chromedriver.exe");
		        // Instantiate a ChromeDriver class.
		        driver = new ChromeDriver();
		 
		        // Maximize the browser
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		        
		}
		
		return driver;
	}
}
