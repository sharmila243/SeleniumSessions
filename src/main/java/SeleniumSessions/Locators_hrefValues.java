package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_hrefValues {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		By href = By.tagName("a");
		
		List<WebElement> hrefList = driver.findElements(href); 
		//if we pass the wrong By locator, we'll not get NoSuchElementElement instead we get an empty list in console with size 0
		
		System.out.println("Total webelements with href attribute: " + hrefList.size());
		
		int count = 0;
		for(WebElement e: hrefList) {
			String href_val = e.getAttribute("href");
			System.out.println(count +" : "+ href_val);
			count++;
		}
		
		
		driver.quit();
		
		
	}

}
