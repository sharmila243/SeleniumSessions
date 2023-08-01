package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_GoogleLangLinks {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		
//		List<WebElement> links = driver.findElements(By.xpath("(//div[@id = 'SIvCob']/a)"));
//		System.out.println("Total Language Links: " +links.size());
//		
//		for(WebElement e: links) {
//			String text = e.getText();
//			String href_attr = e.getAttribute("href");
//			System.out.println(href_attr +" : "+ text);
//				if(text.equals("తెలుగు")) {
//					e.click();
//					break;
//				}	
//		}
		
		By links = By.xpath("(//div[@id = 'SIvCob']/a)");
		clickOnElement(links, "ಕನ್ನಡ", "href");	
		
		driver.quit();
	}
	
	public static void clickOnElement(By locator, String linkText, String attrName) {
		List<WebElement> links = driver.findElements(locator);
		System.out.println("Total no. of Links: " +links.size());
		
		for(WebElement e: links) {
			String text = e.getText();
			String href_attr = e.getAttribute(attrName);
			System.out.println(href_attr +" : "+ text);
				if(text.equals(linkText)) {
					e.click();
					break;
				}	
		}
	}

}
