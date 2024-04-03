package pageObjects.nopcommerce;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.nopcommerce.RegisterPageUI;

public class RegisterPageObject extends BasePage{
	private WebDriver driver;
	
	public RegisterPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickToRegisterButton() {
		waitForElementClickable(driver, RegisterPageUI.REGISTER_BUTTON);
		clickToElement(driver, RegisterPageUI.REGISTER_BUTTON);
	}

	public boolean isMessageErrorFirstnameDisplayed() {
		waitForElementVisible(driver, RegisterPageUI.ERROR_MESSAGE_FIRST_NAME);
		return isElementDisplayed(driver, RegisterPageUI.ERROR_MESSAGE_FIRST_NAME);
	}

	public boolean isMessageErrorLastnameDisplayed() {
		waitForElementVisible(driver, RegisterPageUI.ERROR_MESSAGE_LAST_NAME);
		return isElementDisplayed(driver, RegisterPageUI.ERROR_MESSAGE_LAST_NAME);
	}

	public boolean isMessageErrorEmailDisplayed() {
		waitForElementVisible(driver, RegisterPageUI.ERROR_MESSAGE__EMPTY_EMAIL);
		return isElementDisplayed(driver, RegisterPageUI.ERROR_MESSAGE__EMPTY_EMAIL);
	}

	public boolean isMessageErrorPasswordDisplayed() {
		waitForElementVisible(driver, RegisterPageUI.ERROR_MESSAGE_PASSWORD);
		return isElementDisplayed(driver, RegisterPageUI.ERROR_MESSAGE_PASSWORD);
	}

	public boolean isMessageErrorConfirmPasswordDisplayed() {
		waitForElementVisible(driver, RegisterPageUI.ERROR_MESSAGE_CF_PASSWORD);
		return isElementDisplayed(driver, RegisterPageUI.ERROR_MESSAGE_CF_PASSWORD);
	}

	public void clickToGenderMaleRadioButton() {
		waitForElementClickable(driver, RegisterPageUI.GENDER_MALE_RADIO);
		clickToElement(driver, RegisterPageUI.GENDER_MALE_RADIO);
	}

	public void inputToFirstnameTextbox(String firstName) {
		waitForElementVisible(driver, RegisterPageUI.FIRST_NAME_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.FIRST_NAME_TEXTBOX, firstName);
	}

	public void inputToLastnameTextbox(String lastName) {
		waitForElementVisible(driver, RegisterPageUI.LAST_NAME_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.LAST_NAME_TEXTBOX, lastName);
	
	}

	public void inputToEmailTextbox(String email) {
		waitForElementVisible(driver, RegisterPageUI.EMAIL_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, email);

	}

	public void inputToPasswordTextbox(String password) {
		waitForElementVisible(driver, RegisterPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.PASSWORD_TEXTBOX, password);
		
	}

	public void inputToCfPasswordTextbox(String confirmPassword) {
		waitForElementVisible(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX, confirmPassword);
		
	}

	public boolean isMessageSuccessRegisterDisplayed() {
		waitForElementVisible(driver, RegisterPageUI.SUCCSES_MESSAGE_REGISTER);
		return isElementDisplayed(driver, RegisterPageUI.SUCCSES_MESSAGE_REGISTER);
	}

	public void clickToContinueButton() {
		waitForElementClickable(driver, RegisterPageUI.CONTINUE_BUTTON);
	}

	public boolean isMessageExistEmailDisplayed() {
		waitForElementVisible(driver, RegisterPageUI.ERROR_MESSAGE_EXIST_EMAIL);
		return isElementDisplayed(driver, RegisterPageUI.ERROR_MESSAGE_EXIST_EMAIL);
	}

	public void refreshPage() {
		driver.navigate().refresh();
	}

	public void clickToLoginLink() {
		waitForElementClickable(driver, RegisterPageUI.LOGIN_LINK);
		clickToElement(driver, RegisterPageUI.LOGIN_LINK);
		
	}

	public boolean isMessageWrongEmailDisplayed() {
		waitForElementVisible(driver, RegisterPageUI.ERROR_MESSAGE__WRONG_EMAIL);
		return isElementDisplayed(driver, RegisterPageUI.ERROR_MESSAGE__WRONG_EMAIL);
	}


}
