package Base;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import Pages.Cart;
import Pages.Checkout;
import Pages.Checkout_part_2;
import Pages.Inventory;
import Pages.Login;
import Pages.OrderConfirmation;
import Utilities.ConfigReader;
import Utilities.DriverFactory;

public class BaseTest {
	protected WebDriver driver;
	protected Login login;
	protected Inventory inv;
	protected Cart cart;
	protected Checkout checkout;
	protected Checkout_part_2 checkout_2;
	protected OrderConfirmation orderconf;
	protected final Logger logger = LogManager.getLogger(getClass());

	@BeforeMethod
	@Parameters("browser")
	public void setup(@Optional("chrome") String browser) {
		logger.info("Launching {} Browser", browser);

		DriverFactory.getDriver(browser);
		driver = DriverFactory.getDriver();

		logger.info("{} Browser launched successfully", browser);

		driver.manage().window().maximize();

		driver.manage().timeouts()
				.implicitlyWait(Duration.ofSeconds(Long.parseLong(ConfigReader.getProperty("implicitWait"))));

		driver.get(ConfigReader.getProperty("url"));

		login = new Login(driver);
		inv = new Inventory(driver);
		cart = new Cart(driver);
		checkout = new Checkout(driver);
		checkout_2 = new Checkout_part_2(driver);
		orderconf = new OrderConfirmation(driver);
	}

	protected void navigatetoInventory() {
		login.login("standard_user", "secret_sauce");

		inv.isInventorydisplayed();
	}

	protected void navigatetoCart() {
		login.login("standard_user", "secret_sauce");

		inv.isInventorydisplayed();

		cart.cartpageisDisplayed();
	}

	protected void navigatetoCheckout() {
		login.login("standard_user", "secret_sauce");

		inv.isInventorydisplayed();

		cart.cartpageisDisplayed();
		checkout.checkoutTitle();

	}

	protected void navigatetoCheckout2page() {
		login.login("standard_user", "secret_sauce");

		inv.isInventorydisplayed();
		inv.addProductToCart("Sauce Labs Backpack");
		inv.clickShoppingCart();
		cart.cartpageisDisplayed();
		cart.clickonCheckoutButton();
		checkout.checkoutTitle();
		checkout.entercheckoutinformation("Gaurav", "Udhwani", "305004");
		checkout.clickonContinueButton();
		checkout_2.headerTitle();
	}

	protected void navigatetoOrderConfirmationPage() {
		navigatetoCheckout2page();
		checkout_2.clickonFinishButton();
		orderconf.headerTitle();

	}

	@AfterMethod
	public void teardown() {
		DriverFactory.quitDriver();
	}

}
