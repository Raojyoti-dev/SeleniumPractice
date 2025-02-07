package TestNG11_Listeners_ExtentReportGeneration;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportUtils implements ITestListener {
	
	public ExtentSparkReporter sparkReporter; //UI of the report
	public ExtentReports extent; //populate common info on the report
	public ExtentTest test;  //creating test case entries in the report and update status of the test methods
	
	public void onStart(ITestContext context) {
	    
		sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"\\MyReports\\MyFirstReport.html");
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setReportName("Functional Testing");
		sparkReporter.config().setTheme(Theme.DARK);
		
		extent =new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Computer Name", "localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester Name", "Jyoti");
		extent.setSystemInfo("OS","Windows10");
		extent.setSystemInfo("Browser Name","Chrome");
	
	}
	
	public void onTestStart(ITestResult result) {
		   
	}

	public void onTestSuccess(ITestResult result) {
		   test=extent.createTest(result.getName()); //create a new entry in the report
		   test.log(Status.PASS,"Test case passes is: "+result.getName());//update the status p/f/s
		   
	}

	public void onTestFailure(ITestResult result) {
		
		test=extent.createTest(result.getName());
		test.log(Status.FAIL,"Test case failed is: "+result.getName());
		test.log(Status.FAIL,"Test case failed cause: "+result.getThrowable());
		    
	}
	public void onTestSkipped(ITestResult result) {
		
		test=extent.createTest(result.getName());
		test.log(Status.SKIP,"Test case skipped is: "+result.getName());
		    
	}
	public  void onFinish(ITestContext context) {
		
		extent.flush();
		    
	}
}
