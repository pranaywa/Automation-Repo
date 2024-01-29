package orangeHRMTests;

import org.testng.annotations.Test;

import extentListeners.TestNGListeners;

public class OrangeHRMLoginTest extends TestNGListeners 
{
@Test(priority = 1)
public void provideUserName() throws InterruptedException {
	test.info("provide the username");
	Thread.sleep(2000);
	login.username();
}
@Test(priority = 2)
public void providePassword() {
	test.info("provide the password");
	login.password();
}
@Test(priority = 3)
public void clickOnLoginButton() {
	test.info("clicked on login button");
	login.login();
}
}
