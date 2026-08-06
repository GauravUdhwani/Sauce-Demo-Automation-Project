package Tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.Login;
import Utilities.ScreenshotUtility;



public class LoginTest extends BaseTest
{
	private static final Logger logger = LogManager.getLogger(LoginTest.class);

	@Test
	public void verifyLogin()
	{
		Login login = new Login(driver);
		logger.info("=====Verifying the Login functionality======");
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		login.clickonLoginButton();
		logger.info("User logged into the application");
		
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.saucedemo.com/inventory.html";
		logger.info("Verifying inventory page url");
		Assert.assertEquals(expectedURL, actualURL);
		logger.info("Inventory Page verified successfully");
        logger.info("=========================Login Test passed=====================");
        
        
	}
	

}
