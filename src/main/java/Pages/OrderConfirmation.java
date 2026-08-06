package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.WaitUitility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OrderConfirmation
{
	private WebDriver driver;
	
	private By headerTitle = By.xpath("//span[text()='Checkout: Complete!']"); 
	private By logoImg = By.xpath("//img[@alt='Pony Express']");
	private By confMsg = By.xpath("//h2[text()='Thank you for your order!']");
	private By confDesc = By.xpath("//div[text()='Your order has been dispatched, and will arrive just as fast as the pony can get there!']");
	private By backButton = By.id("back-to-products");
	private By shoppingCart = By.xpath("//a[@class='shopping_cart_link']");
	protected Logger logger = LogManager.getLogger(getClass());
	private WaitUitility waitutility;
	
	public OrderConfirmation(WebDriver driver)
	{
		this.driver = driver;
		this.waitutility = new WaitUitility(driver);
	}
	
	public String headerTitle()
	{
		logger.info("Retreiving the Page Header title");
		return waitutility.waitforVisibility(headerTitle).getText();
	}
	
	
	public String confMsg()
	{
		logger.info("Retreiving the order confirmation message");
		return waitutility.waitforVisibility(confMsg).getText();
	}
	
	public String confDesc()
	{
		logger.info("Retrieving the order confirmation description");
		return waitutility.waitforVisibility(confDesc).getText();
	}
	
	public void clickonBackButton()
	{
		logger.info("Clicking on the Back Button");
		waitutility.waitforClickibilityofElementLocated(backButton).click();
		logger.info("Back Button gets clicked successfully");
	}
	
	public void clickonShoppingCart()
	{
		logger.info("Clicking on the shopping cart");
		waitutility.waitforClickibilityofElementLocated(shoppingCart).click();
		logger.info("Shopping cart gets clicked successfully");
	}

}
