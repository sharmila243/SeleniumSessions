package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_DropDown_Without_SelectMethods { //Interview

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/try-it-free");
		
		Thread.sleep(1000);
		
		By country = By.id("Form_getForm_Country");
			
		//do not use 3 methods ByIndex, VisibleText, Value

//		Select select = new Select(driver.findElement(country));
//		List<WebElement> optionsList = select.getOptions();
//		
//		for(WebElement e: optionsList) {
//			String text = e.getText();
//			System.out.println(text);
//				if(text.equals("India")) {
//					e.click();
//					break;
//					}
//		}
		
		doSelectDropDownValue(country, "Canada");
		
		Thread.sleep(1000);
		
		doSelectDropDownValue(country, "India");
		
		
		driver.quit();
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectDropDownValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();

		for(WebElement e: optionsList) {
			String text = e.getText();
			System.out.println(text);
				if(text.equals(value)) {
					e.click();
					break;
					}
		}
	

	}
}
