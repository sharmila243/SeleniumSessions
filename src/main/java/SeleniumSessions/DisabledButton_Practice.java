package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledButton_Practice {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		driver = new ChromeDriver();
		driver.get("https://signup.webex.com/sign-up");
		
//		driver.findElement(By.cssSelector("#continue-btn")).click(); //ElementClickInterceptedException:
		
		String flag = driver.findElement(By.id("continue-btn")).getAttribute("disabled");
		System.out.println(flag);
		//System.out.println(flag);
		
		driver.quit();
	}

}
