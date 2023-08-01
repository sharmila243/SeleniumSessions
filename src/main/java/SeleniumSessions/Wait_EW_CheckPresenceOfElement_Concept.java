package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_EW_CheckPresenceOfElement_Concept {

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		By userName = By.name("username");
		By pwd = By.name("password");
		By lgn_btn = By.xpath("//button[@type = 'submit']");
		By forgotPwd = By.xpath("//p[text() = 'Forgot your password? ']");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement uName = wait.until(ExpectedConditions.presenceOfElementLocated(userName));
//		uName.sendKeys("Admin");
		
		waitForElementPresence(userName, 10).sendKeys("Sdmin");
		
		driver.findElement(pwd).sendKeys("admin123");
		driver.findElement(lgn_btn).click();
		
		waitForElementPresence(forgotPwd, 5).click();
		
		driver.quit();

	}
	
	public static WebElement waitForElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}
	
	public static WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	

}
