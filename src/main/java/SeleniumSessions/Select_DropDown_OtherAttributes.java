package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_DropDown_OtherAttributes {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/try-it-free");
		
		Thread.sleep(1000);
		
		By country = By.xpath("(//select[@id = 'Form_getForm_Country'] / option)");
		
//		List<WebElement> optionsList = driver.findElements(country);
//		
//		for(WebElement e: optionsList) {
//			String text = e.getAttribute("value");
//			System.out.println(text);
//		}
		
		getOtherAttributeValues(country, "value");
		
		driver.quit();
		
	}		
		
		
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
		
	public static void getOtherAttributeValues(By locator, String attrName) {
		List<WebElement> optionsList = getElements(locator);
		
		for(WebElement e: optionsList) {
			String text = e.getAttribute(attrName);
			System.out.println(text);
		
	}
		
	}	
	
}
