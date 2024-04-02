package pageObjects.facebook;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.facebook.RegisterPageUI;

public class RegisterPageObject extends BasePage{
	WebDriver driver;
	
	public RegisterPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isEmailTextboxDisplayed() {
		waitForElementVisible(driver, RegisterPageUI.EMAIL_TEXTBOX);
		return isElementDisplayed(driver, RegisterPageUI.EMAIL_TEXTBOX);
	}
	
	public boolean isConfirmEmailTextboxDisplayed() {
		return isElementDisplayed(driver, RegisterPageUI.CF_EMAIL_TEXTBOX);
	}
	

	public void clickToRegisterButton() {
		waitForElementClickable(driver, RegisterPageUI.BUTTON_REGISTER);
		clickToElement(driver, RegisterPageUI.BUTTON_REGISTER);
	}

	public void openUrl() {
		openPageUrl(driver, "https://www.facebook.com/");
	}

	public boolean isConfirmEmailTextboxUndisplayed() {
		return isElementUndisplayed(driver, RegisterPageUI.CF_EMAIL_TEXTBOX);
	}
	
}
