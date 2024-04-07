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

public class Level_08_Register_Login_Page_Dynamic extends BaseTest{
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
	public void TC_05_Open_Page_At_Footer() {
		//Home Page -> Search Page
		searchPage = (SearchPageObject) homePage.getFooterPageByName(driver, "Search");
		
		//Search Page -> My Account Page
		myAccountPage = (MyAccountPageObject) searchPage.getFooterPageByName(driver, "My account");
		
		//My Account Page -> Order Page
		orderPage = (OrderPageObject) myAccountPage.getFooterPageByName(driver, "Orders");
		
		//Order Page -> My Account Page
		myAccountPage = (MyAccountPageObject) orderPage.getFooterPageByName(driver, "My account");
		
		//My Account -> Search Page
		searchPage = (SearchPageObject) myAccountPage.getFooterPageByName(driver, "Search");
		
		//Search -> Order
		orderPage = (OrderPageObject) searchPage.getFooterPageByName(driver, "Orders");
	}
	
	@Test
	public void TC_06_Open_Page_At_Footer() {	
		//Order Page -> My Account Page
		orderPage.openFooterPageByName(driver, "My account");
		myAccountPage = PageGeneratorManager.getMyAccountPage(driver);
		
		//My Account -> Search Page
		myAccountPage.openFooterPageByName(driver, "Search");
		searchPage = PageGeneratorManager.getSearchPage(driver);
		
		//Search -> Order
		searchPage.openFooterPageByName(driver, "Orders");
		orderPage = PageGeneratorManager.getOrderPage(driver);
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
