package Tests;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.Cart;
import Pages.Checkout;
import Pages.Inventory;
import Pages.Login;
import Utilities.ScreenshotUtility;


public class CheckoutTest extends BaseTest
{
	@Test
	public void verifyCheckoutPageopened()
	{
		Login login = new Login(driver);
		Inventory inv = new Inventory(driver);
		Cart cart = new Cart(driver);
		Checkout checkout = new Checkout(driver);
		logger.info("Verifying the checkout page opening functionality");
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		login.clickonLoginButton();
		logger.info("User is in the inventory page");
		logger.info("User is adding a product to the cart");
		inv.addProductToCart("Sauce Labs Backpack");
			
		logger.info("Product is successfully added to the cart");
		logger.info("User is clicking the shopping cart icon");
		inv.clickShoppingCart();
		logger.info("User is clicked into the shopping cart icon");
		logger.info("User is in the shopping cart page");
		logger.info("User is clicking into the checkout button");
		cart.clickonCheckoutButton();
		logger.info("User has clicked the checkout button");
		logger.info("User is switching into the checkout page");
		
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.saucedemo.com/checkout-step-one.html";
		Assert.assertEquals(actualURL, expectedURL);
		logger.info("User has switched himself into the checkout page");
		logger.info("Opening of Checkout page functionality is verified");
	}
	
	@Test
	public void verifyCheckoutTitle()
	{
		Login login = new Login(driver);
		Inventory inv = new Inventory(driver);
		Cart cart = new Cart(driver);
		Checkout checkout = new Checkout(driver);
		
		
		logger.info("Verifying the Checkout Title functionality");
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		login.clickonLoginButton();
		logger.info("User is on the Inventory Page");
		logger.info("User is adding Product to the cart");
		inv.addProductToCart("Sauce Labs Backpack");
		logger.info("Product is added to the cart successfully");
		/*
		 * al = driver.switchTo().alert(); al.acceAlertpt();
		 */
		
		logger.info("User is clicking the shopping cart");
		inv.clickShoppingCart();
		logger.info("User clicked the cart and on the cart page");
		logger.info("User is clicking on the checkout button");
		cart.clickonCheckoutButton();
		logger.info("User clicked the checkout button");
		logger.info("User is on the checkout page");
		logger.info("Fetching the title of the checkout page");
		Assert.assertEquals("Checkout: Your Information", checkout.checkoutTitle());
		logger.info("The title of the checkout page fetched successfully");
		logger.info("Verified the Checkout Title Test");
	}
	
	@Test
	public void adddetailsandcontinue()
	{
		Login login = new Login(driver);
		Inventory inv = new Inventory(driver);
		Cart cart = new Cart(driver);
		Checkout checkout = new Checkout(driver);
		
		
		logger.info("Verifying the adding details and continue functionality");
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		login.clickonLoginButton();
		logger.info("User is on the inventory page");
		logger.info("User is adding a product to the cart");
		inv.addProductToCart("Sauce Labs Backpack");
		logger.info("The product is added successfully to the cart");
		logger.info("User is clicking the shopping cart");
		inv.clickShoppingCart();
		logger.info("User clicked on the cart and it is on the cart page");
		logger.info("User is clicking on the checkout Button");
		cart.clickonCheckoutButton();
		logger.info("User clicked on checkout button and switched into the checkout page");
		logger.info("User is entering the details in the page");
		checkout.enterfirstname("Gaurav");
		checkout.enterlastname("Udhwani");
		checkout.enterZipCode("305004");
		logger.info("User is clicking on continue button");
		checkout.clickonContinueButton();
		logger.info("User is clicked the continue button and switching into the checkout step 2 page");
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.saucedemo.com/checkout-step-two.html";
		Assert.assertEquals(expectedURL, actualURL);
		logger.info("User is on the checkout step 2 page");
		logger.info("Verified the test for adding details and continue functionality");
	}
	
	@Test
	public void cancelButton()
	{
		Login login = new Login(driver);
		Inventory inv = new Inventory(driver);
		Cart cart = new Cart(driver);
		Checkout checkout = new Checkout(driver);
		
		
		logger.info("Verifying the cancel Button functionality");
		
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		login.clickonLoginButton();
		logger.info("User is on the Inventory Page");
		logger.info("User is adding the Product to the cart");
		inv.addProductToCart("Sauce Labs Backpack");
		logger.info("Product is added successfully to the cart");
		
		logger.info("User is clicking the shopping cart button");
		inv.clickShoppingCart();
		logger.info("User has clicked the shopping cart button and switched to the cart page");
		logger.info("User is clicking the checkout button");
		cart.clickonCheckoutButton();
		logger.info("User clicked the checkout button and switched to the checkout page");
		logger.info("User is clicking the cancel button");
		checkout.clickonCancelButton();
		logger.info("User has clicked the Cancel Button and is switching into the cart page");
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.saucedemo.com/cart.html";
		Assert.assertEquals(expectedURL, actualURL);
		logger.info("User has switched into the cart page");
		logger.info("Verified the Cancel Button functionality");
	}
	
	@Test
	public void clickonShoppingCart()
	{
		Login login = new Login(driver);
		Inventory inv = new Inventory(driver);
		Cart cart = new Cart(driver);
		Checkout checkout = new Checkout(driver);
		
		
		logger.info("Verifying the click functionality of Shopping cart icon");
		
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		login.clickonLoginButton();
		logger.info("User is on the inventory page and adding a product in the cart");
		inv.addProductToCart("Sauce Labs Backpack");
		logger.info("Product is added successfully to the cart");
		
		logger.info("User is clicking on the cart");
		inv.clickShoppingCart();
	    logger.info("User has clicked on the cart icon and is on the cart page");
	    logger.info("User is clicking on the checkout button");
		cart.clickonCheckoutButton();
		logger.info("User has clicked the checkout button and is on the checkout page");
		logger.info("User is clicking the cart icon");
		checkout.clickShoppingCart();
		logger.info("User has clicked the cart icon");
		logger.info("User is moving into the cart page");
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.saucedemo.com/cart.html";
		Assert.assertEquals(expectedURL, actualURL);
		logger.info("User has switched into the cart page");
		logger.info("Test is verified for click on shopping cart button");
	}
	
}
