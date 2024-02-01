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

public class Home {
public void home(){
System.out.println("this is a home test class");
}
public static void main(String[]args){
Home h = new Home();
h.home();
}
}
