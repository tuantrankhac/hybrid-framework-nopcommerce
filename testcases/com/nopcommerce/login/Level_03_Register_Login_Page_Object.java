package com.nopcommerce.login;

import org.testng.annotations.Test;

import pageObjects.nopcommerce.HomePageObject;
import pageObjects.nopcommerce.LoginPageObject;
import pageObjects.nopcommerce.RegisterPageObject;

import org.testng.annotations.BeforeClass;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Level_03_Register_Login_Page_Object{
	WebDriver driver;
	
	String objectPath = System.getProperty("user.dir");
	String emailAddress;
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", objectPath + "\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		emailAddress = "test" + generateEmail();
	}

	@Test
	public void TC_01_Register_Empty_Data() {
		driver.get("https://demo.nopcommerce.com/");
		homePage = new HomePageObject(driver);
		
		homePage.clickToRegisterLink();
		
		registerPage = new RegisterPageObject(driver);
		
		registerPage.clickToRegisterButton();
		
		Assert.assertTrue(registerPage.isMessageErrorFirstnameDisplayed());
		Assert.assertTrue(registerPage.isMessageErrorLastnameDisplayed());
		Assert.assertTrue(registerPage.isMessageErrorEmailDisplayed());
		Assert.assertTrue(registerPage.isMessageErrorPasswordDisplayed());
		Assert.assertTrue(registerPage.isMessageErrorConfirmPasswordDisplayed());
	
	}
	
	@Test
	public void TC_02_Register_Invalid_Email() {
		registerPage.clickToGenderMaleRadioButton();
		
		registerPage.inputToFirstnameTextbox("Lio");
		
		registerPage.inputToLastnameTextbox("Mio");
		
		registerPage.inputToEmailTextbox("123@123#");
		
		registerPage.inputToPasswordTextbox("123456");
		
		registerPage.inputToCfPasswordTextbox("123456");
		
		registerPage.clickToRegisterButton();
		
		Assert.assertTrue(registerPage.isMessageWrongEmailDisplayed());
	}

	@Test
	public void TC_03_Register_Success() {
		registerPage.refreshPage();
		
		registerPage.clickToGenderMaleRadioButton();
		
		registerPage.inputToFirstnameTextbox("Lio");
		
		registerPage.inputToLastnameTextbox("Mio");
		
		registerPage.inputToEmailTextbox(emailAddress);
		
		registerPage.inputToPasswordTextbox("123456");
		
		registerPage.inputToCfPasswordTextbox("123456");
		
		registerPage.clickToRegisterButton();
		
		Assert.assertTrue(registerPage.isMessageSuccessRegisterDisplayed());
		
		registerPage.clickToContinueButton();
		
		homePage = new HomePageObject(driver);
	}
	
	@Test
	public void TC_04_Register_Existing_Email() {
		homePage.clickToRegisterLink();
		
		registerPage = new RegisterPageObject(driver);
		
		registerPage.inputToFirstnameTextbox("Lio");
		
		registerPage.inputToLastnameTextbox("Mio");
		
		registerPage.inputToEmailTextbox(emailAddress);
		
		registerPage.inputToPasswordTextbox("123456");
		
		registerPage.inputToCfPasswordTextbox("123456");
		
		registerPage.clickToRegisterButton();
		
		Assert.assertTrue(registerPage.isMessageExistEmailDisplayed());
		
	}
	
	@Test
	public void TC_05_Login_Account_With_Invalid_Password() {		
		registerPage.clickToLoginLink();
		
		loginPage = new LoginPageObject(driver);
		
		loginPage.inputToEmailTextbox(emailAddress);
		
		loginPage.inputToPasswordTextbox("123321");
		
		loginPage.clickToLoginButton();
		
		Assert.assertTrue(loginPage.isMessageInvalidPasswordDisplayed());
		
	}
	
	@Test
	public void TC_06_Login_Account_Success() {
		loginPage.refreshPage();
		
		loginPage.inputToEmailTextbox(emailAddress);
		
		loginPage.inputToPasswordTextbox("123456");
		
		loginPage.clickToLoginButton();
	}
	
	
	public String generateEmail() {
		Random rand = new Random();
		return rand.nextInt(9999) + "@qa.team";
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}
	
	HomePageObject homePage;
	LoginPageObject loginPage;
	RegisterPageObject registerPage;
}
