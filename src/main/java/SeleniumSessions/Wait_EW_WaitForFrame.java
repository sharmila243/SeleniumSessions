package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_EW_WaitForFrame {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");

		By username = By.name("username");
		By pwd = By.name("password");
		By login_btn = By.xpath("//input[@value = 'Login']");
		
		By frameLocator = By.name("mainpanel");
		
		driver.findElement(username).sendKeys("newautomation");
		driver.findElement(pwd).sendKeys("Selenium@12345");
		driver.findElement(login_btn).click();
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		
//		WebElement un = wait.until(ExpectedConditions.visibilityOfElementLocated(username));
//		un.sendKeys("newautomation");
//		
//		driver.findElement(pwd).sendKeys("Selenium@12345");
//		
//		WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(login_btn));
//		btn.click();
//		
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));

		
		waitForFrameByLocator(10, frameLocator);
		driver.findElement(By.linkText("CONTACTS")).click();
		
		driver.quit();
		
	}
	
	public static WebElement waitForElementToBeClickable(int timeOut, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	
	
	public static void waitForFrameByLocator(int timeOut, By frameLocator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	}
	
	public static void waitForFrameByIndex(int timeOut, int frameIndex) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	}
	
	public static void waitForFrameByFrameNameOrId(int timeOut, String nameOrId) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(nameOrId));
	}
	
	public static void waitForFrameByFrameElement(int timeOut, WebElement frameElement) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
	}

}
