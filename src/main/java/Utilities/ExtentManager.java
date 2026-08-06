package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager 
{
	private static ExtentReports extent;
	
	public static ExtentReports getReport()
	{
		if(extent == null)
		{
			ExtentSparkReporter spark = new ExtentSparkReporter("test-output/ExtentReport.html");
			spark.config().setReportName("Sauce Demo Automation Report");
			spark.config().setDocumentTitle("Automation Test Report");
			extent = new ExtentReports();
			extent.attachReporter(spark);
			extent.setSystemInfo("Tester", "Gaurav");
			extent.setSystemInfo("OS", "Windows");
			extent.setSystemInfo("Browser", "Chrome");
			
		}
		
		return extent;
			
	}

}
