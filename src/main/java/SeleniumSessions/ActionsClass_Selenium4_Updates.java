package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass_Selenium4_Updates { // Scrolling of a webPage which has header and footer - which is not
												// something like FB, INSTA

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		// As soon as the we launch the page that is called - Landing page
		// and the view is called the current view

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		Actions action = new Actions(driver);
		
		//If we want to interact Electronics which is slightly not visible directly from the landing page and Selenium says 
				//it is not intractable then we can use this page_down and page_up else there is no Use Case
		
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.PAGE_UP).build().perform();
		
		Thread.sleep(2000);
		
		//Scroll completely:
			//scroll down to footer - 'END'
			//manually cmd + down_arrow to directly go to footer in one shot - so [keys.Command + keys.END]
		action.sendKeys(Keys.COMMAND).sendKeys(Keys.END).build().perform();
		Thread.sleep(2000);
		
			//manually to move to header to top of the page - cmd + up_arrow - [keys.Command + keys.HOME]
		action.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1000);
		
		
		//Scroll to specific Element - scrollToElement
		action.sendKeys(Keys.COMMAND).sendKeys(Keys.END).build().perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(1000);
		
		action.scrollToElement(driver.findElement(By.linkText("Help"))).click(driver.findElement(By.linkText("Help"))).perform();
		
		
		//driver.quit();

	}

}
