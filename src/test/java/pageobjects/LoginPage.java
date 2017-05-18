package pageobjects;

import helpers.Log;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id='Username']")
	public static WebElement username;

	@FindBy(xpath = "//*[@id='Password']")
	public static WebElement password;

	@FindBy(xpath = "//form/div[3]/button")
	public static WebElement signin_button;
	
	@FindBy(how = How.ID, using = "email_create")
	public static WebElement email_create;

	@FindBy(how = How.ID, using = "SubmitCreate")
	public static WebElement submit_create;

}
