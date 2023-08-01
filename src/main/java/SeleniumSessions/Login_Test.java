package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Test {

	public static void main(String[] args) {
		
		//to launch the browser -> BrowserUtil is responsible for that
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");
		brUtil.enterUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(brUtil.getPageTitle());
		
		
		
		By email_id = By.id("input-email"); 
		By password = By.id("input-password");
		
		
		
		ElementUtil eleUtil = new ElementUtil(driver); //how do we get the driver here? 
			//go to BrowserUtil --> launchBrowser method (give the browser name, we'll supply the driver) --> add "return driver" there
			//driver.launchBrowser will now return a WebDriver, so store it in a WebDriver and pass the same to the ElementUtil parameter
				//It now calls the constructor of Element Util and initializes the global variable WebDriver
		eleUtil.doSendkeys(email_id, "sharmila24397@gmail.com");
		eleUtil.doSendkeys(password, "Sharmila97");
		
		
		brUtil.quitBrowser();
		
	} 

}
