package commons;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest{
	private WebDriver driver;
	
	private enum BROWSER {
		CHROME, FIREFOX, IE, SAFARI, EDGE_LEGACY, EDGE_CHROMIUM, H_CHROME, H_FIREFOX;
	}
	
	private enum OS{
		WINDOWS, MAC_OSX, LINUX;
	}
	
	private enum PLATFORM{
		ANDROID, IOS, WINDOW_PHONE;
	}
	
	protected WebDriver getBrowserDriver(String browserName) {
		BROWSER browser = BROWSER.valueOf(browserName.toUpperCase());
		if(browser==BROWSER.CHROME) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browser==BROWSER.FIREFOX) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(browser==BROWSER.EDGE_CHROMIUM){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else {
			throw new RuntimeException("Please enter correct browser name!");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	protected WebDriver getBrowserDriver(String browserName, String appUrl) {
		BROWSER browser = BROWSER.valueOf(browserName.toUpperCase());
		if(browser==BROWSER.CHROME) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browser==BROWSER.FIREFOX) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(browser==BROWSER.EDGE_CHROMIUM){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else {
			throw new RuntimeException("Please enter correct browser name!");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(appUrl);
		return driver;
	}
	
	protected String generateEmail() {
		Random rand = new Random();
		return rand.nextInt(9999) + "@qa.team";
	}
}