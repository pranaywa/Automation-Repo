package orangeHRMPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUserManagementPage {
	WebDriver driver;
@FindBy(xpath = "//*[text()='Admin']")
WebElement adminButton;
@FindBy(xpath = " //*[text()=' Add ']")
WebElement addButton;
@FindBy(xpath = "(//*[text()='-- Select --'])[1]")
WebElement userRoleDropdown;
@FindBy(xpath = "(//*[@placeholder='Type for hints...'])")
WebElement employeeName;
@FindBy(xpath = "(//*[@class='oxd-select-text-input'])[2]")
WebElement statusDropdown;
@FindBy(xpath = "(//*[@class='oxd-input oxd-input--active'])[2]")
WebElement userName;
@FindBy(xpath = "(//*[@type='password'])[1]")
WebElement password;
@FindBy(xpath = "(//*[@type='password'])[2]")
WebElement confirmPassword;
@FindBy(xpath = "(//*[@type='submit'])")
WebElement saveButton;

public AdminUserManagementPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver,this);
}

 public void clickOnAdmin() {
	 adminButton.click();
 }
 public void clickOnAdd() {
	 addButton.click();
 }
 public void addUser(String username) throws InterruptedException {
	userRoleDropdown.click();
	Actions act = new Actions(driver);
	act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	
	
	 employeeName.sendKeys("test");
	 Thread.sleep(3000);
	 act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	 
	statusDropdown.click();
	act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	 
	 userName.sendKeys(username); // make it variable
	 Thread.sleep(1000);
	 password.sendKeys("Pw@256521");
	 confirmPassword.sendKeys("Pw@256521");
 }
 public void clickOnSave() {
	 saveButton.click();
 }


}
