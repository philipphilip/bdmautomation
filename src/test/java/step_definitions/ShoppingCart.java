package step_definitions;

import helpers.DataHelper;
import helpers.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import modules.GoToNOBForm;
import modules.SignInAction;
import modules.GoToNOBForm;
import modules.SignoutAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.AutomationHomePage;
import pageobjects.LoginPage;
import pageobjects.NOBPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShoppingCart {
	public WebDriver driver;
	// public List<HashMap<String,String>> datamap = DataHelper.data();
	public static List<HashMap<String, String>> datamap = null;

	public ShoppingCart() {
		driver = Hooks.driver;

		datamap = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> sampleData = new HashMap<String, String>();
		sampleData.put("username", "abc@xyz.com");
		sampleData.put("password", "Test@123");
		System.out.println("Current data" + sampleData);
		datamap.add(sampleData);
	}

	@When("^I open eRegistry website$")
	public void i_open_automationpractice_website() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get("http://10.22.3.205/eregistry/birth/draft-nob");
	}

	@When("^I sign in$")
	public void i_sign_in() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, AutomationHomePage.class);
		PageFactory.initElements(driver, LoginPage.class);
		SignInAction.Execute(driver, datamap.get(0));
		System.out.println("after loging in");
	}

	@Then("^I sign out$")
	public void i_sign_out() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Just before the sign out");
		SignoutAction.Execute(driver);
		System.out.println("Just after the sign out");
	}

	@When("^I navigate to \"(.*?)\" new form$")
	public void i_navigate_to_new_form(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(arg1);
		if (arg1.equals("NOB")) {
			PageFactory.initElements(driver, NOBPage.class);
			GoToNOBForm.Execute(driver, arg1);
		} else if (arg1.equals("COD")) {
			// Go to Cause of Death form
		}
	}

	@When("^I view errors on the form \"(.*?)\" form$")
	public void i_submit_blank_form(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, NOBPage.class);
		NOBPage.View_NOB_Form_Errors();
	}

	@Then("^I should Get all mandatory fields validation$")
	public void i_should_Get_all_mandatory_fields_validation() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

}