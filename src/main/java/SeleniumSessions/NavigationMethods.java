package SeleniumSessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws MalformedURLException {
		
		//navigate back(), forward(), refresh()
		
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		driver.navigate().to("https://www.google.com");
		
		driver.navigate().to(new URL("https://www.google.com")); //import URL class format from java.net
										//new URL("url") - passing the string Url with the URL class
		
		
		driver.navigate().to("https://www.amazon.com"); 
		
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh(); //will cause StaleElementRefreshException - we don't use it practically
		System.out.println(driver.getTitle());
		
		driver.quit();	
		
		
		//get() & navigate to() -- same but to() method internally calls get() method --> just the readability 
		//We can launch the URL in 2 methods, get(), navigate to() 
			//to() method internally calls get() method 
			//It is not mandatory to use get() method or navigate to() method individually
		
		//navigate back and forward are not application specific, they are browser methods, they're not related to application
			//so in order to go back OR move forward on the webPage, it is mandatory to use navigate() method
		
		//navigate to() has 2 methods - overloaded
			//- String, Url -- passing the url directly 
			//- URL, Url -- Url in the URL format
		
		
		
	}

}
