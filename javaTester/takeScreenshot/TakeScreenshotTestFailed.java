package takeScreenshot;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import commons.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(TestListener.class)
public class TakeScreenshotTestFailed {
	WebDriver driver;
	BasePage basePage;
	
	String emailAddress;
	
	@BeforeClass
	public void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		basePage = new BasePage();
		emailAddress = "test" + generateEmail();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.nopcommerce.com/");
	}

	@Test
	public void TC_01_Register_Success() {
		basePage.waitForElementClickable(driver, "//a[@class='ico-register']");
		basePage.clickToElement(driver, "//a[@class='ico-register']");
		
		basePage.sendkeyToElement(driver, "//input[@id='FirstName']", "Lio");
		basePage.sendkeyToElement(driver, "//input[@id='LastName']", "Mio");
		basePage.sendkeyToElement(driver, "//input[@id='Email']", emailAddress);
		basePage.sendkeyToElement(driver, "//input[@id='Password']", "123456");
		basePage.sendkeyToElement(driver, "//input[@id='ConfirmPassword']", "123456");
		
		basePage.waitForElementClickable(driver, "//button[@id='register-button']");
		basePage.clickToElement(driver, "//button[@id='register-button']");
		
		Assert.assertEquals(basePage.getElementText(driver, "//div[@class='result']"), "Your registration completed.");
		
		basePage.waitForElementClickable(driver, "//a[@class='ico-login']");
		basePage.clickToElement(driver, "//a[@class='ico-login']");
		
		basePage.sendkeyToElement(driver, "//input[@id='Email']", emailAddress);
		basePage.sendkeyToElement(driver, "//input[@id='Password']", "123456");

		basePage.waitForElementClickable(driver, "//button[@class='button-1 login-button']");
		basePage.clickToElement(driver, "//button[@class='button-1 login-button']");
		
		basePage.waitForElementClickable(driver, "//a[@class='ico-logout']");
		basePage.clickToElement(driver, "//a[@class='ico-logout']");
		
	}
	
	
	public String generateEmail() {
		Random rand = new Random();
		return rand.nextInt(9999) + "@qa.team";
	}
	
	public WebDriver getWebDriver() {
		return this.driver;
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}
	
}
