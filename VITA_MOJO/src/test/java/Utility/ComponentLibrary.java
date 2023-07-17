package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComponentLibrary {

	public WebElement getElement(WebDriver driver,By selector)
	{
		WebElement we = null;
		try
		{
			we = driver.findElement(selector);
		}
		catch(Exception e)
		{
			System.out.println("Exception while finding web element : " + e.getMessage());
		}
		return we;
	}
	public String getText(WebDriver driver,By selector) {
		return getElement(driver, selector).getText();
	}
}
