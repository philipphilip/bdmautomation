package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.BRSPage;
import pageobjects.CoreControls;

public class GoToBRSForm {

	public static void Execute(WebDriver driver) throws Exception {
		System.out.println("we are in the go to BRS execution");
		WebDriverWait waitForTabsMenue = new WebDriverWait(driver, 10000);
		CoreControls.new_tab = waitForTabsMenue.until(ExpectedConditions.elementToBeClickable(CoreControls.new_tab));
		CoreControls.new_tab.click();
		CoreControls.BRS_form.click();

	}

}
