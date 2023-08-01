package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_PollingWait_Concept {
	
	static WebDriver driver;

	public static void main(String[] args) {

		/*
		 * Polling Wait 
		 * 		- sleep: The duration in milliseconds to sleep between polls
		 * 		- For Explicit wait we can apply polling mechanism
		 * 		- Polling wait is also called as Interval Wait
		 * 		- Polling wait is the wait applied on the driver to check for the webElements in Specified intervals 
		 * 		- Default Polling wait is 500ms (milliSeconds)
		 * 		- That means selenium server will go and keep on trying for that webElement visibility for every 500ms (interval) entirely for the timeOut applied
		 * 		- Selenium will keep sending the requests to the browser till the timeOut duration in intervals, difference between 2 requests is called the pollingTime/IntervalTime
		 * 		- Let's say, timeOut - 10sec
		 * 		- first it will go and check at 0.5th sec, then after 0.5sec, then again after 0.5sec so on till 10sec --> it will make 20 attempts
		 * 		- then if the webElement is not visible then throw the exception
		 * 		- We can even change the polling time 
		 * 		- timeOut - 10sec, pollingTime - 2000ms 
		 * 		- 0sec --> 2sec --> 4sec --> 6sec --> 8sec --> 10sec = it is now making 5 attempts with an interval of 2sec
		 */		
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email = By.id("input-email");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(2));
				//pass the driver, timeOut, pollingTime
		WebElement email_ele = wait.until(ExpectedConditions.presenceOfElementLocated(email));
		email_ele.sendKeys("sharmilabhargav@gmail.com");
		
		driver.quit();
	}

}
