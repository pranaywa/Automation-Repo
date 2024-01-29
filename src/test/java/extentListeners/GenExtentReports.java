package extentListeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class GenExtentReports {
	public static ExtentReports extent;
public static ExtentReports genReport(String name) {
	String folderPath = System.getProperty("user.dir")+"//ExtendReportFiles//"+name+".html";
	ExtentHtmlReporter reporter = new ExtentHtmlReporter(folderPath);
	reporter.config().setTheme(Theme.DARK);
	reporter.config().setReportName("Orange HRM Extent Report");
	 extent = new ExtentReports();
	 extent.attachReporter(reporter);
	 extent.setSystemInfo("Environment","QA");
	 extent.setSystemInfo("version","2.0");
	 extent.setSystemInfo("Executed By","Pranay wane");
	return extent;
}
}
