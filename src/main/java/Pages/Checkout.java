package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.WaitUitility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Checkout
{
	private WebDriver driver;
	private By checkout_title = By.xpath("//span[text()='Checkout: Your Information']");
	private By shoppingcart = By.className("shopping_cart_link");
	private By shoppingbadge = By.className("shopping_cart_badge");
	private By firstname = By.id("first-name");
	private By lastname = By.id("last-name");
	private By zipcode = By.id("postal-code");
	private By continue_button = By.id("continue");
	private By cancel_button = By.id("cancel");
	private By burgerMenu = By.id("react-burger-menu-btn");
	protected Logger logger = LogManager.getLogger(getClass());
	private WaitUitility waitutility;
	
	public Checkout(WebDriver driver)
	{
		this.driver = driver;
		this.waitutility = new WaitUitility(driver);
	}
	
	public String checkoutTitle()
	{
		logger.info("Fetching the title of the checkout page.");
		return waitutility.waitforVisibility(checkout_title).getText();
	}
	
	public void enterfirstname(String fname)
	{
		logger.info("Entering the first name ");
		waitutility.waitforVisibility(firstname).sendKeys(fname);
		logger.info("First Name is entered successfully");
	}
	
	public void enterlastname(String lname)
	{
		logger.info("Entering the last name ");
	    waitutility.waitforVisibility(lastname).sendKeys(lname);
		logger.info("Last Name is entered successfully");
	}
	
	public void enterZipCode(String zip_c)
	{
		logger.info("Entering the ZipCode");
		waitutility.waitforVisibility(zipcode).sendKeys(zip_c);
		logger.info("Zipcode is entered successfully");
	}
	
	public void entercheckoutinformation(String First_name, String Last_name, String Z_code)
	{
		enterfirstname(First_name);
		enterlastname(Last_name);
		enterZipCode(Z_code);
	}
	
	
	
	public void clickonContinueButton()
	{
		logger.info("Clicking on continue button");
		waitutility.waitforClickibilityofElementLocated(continue_button).click();
		logger.info("Continue Button gets clicked");
	}
	
	public void clickonCancelButton()
	{
		logger.info("Clicking on Cancel button");
		waitutility.waitforClickibilityofElementLocated(cancel_button).click();
		logger.info("Cancel Button clicked successfully");
	}
	
	public void clickShoppingCart() {
		logger.info("Clicking on Shopping cart");
        waitutility.waitforClickibilityofElementLocated(shoppingcart).click();
        logger.info("Shopping cart gets clicked");
    }

    // Click Menu
    public void clickMenu() {
    	logger.info("Clicking on Burger Menu");
        waitutility.waitforClickibilityofElementLocated(burgerMenu).click();
        logger.info("Burger Menu gets clicked");
    }

    // Get Cart Badge Count
    public String getCartBadgeCount() {
    	logger.info("Badge Count is getting fetched");
        return waitutility.waitforVisibility(shoppingbadge).getText();
	}
}