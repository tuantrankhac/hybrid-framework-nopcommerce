package pageObjects.nopcommerce;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.nopcommerce.MyAccountPageUI;
import pageUIs.nopcommerce.OrderPageUI;

public class OrderPageObject extends BasePage{
	private WebDriver driver;
	
	public OrderPageObject(WebDriver driver) {
		this.driver = driver;
	}

}
