package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Wait_FluentWait_Concept {
	
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
		
		//TopCasting --> Wait Interface and FluentWait
		
		//Give the Type <T> on both sides
			//Generic - param <T> The input type for each condition used with this instance
			//Apply wait with driver
		
		//argument input --> (driver) --> input value to pass the evaluated conditions
		//RHS - object of FluentWait, Generic - WebDriver, argument is the driver
				
		
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//								.withTimeout(Duration.ofSeconds(10))
//									.pollingEvery(Duration.ofSeconds(2))
//										.ignoring(NoSuchElementException.class) //Any kind of exception in between up to 10sec, do not throw it --> throw it after 10sec
//											.withMessage("TimeOut -- Element not found" + email);
//		
//		wait.until(ExpectedConditions.presenceOfElementLocated(email)).sendKeys("sharmilabhargav@gmail.com");
		
		waitForPresenceOfElementWithFluentWait(email, 10, 2).sendKeys("sharmilabhargav@gmail.com");
		waitForVisibilityOfElementWithFluentWait(email, 10, 2).sendKeys("sharmilabhargav@gmail.com");
			
		driver.quit();
		
	}
	
	public static WebElement waitForPresenceOfElementWithFluentWait(By locator, int timeOut, int pollingTime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
								.withTimeout(Duration.ofSeconds(timeOut))
									.pollingEvery(Duration.ofSeconds(pollingTime))	
										.ignoring(NoSuchElementException.class)
											.withMessage("TimeOut -- Element not found" + locator);
		
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
											
	}

	public static WebElement waitForVisibilityOfElementWithFluentWait(By locator, int timeOut, int pollingTime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
								.withTimeout(Duration.ofSeconds(timeOut))
									.pollingEvery(Duration.ofSeconds(pollingTime))	
										.ignoring(NoSuchElementException.class)
											.withMessage("TimeOut -- Element not found" + locator);
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
											
	}


}
