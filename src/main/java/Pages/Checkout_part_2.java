package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.WaitUitility;
import Utilities.DriverUtility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Checkout_part_2
{
	private WebDriver driver;
	private By headerTitle = By.xpath("//span[@class='title']");
    private By productTitle = By.xpath("//div[text() = 'Sauce Labs Backpack']");
    private By totalPrice = By.xpath("//div[@class='summary_total_label']");
    private By finish_button = By.id("finish");
    private By cancel_button = By.id("cancel");
    protected Logger logger = LogManager.getLogger(getClass());
    private WaitUitility waitutility;
    
    public Checkout_part_2(WebDriver driver)
    {
    	this.driver = driver;
    	this.waitutility = new WaitUitility(driver);
    }
    	
    
    public String headerTitle()
    {
    	logger.info("Fetching the header title");
    	
    	return waitutility.waitforVisibility(headerTitle).getText();
    }
    
    public String productTitle()
    {
    	logger.info("Fetching the Product Title");
    	return waitutility.waitforVisibility(productTitle).getText();
    }
    
    public String totalPrice()
    {
    	logger.info("Fetching the total price");
    	return waitutility.waitforVisibility(totalPrice).getText();
    }
    
    public void clickonFinishButton()
    {
    	logger.info("Clicking on Finish Button");
    	waitutility.waitforClickibilityofElementLocated(finish_button).click();
    	logger.info("Finish Button get clicked successfully");
    }
    
    public void clickonCancelButton()
    {
    	logger.info("Clicking on Cancel Button");
    	waitutility.waitforClickibilityofElementLocated(cancel_button).click();
    	logger.info("Cancel Button gets clicked successfully");
    }
    
    
    
	
}
