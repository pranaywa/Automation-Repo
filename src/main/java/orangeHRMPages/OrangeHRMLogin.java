package orangeHRMPages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLogin {
	WebDriver driver;
	@FindBy(xpath = "//*[@name='username']")
	WebElement userName;
	@FindBy(xpath = "//*[@name='password']")
	WebElement userPassword;
	@FindBy(xpath = "//*[@type='submit']")
	WebElement loginButton;
	
	public OrangeHRMLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void username() {
		userName.sendKeys("Admin");
	}
	public void password() {
		userPassword.sendKeys("admin123");
	}
	public void login() {
		loginButton.click();
		
	}
	
	
	
	
}
