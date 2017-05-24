package modules;

import helpers.Log;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import pageobjects.LoginPage;

public class SignInAction {

	public static void Execute(WebDriver driver, HashMap<String, String> map) throws Exception {

		LoginPage.username.sendKeys("admin");
		Log.info(" is entered in UserName text box");

		LoginPage.password.sendKeys("a");
		Log.info(" is entered in Password text box");

		LoginPage.signin_button.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Reporter.log("SignIn Action is successfully perfomred");
	}
}