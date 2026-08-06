package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.WaitUitility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Inventory
{
	private WebDriver driver;
	
	private WaitUitility waitutility;
	
	
	public Inventory(WebDriver driver)
	{
		this.driver = driver;
		this.waitutility = new WaitUitility(driver);
	}
	
	
	private By productstitle = By.xpath("//span[text() = 'Products']");
	private By producttitles = By.className("inventory_item_name");
	private By dropdown = By.className("product_sort_container");
	private By shoppingcart = By.className("shopping_cart_link");
	private By shoppingbadge = By.className("shopping_cart_badge");
	private By burgerMenu = By.id("react-burger-menu-btn");
	protected Logger logger = LogManager.getLogger(getClass());
	
	public boolean isInventorydisplayed()
	{
		logger.info("Inventory Page is displaying");
		return waitutility.waitforVisibility(productstitle).isDisplayed();
	}
	
	public void printAllProducts()
	{
		logger.info("Fetching all Products present");

		
        List<WebElement> products = waitutility.waitforAllVisibleElements(producttitles);

        for (WebElement product : products) {
            System.out.println(product.getText());
        }
        logger.info("All Products gets fetched");
    }
	
	public boolean isProductAvailable(String productName)
	{
		logger.info("Searching for a particular product");
		
		List<WebElement> products = waitutility.waitforAllVisibleElements(producttitles);
		
		for(WebElement product : products)
		{
			if(product.getText().equals(productName))
			{
				logger.info("Product name is matching successfully");
				return true;
			}
		}
		
		return false;
		
	}
			
	public void addProductToCart(String productName) {

		logger.info("Product is adding to the cart");
		By addtocartbutton = By.xpath("//div[text()='" + productName +"']/ancestor::div[@class='inventory_item']//button");
        waitutility.waitforClickibilityofElementLocated(addtocartbutton).click();
        logger.info("Product is added successfully");
    }

    // Click Shopping Cart
    public void clickShoppingCart() {
    	logger.info("Clicking on shopping cart");
        waitutility.waitforClickibilityofElementLocated(shoppingcart).click();
        logger.info("Shopping cart icon gets clicked successfully");
    }

    // Click Menu
    public void clickMenu() {
    	logger.info("Clicking on Burger Menu");
    	
        waitutility.waitforClickibilityofElementLocated(burgerMenu).click();
        
        logger.info("Burger Menu gets clicked successfully");
    }

    // Get Cart Badge Count
    public String getCartBadgeCount() {
    	logger.info("Getting the badge count");
        return waitutility.waitforVisibility(shoppingbadge).getText();
    }

    // Click Sort Dropdown
    public void clickSortDropdown() 
    {
    	logger.info("Clicking on Dropdown");
        waitutility.waitforClickibilityofElementLocated(dropdown).click();
        logger.info("Dropdown gets clicked successfully");
    }
	

}
