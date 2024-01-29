package orangeHRMTests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import orangeHRMPages.AdminUserManagementPage;
import orangeHRMPages.OrangeHRMLogin;
import utility.ReadPropData;
import utility.TimeGen;

public class BaseTest {
public static WebDriver driver;
public OrangeHRMLogin login;
public AdminUserManagementPage admin;
public ReadPropData r;
public TimeGen t;
public String value;
public static String time;

@BeforeSuite
public void browserLaunch() {
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com");
}
@BeforeClass
public void objects() throws IOException {
	login = new OrangeHRMLogin(driver);
	admin = new AdminUserManagementPage(driver);
	r = new ReadPropData();
	 value =r.getPropData("username");
	 t = new TimeGen();
	  time = t.getTime();
}

}
