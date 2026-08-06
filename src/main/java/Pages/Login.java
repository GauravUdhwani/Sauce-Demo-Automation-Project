package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import Utilities.WaitUitility;

public class Login
{
	private WebDriver driver;
	
	private By username = By.id("user-name");
	private By password = By.id("password");
	private By loginbutton = By.id("login-button");
	private By errorMessage = By.cssSelector("h3[data-test='error']");
	protected final Logger logger = LogManager.getLogger(getClass());
	private WaitUitility waitutility;
	
	public Login(WebDriver driver)
	{
		this.driver = driver;
		this.waitutility = new WaitUitility(driver);
	}
	
	


	public void enterUsername(String Username)
	{
		logger.info("Enter the username");
		
		waitutility.waitforVisibility(username).sendKeys(Username);
		logger.info("Username entered successfully");
	}
	
	public void enterPassword(String pwd)
	{
		logger.info("Enter the Password");
		waitutility.waitforVisibility(password).sendKeys(pwd);
		logger.info("Password is entered successfully");
	}
	
	public void clickonLoginButton()
	{
		logger.info("Click on Login Button");
		waitutility.waitforClickibilityofElementLocated(loginbutton).click();
		logger.info("Login Button gets clicked");
	}
	
	public void login(String Username, String pwd)
	{
		enterUsername(Username);
		enterPassword(pwd);
		clickonLoginButton();
		
		
	}
	
	public String getErrorMessage()
	{
		logger.info("Retrieving the error message");
		return waitutility.waitforVisibility(errorMessage).getText();
	}
	
	

}
