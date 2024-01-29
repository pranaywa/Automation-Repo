package extentListeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import orangeHRMTests.BaseTest;
import utility.ScreenShotM;

public class TestNGListeners extends BaseTest implements ITestListener
{
   public static ExtentTest test;
   static ExtentReports extent = GenExtentReports.genReport("OrangeHRM");
   
	@Override
	public void onTestStart(ITestResult result) {
	String name = result.getName();
	System.out.println("testcase started"+name);
	test = extent.createTest(name);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name = result.getName();
		System.out.println("testcase passed"+name);
		test.log(Status.PASS,name);
		try {
			String screenPath = ScreenShotM.getScreenshot(driver,name);
			test.addScreenCaptureFromPath(screenPath);
		} catch (IOException e) {
			System.out.println("NullPointerException");
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("testcase skipped "+result.getName());
		test.log(Status.SKIP,result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("testcase failed "+result.getName());
		test.log(Status.FAIL,result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("test tag started "+context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("test tag finished "+context.getName());
		extent.flush();
	}

}
