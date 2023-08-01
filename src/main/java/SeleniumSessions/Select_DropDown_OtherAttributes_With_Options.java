package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_DropDown_OtherAttributes_With_Options {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/try-it-free");
		
		Thread.sleep(1000);
		
		By country = By.id("Form_getForm_Country");
		
//		WebElement list = driver.findElement(country);
//		Select select = new Select(list);
//		List<WebElement> optionsList = select.getOptions();
//		
//		for(WebElement e: optionsList) {
//			String text = e.getAttribute("value");
//			System.out.println(text);
//		}
		
		getOtherAttributeValues(country, "value");
		
		driver.quit();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void getOtherAttributeValues(By locator, String attrName) {
		
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		
		for(WebElement e: optionsList) {
			String text = e.getAttribute(attrName);
			System.out.println(text);
		}
	}

}
