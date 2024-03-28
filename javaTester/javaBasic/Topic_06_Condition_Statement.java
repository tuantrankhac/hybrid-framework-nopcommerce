package javaBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Topic_06_Condition_Statement {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	
	public void TC_01_If() {
		WebDriver driver = new ChromeDriver();
		boolean status = 5 > 3;
		
		//Hàm if sẽ nhận vào điều kiện đúng -> Đúng sẽ đi vào phần thân của if, sai thì bỏ qua
		//Kiểm tra duy nhất 1 điều kiện
		if (status) {
			System.out.println("Go to if");
		}
		
		// = Gán (assign)
		int studentNumber = 10;
		
		// == So sánh
		status = (studentNumber == 10);
		System.out.println(status);
		
		// ! Phủ định (thường dùng để verify Check to checkbox
		WebElement languagesCheckbox = driver.findElement(By.id(""));
		if(!languagesCheckbox.isSelected()) {
			languagesCheckbox.click();
		}
		//Uncheck to checkbox
		if(languagesCheckbox.isSelected()) {
			languagesCheckbox.click();
		}
	}
	public void TC_02_If_Else() {
		// Có tới 2 điều kiện: nếu đúng thì vào if - nếu sai thì vào else
		//Nếu driver start với browser như Chrome/Firefox/Edge/Safari thì
		// dùng hàm click thông thường (builtin) của Selenium WebElement
		
		//Nếu driver là IE thì dùng hàm click của JavascriptExecutor
		System.setProperty("webdriver.ie.driver", projectPath + "\\browserDrivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
//		System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
//		driver = new ChromeDriver();
		
		System.out.println(driver.toString());
		
		if(driver.toString().contains("internet explorer")) {
			System.out.println("Click by Javascript Executor");
		}else {
			System.out.println("Click by Selenium WebElement");
		}
	}
	
	@Parameters("browser")
	public void TC_03_If_Else_If_Else(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("edge")){
			System.setProperty("webdriver.edge.driver", projectPath + "\\browserDrivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}else {
			throw new RuntimeException("Pleae input correct the browser name!");
		}
		System.out.println(browserName);
		System.out.println(driver.toString());
		driver.quit();
	}
	
	@Test
	public void TC_04_If_Else_If_Else() {
		String pageName = "Login";
		
		if(pageName.equals("Login")) {
			//LoginPage loginPage = new LoginPage();
			//return loginPage;
		}else if (pageName.equals("Register")) {
			//RegisterPage registerPage = new RegisterPage();
			//return registerPage;
		}else if (pageName.equals("New Customer")) {
			//CustomerPage customerPage = new CustomerPage();
			//return customerPage;
		}else {
			//HomePage homePage = new HomePage();
			//return homePage;
		}
		
		//if-else
		int age = 20;
		String access = (age < 18) ? "You cannot access" : "Welcome to our system!";
		
		if(age < 18) {
			access = "You cannot access";
		}else {
			access = "Welcome to our system!";
		}
		
		System.out.println(access);
			
			
			
			
	}
}