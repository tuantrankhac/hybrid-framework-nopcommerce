package pageUIs.hrm;

public class BasePageUI {
	public static final String DYNAMIC_MENU_PAGE = "//nav[@aria-label='Sidepanel']//span[text()='%s']";
	public static final String DYNAMIC_SINGLE_SUBMENU_PAGE = "//nav[@aria-label='Topbar Menu']//a[text()='%s']";
	public static final String DYNAMIC_MULTI_SUBMENU_PAGE = "//nav[@aria-label='Topbar Menu']//span[text()='%s']";
	public static final String DYNAMIC_CHILDSUBMENU_PAGE = "//nav[@aria-label='Topbar Menu']//a[text()='%s'";
	
	public static final String DYNAMIC_ADD_EMPLOYEE_TEXTBOX_BY_NAME = "//input[@name='%s']";
	public static final String DYNAMIC_LOGIN_TEXTBOX_BY_NAME = "//input[@name='%s']";
	public static final String DYNAMIC_CREATE_LOGIN_DETAIL_TEXTBOX_BY_TEXT = "//label[text()='%s']/parent::div/following-sibling::div/input";
	
	public static final String DYNAMIC_RADIO_BUTTON_BY_VALUE = "//label[text()='%s']";
	public static final String DYNAMIC_SEARCH_TEXTBOX_BY_NAME = "//label[text()='%s']/parent::div/following-sibling::div//input";
	
	public static final String TABLE_HEADER_BY_ID_AND_NAME = "//table[@id='%s']//th[string()='%s']/preceding-sibling::th";
	public static final String TABLE_ROW_BY_COLUMN_INDEX_AND_ROW_INDEX = "//table[@id='%s']/tbody/tr[%s]/td[%s]";
	
	
	
}
