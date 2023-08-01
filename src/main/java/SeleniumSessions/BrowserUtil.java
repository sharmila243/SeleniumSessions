package SeleniumSessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import CustomException.FrameworkException;



public class BrowserUtil { //I can use this for any application - Re-usability
	
	//If we do not write this as private that means we're giving the runner class to manipulate it
	private WebDriver driver;
	
	//Private variable, Public methods - Encapsulation
	
	
	//I cannot write the same code again and again if I want to open other web applications
	//We've to create a utility kind of concept
		//where I can call that utility/ generic function whenever I want/required so that I can do a reusability here 
		//I need to write the same code again and again, code once written can be used I need 
	
	//BrowserUtil - No main method
		//Can create a utility concept
		//Utility means a function and can be called any time required
	
	public WebDriver launchBrowser(String browserName) {
		System.out.println("Your browser name is: " + browserName);
		
		
		//what if someone is passing null as the browserName - NPE will get as soon as it reaches switch case - null.toLowerCase()
			//to add a null check
		if(browserName == null) {
			System.out.println("Null values are not allowed");
			throw new FrameworkException("BrowserCannotBeNullException");
		}
		
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
			
		case "edge":
			driver = new EdgeDriver();
			break;
			
		case "firefox":
			driver = new FirefoxDriver();
			break;
			
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("Please pass the right browser..");
			throw new FrameworkException("BrowserNotFound");
		}
		
		return driver;
	}
	
	
	public void enterUrl(String url) { //MethodOverloading Example
		if(url.contains("http")) {
			driver.get(url);
		}else {
			throw new FrameworkException("URLShouldHaveHTTP/HTTPS");
		}
	}
	
	//Can I overload the above method? - If someone is sending the URL in the URL class format? --> from NavigationMethod
	public void enterUrl(URL url) {
		if(String.valueOf(url).contains("http")) {
			driver.navigate().to(url);
		}else {
			throw new FrameworkException("URLShouldHaveHTTP/HTTPS");
		}	
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
	
	
	public void closeBrowser() {
		driver.close();
	}

	
	//If we have 100 Utilities, Are we going to write all the 100 Utilities in the same class? 
		//No
	//We can divide our utilities into multiple parts
		//If I want to create more utilities for elements - we can create element Util
		//I want to read the data from excel - I can create Excel Util
		//I want to run my testCases on Javascript - I can create JavaScript Util
	
	//Things like launch, url, title, quit, close - can be created in same class like BrowserUtil
	
	//LaunchBrowser is a method we've created but internally we're used selenium code 
		//driver.get() - we can call it Selenium API
	  
	//LaunchBrowser, enterUrl, getPageTitle, getPageUrl -- Wrapper methods/ generic methods/ Custom wrappers
	
	
}
