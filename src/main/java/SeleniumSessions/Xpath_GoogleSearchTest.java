package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_GoogleSearchTest {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
	
		By loc = By.name("q");
		By suggList = By.xpath("(//ul[@role = 'listbox']//ancestor::div[contains(@class, 'wM6W7d') and @role = 'presentation']//span)");
		
		
		doSearch(suggList, loc, "Qatar", "cancellation policy");
		
		driver.quit();
		
		
	}

	
	public static void doSearch(By searchSuggLocator, By searchLocator, String searchKey, String suggName) {
		
		driver.findElement(searchLocator).sendKeys(searchKey);
		
		List<WebElement> suggList = driver.findElements(searchSuggLocator);
		System.out.println(suggList.size());
		
		
		for(WebElement e: suggList) {
			String text = e.getText();
			System.out.println(text);
			
				if(text.contains(suggName)) {
					e.click();
					break;
				}
		}
				
	}
}
