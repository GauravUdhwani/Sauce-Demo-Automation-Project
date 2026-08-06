package Utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer
{
	private int retryCount = 0;
	private static final int maxretryCount = 3;
	
	@Override
	public boolean retry(ITestResult result)
	{
		if(retryCount<maxretryCount)
		{
			retryCount++;
			
			System.out.println("Retrying Test : " +result.getName()+ "| Attempt : " + retryCount);
			
            return true;			
		}
		
		return false;
		
		
	}

}
