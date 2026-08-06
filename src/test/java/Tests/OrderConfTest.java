package Tests;



import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Utilities.ScreenshotUtility;

public class OrderConfTest extends BaseTest
{
    @Test
    public void verifyOrderconfPage()
    {
    	navigatetoOrderConfirmationPage();
    	logger.info("Verifying the test whether user has navigated to order conf page or not");
    	logger.info("User is navigating to the order confirmation page");
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.saucedemo.com/checkout-complete.html";
        Assert.assertEquals(actualURL, expectedURL);
        logger.info("User has navigated to the order confimation page");
    }
    
    @Test
    public void verifyHeaderTitle()
    {
    	navigatetoOrderConfirmationPage();
    	logger.info("User has navigated to the Order Confirmation Page");
    	logger.info("Verifying the test for getting the header title of the page");
    	logger.info("User is getting the header title of the page");
        String actualTitle = orderconf.headerTitle();
        String expectedTitle = "Checkout: Complete!";
        Assert.assertEquals(actualTitle, expectedTitle);
        logger.info("User have got the header title of the page");
        logger.info("Test has been verified for the header title of the page");
    }
	
   @Test
   public void verifyConfmsg()
   {
	   navigatetoOrderConfirmationPage();
	   logger.info("User has navigated to the Order Confirmation Page");
	   logger.info("Verifying the test for getting the order confirmation message");
	   logger.info("User is getting the Order Confirmation Msg");
       String actualMsg = orderconf.confMsg();
       String expectedMsg = "Thank you for your order!";
       Assert.assertEquals(actualMsg, expectedMsg);
       logger.info("User has got the Order confirmation message");
       logger.info("Test has been verified for the order confirmation message");
   }
   
   @Test
   public void verifyConfDesc()
   {
	   navigatetoOrderConfirmationPage();
	   logger.info("User has navigated to the Order Confirmation Page");
	   logger.info("Verifying the test for getting the order conf desc");
	   logger.info("User is getting the confirmation desc");
       String actualDesc = orderconf.confDesc();
       String expectedDesc = "Your order has been dispatched, and will arrive just as fast as the pony can get there!";
       Assert.assertEquals(actualDesc, expectedDesc);
       logger.info("User has got the order confirmation desc");
       logger.info("Test has been verified for order confirmation desc");
   }
   
   @Test
   public void verifyBackButtonfunctionality()
   {
	   navigatetoOrderConfirmationPage();
	   logger.info("User has navigated to the Order Confirmation Page");
	   logger.info("Verifying the test for the Back button functionality");
	   logger.info("User is clicking the Back Button");
       orderconf.clickonBackButton();
       logger.info("User clicked back button and switching into the inventory page");
       String actualURL = driver.getCurrentUrl();
       String expectedURL = "https://www.saucedemo.com/inventory.html";
       Assert.assertEquals(actualURL, expectedURL);
       logger.info("User has switched into the inventory page");
       logger.info("Test verified for Back button functionality");
   }
}
