package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert_Yatra_PopUp_Handle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.yatra.com/");
		
		Thread.sleep(8000);

		
		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//button[text() = 'Ok,I Agree']")).click();
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text() = 'My Account']"))).perform();
		
		driver.findElement(By.xpath("//a[@id = 'signInBtn']")).click();
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.id("login-input")).sendKeys("9988998899");
		driver.findElement(By.id("login-continue-btn")).click();
		
	}

}
