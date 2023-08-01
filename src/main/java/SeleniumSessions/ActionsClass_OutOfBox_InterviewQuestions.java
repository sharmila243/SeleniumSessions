package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass_OutOfBox_InterviewQuestions { //jump from one tab to another without using locators (use only 1 locator)
														// 1 locator and use tab from keyboard to jump between tabs
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By fn = By.id("input-firstname");
		
		Actions action = new Actions(driver);
		
		action.sendKeys(driver.findElement(fn), "ABCD")
			.sendKeys(Keys.TAB)
				.sendKeys("EFGH")
				.sendKeys(Keys.TAB)
					.sendKeys("test@abc.com")
					.sendKeys(Keys.TAB)
						.sendKeys("9899899899")
						.sendKeys(Keys.TAB)
							.sendKeys("Test@123")
							.sendKeys(Keys.TAB)
								.sendKeys("Text@123")
								.sendKeys(Keys.TAB)
								.sendKeys(Keys.TAB)
								.sendKeys(Keys.TAB)
								.sendKeys(Keys.SPACE) //to click privacy policy check box we're using SPACE if click() is not working
								.sendKeys(Keys.TAB).click().build().perform();
		
		driver.quit();

	}

}
