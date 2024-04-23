package com.hrm.employee;

import org.testng.annotations.Test;


import commons.BaseTest;
import pageObjects.hrm.AddEmployeePO;
import pageObjects.hrm.DashboardPO;
import pageObjects.hrm.EmployeeListPO;
import pageObjects.hrm.LoginPO;
import pageObjects.hrm.PageGenerator;
import pageObjects.hrm.PersonalDetailPO;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class Level_16_Live_Coding extends BaseTest{
	WebDriver driver;
	LoginPO loginPage;
	AddEmployeePO addEmployeePage;
	DashboardPO dashboardPage;
	EmployeeListPO employeeListPage;
	PersonalDetailPO personalDetailPage;
	
	String employeeID, statusValue;
	
	
	@Parameters ({"browser", "url"})
	@BeforeClass
	public void beforeClass(String browserName, String appUrl) {
		log.info("Pre-Condition - Step 01: Open browser " + browserName + " and url " + appUrl);
		driver = getBrowserDriver(browserName, appUrl);
		loginPage = PageGenerator.getLoginPage(driver);
		
		log.info("Pre-Condition - Step 02: Login with Admin role");
		loginPage.enterLoginTextboxByName(driver, "username", "Admin");
		loginPage.enterLoginTextboxByName(driver, "password", "admin123");
		loginPage.clickToLoginButton();
		dashboardPage = PageGenerator.getDashboardPage(driver);
		
		statusValue = "Enabled";
	}
	
	@Test
	public void Employee_01_Add_New_Employee() {
		log.info("Add_New - Step 01: Open 'Employee List' page");
		dashboardPage.openSingleSubMenuPage(driver, "PIM", "Employee List");
		employeeListPage = PageGenerator.getEmployeeListPage(driver);
		
		log.info("Add_New - Step 02: Click to 'Add' button");
		addEmployeePage = employeeListPage.clickToAddButton();
		
		log.info("Add_New - Step 03: Enter valid info to 'First Name' textbox");
		addEmployeePage.enterAddEmployeeTextboxByName(driver, "firstName", "Kio");
		
		log.info("Add_New - Step 04: Enter valid info to 'Last Name' textbox");
		addEmployeePage.enterAddEmployeeTextboxByName(driver, "lastName", "Mio");
		
		log.info("Add_New - Step 05: Click to 'Create Login Details' checkbox");
		addEmployeePage.clickToCreateLoginDetailButton();
		
		log.info("Add_New - Step 06: Enter valid info to 'User Name' textbox");
		addEmployeePage.enterCreateLoginDetailsTextboxByText(driver, "Username", "piomio");
		
		log.info("Add_New - Step 07: Enter valid info to 'Password' textbox");
		addEmployeePage.enterCreateLoginDetailsTextboxByText(driver, "Password", "Lio123456");
		
		log.info("Add_New - Step 08: Enter valid info to 'Confirm Password' textbox");
		addEmployeePage.enterCreateLoginDetailsTextboxByText(driver, "Confirm Password", "Lio123456");
		
		log.info("Add_New - Step 09: Select " + statusValue + " value in 'Status'");
		addEmployeePage.selectRadioButtonByValue(driver, statusValue);
		
		log.info("Add_New - Step 10: Click to 'Save' button");
		personalDetailPage = addEmployeePage.clickToSaveButton();
		personalDetailPage.sleepInSecond(3);
		
		log.info("Add_New - Step 11: Open 'Employee List' page");
		personalDetailPage.openSingleSubMenuPage(driver, "PIM", "Employee List");
		employeeListPage = PageGenerator.getEmployeeListPage(driver);
		
		log.info("Add_New - Step 12: Enter valid info to 'Employee Name' textbox");
		employeeListPage.enterSeachTextboxByFieldName(driver, "Employee Name", "Kio");
		
		log.info("Add_New - Step 13: Click to 'Search' button");
		employeeListPage.clickToSearchButton();
		
//		log.info("Add_New - Step 14: Verify Employee infomation displayed at 'Result Table'");
//		verifyEquals(employeeListPage.getValueInTableIDAtColumnNameAndRowIndex(driver, "resultTable", "Last Name", "1"), "Lio");
	}

	@Test
	public void Employee_02_Upload_Avatar() {
		
	}
	
	@Test
	public void Employee_03_Personal_Details() {

	}
	
	@Test
	public void Employee_04_Contact_Details() {

	}
	
	@Test
	public void Employee_05_Emergency_Details() {

	}
	
	@Test
	public void Employee_06_Assigned_Dependents() {

	}
	
	@Test
	public void Employee_07_Edit_View_Job() {

	}
	
	@Test
	public void Employee_08_Edit_View_Salary() {

	}
	
	@Test
	public void Employee_09_Edit_View_Tax() {

	}
	
	@Test
	public void Employee_10_Qualifications() {
		
	}
	
	@Test
	public void Employee_11_Search_Employee() {

	}
	
	
	
	@AfterClass(alwaysRun = true)
	public void afterClass() {
		cleanBrowserAndDriver();
	}
}
