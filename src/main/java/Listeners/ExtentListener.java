package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import java.lang.reflect.Field;

import org.openqa.selenium.WebDriver;

import Utilities.ScreenshotUtility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Utilities.ExtentManager;

public class ExtentListener implements ITestListener
{
	ExtentReports extent = ExtentManager.getReport();
	
	ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result)
	{
		test = extent.createTest(result.getMethod().getMethodName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		test.pass("Test Passed");
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
	    test.fail(result.getThrowable());

	    try {

	        Field driverField =
	                result.getTestClass()
	                      .getRealClass()
	                      .getSuperclass()
	                      .getDeclaredField("driver");

	        driverField.setAccessible(true);

	        WebDriver driver = (WebDriver) driverField.get(result.getInstance());

	        String screenshotPath =
	                ScreenshotUtility.captureScreenshot(driver,
	                        result.getMethod().getMethodName());
	        
	        System.out.println("Screenshot Path: " + screenshotPath);

	        test.addScreenCaptureFromPath(screenshotPath);

	    }

	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	}
	
	@Override
    public void onTestSkipped(ITestResult result) {

        test.skip("Test Skipped");

    }

    @Override
    public void onFinish(ITestContext context) {

        extent.flush();

    }
	
	

}
