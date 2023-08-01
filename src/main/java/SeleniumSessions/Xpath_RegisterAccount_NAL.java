package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_RegisterAccount_NAL {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By links = By.xpath("(//aside[@id = 'column-right' and @class = 'col-sm-3 hidden-xs']//a)");
		
		totalLinks(links, "href", "Transactions");
		
		driver.quit();	
		
	}
	
	public static void totalLinks(By locator, String attrName, String linkName) {

		List<WebElement> links = driver.findElements(locator);
	
		System.out.println("Total no. of links: " + links.size());
	
		for(WebElement e: links) {
			String text = e.getText();
			String attr_val = e.getAttribute(attrName);
			System.out.println(attr_val +" : "+ text);
			
				if(text.equals(linkName)) {
					e.click();
					break;
				}
		}
	}	
}
