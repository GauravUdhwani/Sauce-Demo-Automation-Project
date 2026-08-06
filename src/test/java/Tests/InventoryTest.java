package Tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.Inventory;
import Pages.Login;
import Utilities.ScreenshotUtility;


public class InventoryTest extends BaseTest
{
	private static final Logger logger = LogManager.getLogger(InventoryTest.class);
	
	@Test
	public void verifyInventoryPage()
	{
		Login login = new Login(driver);
		
		Inventory inv = new Inventory(driver);
		logger.info("====Starting verifying Inventory Page Test=======");
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		login.clickonLoginButton();
		
		logger.info("User logged into the application successfully");
		logger.info("User switched into the Inventory Page");
		String actualURL = driver.getCurrentUrl();
		String expectedURL 	= "https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(actualURL, expectedURL);
		logger.info("Verifying the inventory page is opened or not");
		Assert.assertTrue(inv.isInventorydisplayed());
		logger.info("Inventory Page is displayed successfully");
		logger.info("Verify Inventory Page test case is passed");
		
	}
	
	@Test
	public void verifyproductsnamesaredisplayed()
	{
		Login login = new Login(driver);
		Inventory inv = new Inventory(driver);
		logger.info("Starting Verifying the test for the list of product names");
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		login.clickonLoginButton();
		logger.info("User is switched into the inventory Page");
		String actualURL = driver.getCurrentUrl();
		String expectedURL 	= "https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(actualURL, expectedURL);
		logger.info("User is in the Inventory Page");
		logger.info("Printing all the product names");
		inv.printAllProducts();
		logger.info("All product names are displayed");
		logger.info("Product names list test is verified successfully");
		logger.info("                                                                          ");
	}
	
	@Test
	public void usercanaddaProduct()
	{
		Login login = new Login(driver);
		Inventory inv = new Inventory(driver);
		logger.info("Starting verifying the add product functionality feature test");
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		login.clickonLoginButton();
		logger.info("User is switching into the inventory page");
		String actualURL = driver.getCurrentUrl();
		String expectedURL 	= "https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(actualURL, expectedURL);
		logger.info("User is in the inventory page");
		logger.info("Verifying Adding Product to the cart");
		inv.addProductToCart("Sauce Labs Bolt T-Shirt");
		String exp_badge = "1";
		String act_badge = inv.getCartBadgeCount();
		logger.info("Adding Product to the cart");
		Assert.assertEquals(act_badge, exp_badge);
		logger.info("Product is successfully added to the cart");
		logger.info("Adding Product to the cart test is verified");
		
		
		
	}
	
	
	
	@Test
	public void shoppingcartclickTest()
	{
		
		
		Login login = new Login(driver);
		Inventory inv = new Inventory(driver);
		logger.info("Verifying the shopping cart click test");
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		login.clickonLoginButton();
		logger.info("User is in the inventory page");
		String actualURL = driver.getCurrentUrl();
		String expectedURL 	= "https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(actualURL, expectedURL);
		
		logger.info("User is clicking the shopping cart");
		inv.clickShoppingCart();
		logger.info("Shopping cart is clicked successfully");
		logger.info("User is switching into the cart page");
		String actualURL1 = driver.getCurrentUrl();
		String expectedURL1 = "https://www.saucedemo.com/cart.html";
		logger.info("Actual URL: {}", actualURL1);
		logger.info("Expected URL: {}", expectedURL1);
		Assert.assertEquals(actualURL1, expectedURL1);
		logger.info("User is in the cart page");
		logger.info("Shopping cart click test gets verified successfully");
		
		
		
	}
	
	 
	
	

}
