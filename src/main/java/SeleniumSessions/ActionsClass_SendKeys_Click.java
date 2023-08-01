package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass_SendKeys_Click {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By email = By.id("input-email");
		By password = By.id("input-password");
		By login_btn = By.xpath(" //input[@type = 'submit']");
		
//		Actions action = new Actions(driver);
//		action.sendKeys(driver.findElement(email), "sharmila@gmail.com").perform();
//		action.sendKeys(driver.findElement(password), "Sharmila@97").perform();
//		action.click(driver.findElement(By.xpath(" //input[@type = 'submit']"))).perform();
		
		doActionsSendkeys(email, "sharmila@gmail.com");
		doActionsSendkeys(password, "Sharmila");
		doActionsClick(login_btn);
		
		driver.quit();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doActionsSendkeys(By locator, String value) {
		Actions action = new Actions(driver);
		action.sendKeys(getElement(locator), value).perform();
	}
	
	public static void doActionsClick(By locator) {
		Actions action = new Actions(driver);
		action.click(driver.findElement(locator)).perform();
	}

	
	/*
	 * Difference between Actions Sendkeys and normal WebElement.Sendkeys 
	 * 		- Sendkeys - just directly goes to the webelement and enters the value 
	 * 		- Actions Sendkeys - clicks on the input tab first and then starts entering the value same as we enter manually
	 * 				//Equivalent to calling: Actions.click(element).sendKeys(keysToSend). 
	 * 						This method is different from WebElement.sendKeys(CharSequence) - see sendKeys(CharSequence) for details how.
	 */
}
