package StepDefinition;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.LoginPage;
import Utility.DriverManagement;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TestStepDefinition {
	
	WebDriver driver = null;
	LoginPage loginPage = new LoginPage(driver);
	
	
	@Before 
	public void setUp(){ 
	      //System.out.println("SetUP");
	   } 

	@After 
	public void cleanUp(){ 
		driver.close();
	   } 
	
	
	@Given("User at VitaMojo site {string} using {string}")
	public void user_at_VitaMojo_site_using(String url, String BrowserType) {
	    DriverManagement dm = new DriverManagement();
	    driver = dm.getDriver(BrowserType);
	    driver.get(url);  
		
	}
	
	@Given("Navigate to Login Page")
	public void navigate_to_Login_Page() {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickOnLoginLink();
		//driver.findElement(By.linkText("Login"));
	}

	@Given("Click on Create Account tab")
	public void click_on_Create_Account_tab() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickOnCreateUserTab();
	   
	}
	
	@When("User enter Name as {string}")
	public void user_enter_Name_as(String name) {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterName(name);
	   
	}

	@When("User Enter email as {string}")
	public void user_Enter_email_as(String email) {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterEmail(email);
	   
	}

	@When("User Enter password as {string}")
	public void user_Enter_password_as(String password) {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterPassword(password);
	}
	
	@When("User select discount offer as {string}")
	public void user_select_discount_offer_as(String DTCheck) {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.selectDiscountOffer(DTCheck);
	   
	}

	@When("press Create AccountButton")
	public void press_Create_AccountButton() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickCreateAccontButton();
	}

	@Then("User Should be created and Sign in into system with Login Name as {string}")
	public void user_Should_be_created_and_Sign_in_into_system_with_Login_Name_as(String Name) {
		LoginPage loginPage = new LoginPage(driver);
		String LoggedInUserName = loginPage.getLoggedInUserName();
		assertEquals(Name, LoggedInUserName);		
	}

	
	@Given("Click on Login tab")
	public void click_on_Login_tab() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickLoginTab();
	}

	@Given("Go for Login")
	public void go_for_Login() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickLoginButton();
	}

	@Then("User Should be Logged in system with Login Name as {string}")
	public void user_Should_be_Logged_in_system_with_Login_Name_as(String Name) {
		LoginPage loginPage = new LoginPage(driver);
		String LoggedInUserName = loginPage.getLoggedInUserName();
		assertEquals(Name, LoggedInUserName);	
	}
}