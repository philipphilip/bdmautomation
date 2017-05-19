package modules;

import helpers.Log;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import pageobjects.AutomationHomePage;

public class SignoutAction {

	public static void Execute(WebDriver driver) throws Exception {
		System.out.println("This point is in Sign out class before click");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		AutomationHomePage.sign_out.click();
		System.out.println("This point is in Sign out class after the sign out click");
		Log.info("Sign out is performed");

		Reporter.log("Sign out is performed");
	}
}
