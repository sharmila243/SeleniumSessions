package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_WebDriverWait_With_FluentWait_Features {
	
	static WebDriver driver;

	public static void main(String[] args) {

		/*
		 * WebDriverWait(Class) --child of--> FluentWait(Class) --child of--> Wait(Interface) --which has only method called __> until() without method body
		 * 
		 * WebDriverWait --> FluentWait --> Wait
		 * 					- until() - overridden method
		 * 					- own Methods
		 * 
		 * FluentWait is also a type of Explicitly Wait with Fluent features
		 */
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email = By.id("input-email");
		
		//implementation of WebDriverWait with Fluent Features
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait
//			.pollingEvery(Duration.ofSeconds(2))
//				.ignoring(NoSuchElementException.class)
//					.withMessage("TimeOut -- Element not found" + email)
//						.until(ExpectedConditions.visibilityOfElementLocated(email))
//							.sendKeys("sharmila@gmail.com");
		
		waitForElementAndEnterValue(email, 10, 2, "sharmila@gmail.com");
		
		driver.quit();
		
	}
	
	public static void waitForElementAndEnterValue(By locator, int timeOut, int pollingTime, String value) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait
			.pollingEvery(Duration.ofSeconds(pollingTime))
				.ignoring(NoSuchElementException.class)
					.withMessage("TimeOut -- Element not found" + locator)
						.until(ExpectedConditions.visibilityOfElementLocated(locator))
							.sendKeys(value);
	
	}
	
	public static void waitForElementAndClick(By locator, int timeOut, int pollingTime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait
			.pollingEvery(Duration.ofSeconds(pollingTime))
				.ignoring(NoSuchElementException.class)
					.withMessage("TimeOut -- Element not found" + locator)
						.until(ExpectedConditions.visibilityOfElementLocated(locator))
							.click();
	
	}
	
	/*
	 * WebDriver Wait and FluentWait both are same except the implementation way 
	 * Both are explicitly wait 
	 * 	- explicitly applied for a specific element
	 */

}
