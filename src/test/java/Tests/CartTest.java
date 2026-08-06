package Tests;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.Cart;
import Pages.Inventory;
import Pages.Login;
import Utilities.ScreenshotUtility;

import org.testng.Assert;
public class CartTest extends BaseTest {
	
	@Test
	public void verifyCartPage() {
		Login login = new Login(driver);
		Inventory inv = new Inventory(driver);
		Cart cart = new Cart(driver);
		logger.info("====Verifying the Cart Page functionality====");
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		login.clickonLoginButton();
		logger.info("User is in the inventory page");
		logger.info("User is adding a product to the cart");
		inv.addProductToCart("Sauce Labs Backpack");
		logger.info("Product is added successfully");
		logger.info("Clicking on cart icon");
		inv.clickShoppingCart();
		logger.info("Cart icon is clicked successfully");
		logger.info("user is switching into the cart page");
		Assert.assertTrue(cart.cartpageisDisplayed()); 
		logger.info("User is in the cart page");
		logger.info("Verify cart page test is passed successfully");
		
	}

	
	
	@Test
	public void verifyCartTitle()
	{
		Login login = new Login(driver);
		Inventory inv = new Inventory(driver);
		Cart cart = new Cart(driver);
		logger.info("Verifying the cart page title is present or not");
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		login.clickonLoginButton();
		logger.info("User is in the Inventory page");
		logger.info("Adding the product to the cart.");
		inv.addProductToCart("Sauce Labs Backpack");
		logger.info("Product is added successfully to the cart");
		logger.info("User is clicking on the shopping cart icon");
		inv.clickShoppingCart();
		logger.info("User is clicked into the shopping cart");
		logger.info("User is switching into the cart page");
		
		Assert.assertEquals("Your Cart", cart.cartTitleisDisplayed());
		logger.info("Cart page is displayed and Cart Title is verified successfully");
		logger.info("Verify cart title test case passed sucessfully");
		
	}
	
	
	@Test
	public void producttitleisdisplayed()
	{
		Login login = new Login(driver);
		Inventory inv = new Inventory(driver);
		Cart cart = new Cart(driver);
		logger.info("Verifying the product title is displayed or not");
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		login.clickonLoginButton();
		
		logger.info("User is in the Inventory page");
		logger.info("Adding the product to the cart.");
		
		inv.addProductToCart("Sauce Labs Backpack");
		logger.info("Product is added successfully");
		logger.info("Clicking on cart icon");
		inv.clickShoppingCart();
		logger.info("User is clicked into the shopping cart");
		logger.info("User is switching into the cart page");
		cart.productTitleisdisplayed();
		logger.info("Verifying the Product Title in the cart");
		Assert.assertEquals("Sauce Labs Backpack", cart.productTitleisdisplayed());
		logger.info("Product Title gets verified in the cart");
		logger.info("Product Title displayed test case is passed");
		
	}
	
	
	@Test
	public void checkoutaproduct()
	{
		Login login = new Login(driver);
		Inventory inv = new Inventory(driver);
		Cart cart = new Cart(driver);
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		login.clickonLoginButton();
		logger.info("User is in the inventory page");
		logger.info("Adding product to the cart");
		inv.addProductToCart("Sauce Labs Backpack");
		logger.info("Product is added to the cart");
		logger.info("Clicking on cart button");
		inv.clickShoppingCart();
		logger.info("User is on cart page");
		logger.info("Verifying the product title in the cart");
		cart.productTitleisdisplayed();
		logger.info("Product title gets displayed");
		logger.info("Clicking on checkout button");
		cart.clickonCheckoutButton();
		logger.info("Checkout button gets clicked");
		logger.info("User is moving into the checkout page");
        String actual_URL = driver.getCurrentUrl();
        String expected_URL = "https://www.saucedemo.com/checkout-step-one.html";
        Assert.assertEquals(expected_URL, actual_URL);
        logger.info("User is in the checkout page");
        logger.info("Checkout Product Functionality is verified");
        
	}
	
	
	@Test
	public void productsuccessfullyremoved()
	{
		Login login = new Login(driver);
		Inventory inv = new Inventory(driver);
		Cart cart = new Cart(driver);
		logger.info("Verifying we can successfully remove the product from the cart");
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		login.clickonLoginButton();
		logger.info("User is in the inventory page");
		logger.info("User can add a product to the cart");
		inv.addProductToCart("Sauce Labs Backpack");
		logger.info("Product is successfully added to the cart");
		logger.info("User is clicking the shopping cart icon given in the webpage");
	    inv.clickShoppingCart();
		logger.info("User clicked the shopping cart icon and switched to the cart page");
		logger.info("User is about to remove the particular product from the cart");
		cart.removeaproduct();
		Assert.assertFalse(cart.isCartBadgeDisplayed(), "Cart badge should disappear after removing the last product.");
        logger.info("The product is successfully removed from the cart");
        logger.info("Verified the successful removal functionality of the Product");
	}
	
	@Test
	public void continueShoppingpage()
	{
		Login login = new Login(driver);
		Inventory inv = new Inventory(driver);
		Cart cart = new Cart(driver);
		logger.info("Verifying the continue shopping functionality present in the cart");
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		login.clickonLoginButton();
		logger.info("User is in the inventory page");
		logger.info("User is adding a product to the cart");
        inv.addProductToCart("Sauce Labs Backpack");
        logger.info("Product is added successfully to the cart");
        logger.info("Clicking to the shopping cart");
		inv.clickShoppingCart();
		logger.info("User has clicked the shopping cart icon");
		logger.info("User is in the shopping cart page");
		logger.info("User is clicking on continue button");
		cart.continueShopping();
		logger.info("User has clicked the continue shopping button");
		logger.info("User is switching into the inventory page");
        String actual_URL = driver.getCurrentUrl();
        String exp_URL = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(exp_URL, actual_URL);
        logger.info("User is reached into the inventory page");
        logger.info("Verified the continue shopping button functionality");
		
	}
	
}
