package orangeHRMTests;

import org.testng.annotations.Test;

import extentListeners.TestNGListeners;

public class AdminUserCreationTest extends TestNGListeners
{
	@Test(priority = 4)
	public void clickOnAdmin() throws InterruptedException {
		Thread.sleep(3000);
		test.info("clicked on the admin button in left panel");
		admin.clickOnAdmin();
	}
	@Test(priority = 5)
	public void clickOnAddButton() throws InterruptedException {
		Thread.sleep(3000);
		test.info("click on add button to add the user");
		admin.clickOnAdd();
	}
	@Test(priority = 6)
	public void provideUserDetails() throws InterruptedException {
		Thread.sleep(3000);
		test.info("provide the detail for adding the user");
		admin.addUser(this.value+time);
	}
	@Test(priority = 7)
	public void clickOnSaveButton() throws InterruptedException {
		Thread.sleep(2000);
		test.info("click on save button");
		admin.clickOnSave();
	}

}
