package pageObjects.hrm;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.hrm.LoginPUI;

public class LoginPO extends BasePage{
	WebDriver driver;

	public LoginPO(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToLoginButton() {
		waitForElementClickable(driver, LoginPUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPUI.LOGIN_BUTTON);
	}
}
