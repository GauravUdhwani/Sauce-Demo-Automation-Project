package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.WaitUitility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Cart
{
	private WebDriver driver;

	private By cartTitle = By.xpath("//span[text() = 'Your Cart']");
	private By shoppingcart = By.className("shopping_cart_link");
	private By shoppingbadge = By.className("shopping_cart_badge");
	
	private By productTitle = By.className("inventory_item_name");
	private By checkout = By.id("checkout");
	private By continue_shopping = By.id("continue-shopping");
	private By remove_button = By.xpath("//button[text()='Remove']"); 
	private By burgerMenu = By.id("react-burger-menu-btn");
	protected Logger logger = LogManager.getLogger(getClass());
	private WaitUitility waitutility;
			

	
	
	public Cart(WebDriver driver)
	{
		this.driver = driver;
		this.waitutility = new WaitUitility(driver);
	}
	
	public boolean cartpageisDisplayed()
	{
		if(driver.getCurrentUrl().equals("https://www.saucedemo.com/cart.html"))
		{
			logger.info("Cart Page displayed successfully");
			return true;
		}
		
		else
		{
			logger.info("Cart Page is not displayed");
			return false;
		}
	}
	
	public String cartTitleisDisplayed()
	{
		logger.info("Displaying the cart Title");
		return waitutility.waitforVisibility(cartTitle).getText();
	}
	
	public String productTitleisdisplayed()
	{
		logger.info("Displaying the product Title");
		return waitutility.waitforVisibility(productTitle).getText();
	}
	
	public void clickShoppingCart() 
	{
		logger.info("Clicking on shopping cart");
        waitutility.waitforClickibilityofElementLocated(shoppingcart).click();
        logger.info("Shopping cart gets clicked successfully");
    }
	
	public void clickMenu() 
	{
		logger.info("Clicking on Burger Menu");
		waitutility.waitforClickibilityofElementLocated(burgerMenu).click();
        
        logger.info("Burger Menu gets clicked");
    }
	
	public boolean isCartBadgeDisplayed()
	{
		logger.info("Badge count is getting fetched");
	    return driver.findElements(shoppingbadge).size() > 0;
	}
	
	public void clickonCheckoutButton()
	{
		logger.info("Clicking on Checkout button");
		waitutility.waitforClickibilityofElementLocated(checkout).click();
		logger.info("Checkout Button gets clicked successfully");
	}
	
	
	public void removeaproduct()
	{
		logger.info("Clicking remove button in the cart");
		waitutility.waitforVisibility(remove_button).click();
		logger.info("Product gets removed successfully");
	}
	
	public void continueShopping()
	{
		logger.info("Clicking on continue shopping button");
		waitutility.waitforClickibilityofElementLocated(continue_shopping).click();
		logger.info("Continue Shopping Button gets clicked");
	}
	
}
