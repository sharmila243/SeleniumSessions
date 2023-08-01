package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass_OutOfBox_InterviewQuestions_1 {

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement fn = driver.findElement(By.id("input-firstname"));
		
		Actions action = new Actions(driver);
		
		String value = "SharmilaBashakarla";
		char ch[] = value.toCharArray();
		
		for(int i = 0; i< ch.length; i++) {
			action.sendKeys(fn, String.valueOf(ch[i]) + "_").pause(500).perform();
		}
		
		driver.quit();
		
	}
	

}
