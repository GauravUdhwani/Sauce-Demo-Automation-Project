package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Utilities.DriverUtility;
import Utilities.ScreenshotUtility;

public class Checkout_part_2_test extends BaseTest {
	@Test
	public void verifyWebPageOpened() {
		navigatetoCheckout2page();
		logger.info("User is navigating to checkout part 2 page");
		logger.info("User is verifying that checkout part 2 page has opened or not");
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.saucedemo.com/checkout-step-two.html";
		Assert.assertEquals(actualURL, expectedURL);
		logger.info("User has navigated to the checkout part 2 page");
		logger.info("Test verified for the opening of checkout part2 page");
	}

	@Test
	public void verifyHeaderTitle() {
		navigatetoCheckout2page();
		logger.info("User is navigating to checkout part 2 page");
		logger.info("User is verifying the header title of the checkout part 2 page");
		String actualTitle = checkout_2.headerTitle();
		String expectedTitle = "Checkout: Overview";
		Assert.assertEquals(actualTitle, expectedTitle);
		logger.info("User has verified the header title of the checkout part 2 page");
		logger.info("Test has verified for verifying the header title of the checkout part 2 page");
	}

	@Test
	public void verifyProductTitle() {
		navigatetoCheckout2page();
		logger.info("User is navigating to checkout part 2 page");
		logger.info("User is verifying the product title name");
		String actualProductTitle = checkout_2.productTitle();
		String expectedProducTitle = "Sauce Labs Backpack";
		Assert.assertEquals(actualProductTitle, expectedProducTitle);
		logger.info("User has verified the product title name");
		logger.info("Test has verified for the verifying the product title name");
	}

	@Test
	public void verifyProductPrice() {
		navigatetoCheckout2page();
		logger.info("User is navigating to the checkout part 2 page");
		logger.info("User is verifying the product price for the particular product mentioned in the page");
		String actualPrice = checkout_2.totalPrice();
		String expectedPrice = "Total: $32.39";
		Assert.assertEquals(actualPrice, expectedPrice);
		logger.info("Total price has been verified for the particular product");
		
	}

	@Test
	public void verifyClickonFinishButton() {
		navigatetoCheckout2page();
		logger.info("User is navigating to the checkout part2 page");
		logger.info("User is verifying the click functionality of the finish button");
		logger.info("User is clicking the finish button at the checkout part 2 page");
		
		if (DriverUtility.isSessionActive(driver)) 
		{

			checkout_2.clickonFinishButton();
            logger.info("User has clicked the finish button and is switching into the checkout complete page");
            String actualURL = driver.getCurrentUrl();
            String expectedURL = "https://www.saucedemo.com/checkout-complete.html";
            Assert.assertEquals(actualURL, expectedURL);
            logger.info("User has reached the checkout complete page");
            logger.info("Test has verified for the click functionality of the finish button");

		} 
		
		else 
		{

			logger.error("Driver session is already closed.");
		}

	}

	@Test
	public void verifyClickonCancelButton() {
		navigatetoCheckout2page();
		logger.info("User is navigating to the checkout part2 page");
		logger.info("User is verifying the click functionality of the cancel button");
		checkout_2.clickonCancelButton();
		logger.info("User has clicked cancel button and now switching to the inventory page");
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(actualURL, expectedURL);
		logger.info("User has navigated to the Inventory Page");
		logger.info("Test verified for the click functionality of the cancel button");
	}

}
