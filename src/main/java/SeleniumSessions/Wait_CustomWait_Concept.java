package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait_CustomWait_Concept { //Without using Selenium Waits

	static WebDriver driver;

	public static void main(String[] args) {	
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email = By.id("input-email11");	
		
		retryingElementWithCustomWait(email, 10, 2000).sendKeys("sharmilabhargav@gmail.com");
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static WebElement retryingElementWithCustomWait(By locator, int timeOut) {
		
		WebElement element = null;
		int attempts = 0;
		
			while(attempts < timeOut) {
				try {
					element = getElement(locator);
					System.out.println(locator + "Element found in: " + attempts + "secs");
					break;
				}
				catch(Exception e) {
					System.out.println(locator + "Element not found in: " + attempts + "secs");
					try {
						Thread.sleep(500); //Thread.sleep( milli seconds ) --> default - Thread.sleep(500);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
				}
				attempts++;
			}
			if(element == null) {
				System.out.println("Tried to find element in " +timeOut+ "secs with 500 milli secs interval");
			}
			return element;
	}
	
	
	public static WebElement retryingElementWithCustomWait(By locator, int timeOut, long pollingTime) {
		
		WebElement element = null;
		int attempts = 0;
		
			while(attempts < timeOut) {
				try {
					element = getElement(locator);
					System.out.println(locator + "Element found in: " + attempts + "secs");
					break;
				}
				catch(Exception e) {
					System.out.println(locator + "Element not found in: " + attempts + "secs");
					try {
						Thread.sleep(pollingTime); 
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
				}
				attempts++;
			}
			if(element == null) {
				System.out.println("Tried to find element in " +timeOut+ "secs with " +pollingTime+ " milli secs interval");
			}
			return element;
	}

}
