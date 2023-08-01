package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException_FindElements {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {	
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		List<WebElement> elements = driver.findElements(By.cssSelector("footer a"));
		System.out.println(elements.size());
		
		for(int i = 0; i< elements.size(); i++) {
			elements.get(i).click();
			System.out.println(i +" : "+ driver.getTitle());
			
			driver.navigate().back();
			
			elements = driver.findElements(By.cssSelector("footer a"));
		}
		driver.quit();
	}

}
