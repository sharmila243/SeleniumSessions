package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle_5 { //Set --> List

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //w1
		
		Thread.sleep(3000);
		By twitterLink = By.xpath("//a[contains(@href, 'twitter')]"); //w2
		driver.findElement(twitterLink).click();
		
		Set<String> handles = driver.getWindowHandles();
		List<String> handlesList = new ArrayList<String>(handles); //Set<String> --> List<String> (order based collection)
			//No need of iterator now
		
		String parentWindowId = handlesList.get(0); //since handlesList() is now order based --> .get(0) will be parent window now
		String childWindowId = handlesList.get(1);
		
		driver.switchTo().window(childWindowId);
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
	}

}
