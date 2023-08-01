package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaleElementReferenceException {

	static WebDriver driver;

	public static void main(String[] args) {	
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email = By.id("input-email");
		
//		WebElement email_element = driver.findElement(By.id("input-email"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait
			.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class)	
					.ignoring(org.openqa.selenium.StaleElementReferenceException.class)
						.withMessage("TimeOut -- Element not found");
		
//		wait.until(ExpectedConditions.visibilityOf(email_element)).sendKeys("sharmilabhargav@gmail.com");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys("sharmilabhargav@gmail.com");
		
		driver.navigate().refresh(); 
		
		/*
		 * After refreshing including Page Dom also refreshes so webElement ID changes after refreshing the page, 
		 * so if we use webElement for initializing, after refreshing or navigating back and forth webElement ID changes and
		 * if we want to perform action like sendKeys or click() gives StaleElementReferenceException
		 */
				
		
		/*
		 * If we use By locator for initializing, even if we refresh or navigate back and forth on the browser, 
		 * since we're using By locator, driver will find the WebElement using By locator and performs any actions without giving Exception
		 */
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys("sharmila@gmail.com");
		
//		wait.until(ExpectedConditions.visibilityOf(email_element)).sendKeys("sharmila@gmail.com");
		
		
		driver.quit();
		
	}
	
	

}
