package javaBasic;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Topic_07_Switch_Case {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	Scanner scanner = new Scanner(System.in);
	
	@Parameters("browser")
	public void TC_01_Switch_Case(String browserName) {
		driver = getBrowserDriver(browserName);
						
//		if (browserName.equalsIgnoreCase("chrome")) {
//			System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
//			driver = new ChromeDriver();
//		} else if(browserName.equalsIgnoreCase("firefox")) {
//			System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
//			driver = new FirefoxDriver();
//		}else if(browserName.equalsIgnoreCase("edge")){
//			System.setProperty("webdriver.edge.driver", projectPath + "\\browserDrivers\\msedgedriver.exe");
//			driver = new EdgeDriver();
//		}else {
//			throw new RuntimeException("Pleae input correct the browser name!");
//		}
		
		System.out.println(browserName);
		driver.quit();
		}
	
	public void TC_02() {
		int month = scanner.nextInt();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Tháng này có 31 ngày");
			break;
		case 2:
			System.out.println("Tháng này có 28 ngày");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Tháng này có 30 ngày");
			break;			
		default:			
			System.out.println("Tháng đã nhập không hợp lệ!");
			break;
		}
		
	}
	
	@Test
	public void TC_03() {
		String operator = scanner.nextLine();
		int numberA = scanner.nextInt();
		int numberB = scanner.nextInt();
		
		switch (operator) {
		case "+":
			System.out.println("A + B = " + (numberA + numberB));
			break;
		case "-":
			System.out.println("A + B = " + (numberA - numberB));
			break;
		case "*":
			System.out.println("A + B = " + (numberA * numberB));
			break;
		case "/":
			System.out.println("A + B = " + (numberA / numberB));
			break;
		case "%":
			System.out.println("A + B = " + (numberA % numberB));
			break;
		}
	}
	
	public WebDriver getBrowserDriver(String browserName) {
		switch (browserName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver", projectPath + "\\browserDrivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		default:
			new RuntimeException("Pleae input correct the browser name!");
			break;
		}
		return driver;
	}
	
}

