package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoreControls extends BaseClass {

	public CoreControls(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = ".//*/a[contains(text(),'New')]")
	public static WebElement new_tab;
	
	@FindBy(xpath = "//*//li[2]/a[contains(text(),'Birth Registration Statement')]")
	public static WebElement BRS_form;
	
	@FindBy(xpath = ".//*/a[contains(text(),'of Birth')]")
	public static WebElement newNOB;

	@FindBy(id = "actionMenu")
	public static WebElement actionList;

	@FindBy(xpath = ".//*/main//action-panel//button[contains(text(),'Go')]")
	public static WebElement go;

	public static void selectSave() {
		actionList.sendKeys("Save");
	}

	public static void clickGo() {
		go.click();
	}

}
