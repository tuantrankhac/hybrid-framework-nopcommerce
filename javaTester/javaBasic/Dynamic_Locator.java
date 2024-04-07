package javaBasic;

import org.openqa.selenium.remote.server.handler.ClickElement;

public class Dynamic_Locator {

	public static void main(String[] args) {
//		String MY_ACCOUNT_LINK =  "//div[@class='footer']//a[text()='My account']";
//		String ORDER_LINK =  "//div[@class='footer']//a[text()='Orders']";
//		String SEARCH_LINK =  "//div[@class='footer']//a[text()='Search']";
		
		String DYNAMIC_PAGE_FOOTER = "//div[@class='footer']//a[text()='%s']";
		String DYNAMIC_SIDEBAR_TEXT = "//sidebar[@id='%s']//div[text()='%s']";
		
//		clickToElement(MY_ACCOUNT_LINK);
		
		clickToElement(DYNAMIC_PAGE_FOOTER, "Search");
		
		clickToElement(DYNAMIC_SIDEBAR_TEXT, "Account", "Deposit");
	}
//	//Fix cứng locator
//	public static void clickToElement(String locator) {
//		System.out.println(locator);
//	}
//	
//	// 1 tham số dynamic
//	public static void clickToElement(String locator, String pageName) {
//		System.out.println(String.format(locator, pageName));
//	}
//	
//	//2 tham số dynamic
//	public static void clickToElement(String locator, String sidebarName, String text) {
//		System.out.println(String.format(locator, sidebarName, text));
//	}
	
	public static void clickToElement(String locator, String... params) {
		System.out.println(String.format(locator, (Object[]) params));
	}
	
}
