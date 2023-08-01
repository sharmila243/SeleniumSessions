package Practice_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import CustomException.FrameworkException;

public class BrowserUtil {
	
	
	private WebDriver driver;
	
	
	public WebDriver launchBrowser(String browserName) {
		
		System.out.println("Launching the Browser: " + browserName);
		
		if(browserName == null) {
			System.out.println("Null values are not allowed");
			throw new FrameworkException("BrowserCannotBeNullException");
		}
		
		switch (browserName) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;
	
		case "safari":
			driver = new SafariDriver();
			break;
		
		default:
			System.out.println("Please pass the right browser...");
			break;
		}
		
		return driver;
	}
	
	
	public void enterUrl(String url) {
		if(url.contains("https")) {
			System.out.println("Correct Url");
		}else {
			throw new FrameworkException("URLShouldHaveHTTP/HTTPS");
		}
		driver.get(url);
	}
	
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}
	
	
	public void quitBrowser() {
		driver.quit();
	}
	

}
