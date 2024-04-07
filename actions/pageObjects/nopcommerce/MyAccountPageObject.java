package pageObjects.nopcommerce;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.nopcommerce.MyAccountPageUI;
import pageUIs.nopcommerce.SearchPageUI;

public class MyAccountPageObject extends BasePage{
	private WebDriver driver;
	
	public MyAccountPageObject(WebDriver driver) {
		this.driver = driver;
	}


}
