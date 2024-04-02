package com.facebook.register;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.GlobalConstants;
import pageObjects.facebook.PageGeneratorManager;
import pageObjects.facebook.RegisterPageObject;

public class Level_11_Register_Login_Element_Undisplayed extends BaseTest {
	WebDriver driver;
	String emailAddress, password;
	RegisterPageObject registerPage;

	//@Parameters ({"browser", "url"})
	@BeforeClass
	public void beforeClass() { //String browserName, String appUrl
		//driver = getBrowserDriver(browserName, appUrl);
		
		System.setProperty("webdriver.chrome.driver", GlobalConstants.PROJECT_PATH + "\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		registerPage = PageGeneratorManager.getRegisterPage(driver);
	}
	
	@Test
	public void Register_01_Element_Displayed() {
		registerPage.openUrl();
		registerPage.clickToRegisterButton();
		Assert.assertTrue(registerPage.isEmailTextboxDisplayed());
		
	}
	
	@Test
	public void Register_02_Element_Undisplayed_In_DOM() {
		registerPage.openUrl();
		registerPage.clickToRegisterButton();
		Assert.assertFalse(registerPage.isConfirmEmailTextboxDisplayed());
	}
	
	@Test
	public void Register_03_Element_Undisplayed_Not_In_DOM() {
		registerPage.openUrl();
		Assert.assertFalse(registerPage.isConfirmEmailTextboxDisplayed());
	}
	
	@Test
	public void Register_04_Element_Undisplayed_Not_In_DOM() {
		registerPage.openUrl();
		Assert.assertTrue(registerPage.isConfirmEmailTextboxUndisplayed());
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}


