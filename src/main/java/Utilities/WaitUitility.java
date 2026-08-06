package Utilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUitility 
{
	private WebDriver driver;
	private WebDriverWait wait;
	
	public WaitUitility(WebDriver driver)
	{
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(120));
	}
	
	public WebElement waitforVisibility(By locator)
	{
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	
	public WebElement waitforClickibilityofElementLocated(By locator)
	{
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public List<WebElement> waitforAllVisibleElements(By Locator)
	{
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Locator));
	}
	
	
	

}
