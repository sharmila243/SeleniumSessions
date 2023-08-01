package SeleniumSessions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_EW_BrowserWindowHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //w1
		String parentWindowID = driver.getWindowHandle();
		By twitterLink = By.xpath("//a[contains(@href, 'twitter')]"); //w2
	
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
		WebElement twittLink = wait.until(ExpectedConditions.elementToBeClickable(twitterLink));
		twittLink.click();
		
		Boolean flag = wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		System.out.println(flag);
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		while(it.hasNext()) {
			String windowID = it.next();
			
				if(!windowID.equals(parentWindowID)) {
					driver.switchTo().window(windowID);
					System.out.println(driver.getTitle());
					System.out.println(driver.getCurrentUrl());
					
					driver.close();
				}
		}
		
		driver.switchTo().window(parentWindowID);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.quit();
		
	}
	
	public static Boolean waitForNumberOfBrowserWindow(int timeOut, int numberOfWindowsToBe) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.numberOfWindowsToBe(numberOfWindowsToBe));
	}

}
