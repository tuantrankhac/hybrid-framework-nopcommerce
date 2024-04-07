package com.nopcommerce.login;

import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.nopcommerce.HomePageObject;
import pageObjects.nopcommerce.LoginPageObject;
import pageObjects.nopcommerce.MyAccountPageObject;
import pageObjects.nopcommerce.OrderPageObject;
import pageObjects.nopcommerce.PageGeneratorManager;
import pageObjects.nopcommerce.RegisterPageObject;
import pageObjects.nopcommerce.SearchPageObject;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Level_07_Register_Login_Switch_Page extends BaseTest{
	WebDriver driver;
	
	String emailAddress;
	
	@Parameters ({"browser", "url"})
	@BeforeClass
	public void beforeClass(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);
		emailAddress = "test" + generateEmail();
	}

	@Test
	public void TC_01_Register_Empty_Data() {
		homePage = PageGeneratorManager.getHomePage(driver);
		
		registerPage = homePage.clickToRegisterLink();
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
		
		homePage = registerPage.clickToContinueButton();
	}
	
	@Test
	public void TC_04_Login_Account_Success() {
		loginPage = homePage.clickToLoginLink();
		
		loginPage.inputToEmailTextbox(emailAddress);
		
		loginPage.inputToPasswordTextbox("123456");
		
		loginPage.clickToLoginButton();
		
		homePage = loginPage.goToHomePage();
	}
	
	@Test
	public void TC_05_Switch_Page_At_Footer() {
		//Home Page -> Search Page
		searchPage = homePage.openSearchPage(driver);
		
		//Search Page -> My Account Page
		myAccountPage = searchPage.openMyAccountPage(driver);
		
		//My Account Page -> Order Page
		orderPage = myAccountPage.openOrderPage(driver);
		
		//Order Page -> My Account Page
		myAccountPage = orderPage.openMyAccountPage(driver);
		
		//My Account -> Search Page
		searchPage = myAccountPage.openSearchPage(driver);
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}
	
	HomePageObject homePage;
	LoginPageObject loginPage;
	RegisterPageObject registerPage;
	SearchPageObject searchPage;
	MyAccountPageObject myAccountPage;
	OrderPageObject orderPage;

}
