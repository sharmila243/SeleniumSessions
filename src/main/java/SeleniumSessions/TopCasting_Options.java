package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCasting_Options {

	public static void main(String[] args) {
		
		//In the previous code, if we have multiple objects created referring to chrome, safari, edge, firefox
			//If I want to run the code in chrome I need to uncomment chrome 
			//If I want to run the code in safari I need to comment chrome and uncomment safari
		//Here comes the Top Casting 
		
		
		//0. Specific to one single browser 
				//Valid and used when execution is limited to one specific browser	
//		ChromeDriver driver = new ChromeDriver();
//		FirefoxDriver driver = new FirefoxDriver();
//		EdgeDriver driver = new Edgedriver();
//		SafariDriver driver = new SafariDriver();
		
		
		
		//1. Child class object can be referred by GP reference variable
				// Valid Top Casting but not recommended 
				// Because I can access only findElement and findElements
//		SearchContext driver = new ChromeDriver();
		
		
		//2. TopCasting with webDriver
				//Can I create the object of webDriver - NO, because it's an interface
				//Valid and recommended
				//Can access all the methods
				//All the methods inside RWD can be accessed by Child class object and also it has the method body since RWD is a class 
				//All the methods inside RWB are overridden methods from WebDriver
		WebDriver driver = new ChromeDriver(); //can be used for any browser	
		driver.get(null);
		
		
		//3. TopCasting with RWD
				//valid and recommended
				//Can access all the methods
				//One Limitation - later ****
		RemoteWebDriver driver1 = new ChromeDriver();
		driver1.findElement(null);
		
		
		//4. TopCasting with chromium
				//Valid for only chrome and edge
				//firefox and safari don't have this chromium in between they directly extends RWD
//		ChromiumDriver driver = new ChromeDriver();
//		driver = new EdgeDriver();
//		driver = new FirefoxDriver(); //Error - Type mismatch
		
		
		//5. Child class RWD object referred by parent class WebDriver interface
				//used for Remote execution OR Selenium Grid OR cloud OR AWS OR Browser Stack OR LT
//		WebDriver driver = new RemoteWebDriver(remoteAddress, Capabilities); 
				//grid/hub address along with Capabilities
		
		
		//6. RWD --> SearchContext
				//Valid not recommended
//		SearchContext sc = new RemoteWebDriver(remoteAddress, Capabilities);		
		
	}

}
