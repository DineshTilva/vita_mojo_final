package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.ComponentLibrary;

public class LoginPage extends ComponentLibrary{

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By LoginLink = By.linkText("Login");
	By CreateAccountTab = By.cssSelector("li.css-1mewgnt.e1kmuswc0");
	By txtName = By.id("firstName");
	By txtEmail = By.id("email");
	By txtPassword = By.id("password");
	By chkDO = By.cssSelector("div.css-psofcd.e379e0i1");
	By CreateAccountButton = By.xpath("//*[@id=\"auth\"]/ul/li/button");
	By LogInUserName = By.xpath("//*[@id=\"single-spa-application:@vmos2/storeSelection\"]/div/div[1]/header/div/div/a/span[2]");
	By LoginTab = By.cssSelector("li.css-vkv8zi.e1kmuswc0");
	//By LoginButton = By.xpath("//*[@id=\"auth\"]/ul/li/button[2]");
	By LoginButton = By.cssSelector("button.css-58ymp3.e2l7ybf9");
	
	public void clickOnLoginLink()
	{
		getElement(driver, LoginLink).click();
	}
	
	public void clickOnCreateUserTab()
	{
		getElement(driver, CreateAccountTab).click();
	}
	
	public void enterName(String name)
	{
		getElement(driver, txtName).sendKeys(name);
	}
	
	public void enterEmail(String email)
	{
		getElement(driver, txtEmail).sendKeys(email);
	}
	
	public void enterPassword(String password)
	{
		getElement(driver, txtPassword).sendKeys(password);
	}
	
	public void selectDiscountOffer(String DOChek)
	{
		WebElement we = getElement(driver, chkDO);
		
		if(DOChek.equalsIgnoreCase("yes"))
		{
			if (!we.isSelected())
			{
				we.click();
			}
		}
		else
		{
			if (we.isSelected())
			{
				we.click(); //To un check
			}
		}
	}
	
	public void clickCreateAccontButton()
	{
		getElement(driver, CreateAccountButton).click();
	}
	
	public String getLoggedInUserName()
	{
		return getText(driver, LogInUserName);
	}
	
	public void clickLoginTab()
	{
		getElement(driver, LoginTab).click();
	}
	
	public void clickLoginButton()
	{
		getElement(driver, LoginButton).click();
	}
}
