package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageLoadTimeOutConcept {
	
	static WebDriver driver;

	public static void main(String[] args) { 
		
		driver = new ChromeDriver();
		
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25)); 
			//Instructing selenium to load the page to perform any action on the page
			//In general selenium waits for any webPage to Load	
		
		driver.get("https://www.amazon.com");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

		String value = wait.until(ExpectedConditions.jsReturnsValue("return document.readyState")).toString();
		System.out.println(value);
		
//		String result = wait.until(ExpectedConditions.jsReturnsValue("return document.readyState == 'complete'")).toString();
//		boolean flag = Boolean.parseBoolean(result);
//		System.out.println(flag);
		
		
		/*
		 * Interview question:
		 * 
		 * 3 states
		 * 		1. loading - document is still loading
		 * 		2. interactive - document has finished loading but sub resources like images, links, script, frames, style sheet etc
		 * 		3. complete - page completely loaded
		 */
		
		//We can even put a condition to run my test cases only if the document.readyState returns --> Complete to avoid flaky test cases
		
		boolean flag = isPageLoaded(10);
		if(flag) {
			System.out.println("Page is completely loaded");
		}
		
		driver.quit(); 

	}
	
	public static boolean isPageLoaded(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		String result = wait.until(ExpectedConditions.jsReturnsValue("return document.readyState == 'complete'")).toString();
		
		return Boolean.parseBoolean(result);
	}

}
 