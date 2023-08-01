package SeleniumSessions;

//import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_DropDown_Without_SelectClass {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/try-it-free");
		
		Thread.sleep(1000);
		
		By country = By.xpath("(//select[@id = 'Form_getForm_Country'] / option)");
		
//		List<WebElement> optionsList = driver.findElements(country);
//		List<String> list = new ArrayList<String>();
//		
//		for(WebElement e: optionsList) {
//			String text = e.getText();
//			System.out.println(text);
//			list.add(text);
//				if(text.equals("India")) {
//					e.click();
//					break;
//				}
//		}
		
		doSelectDropDownUsingLocator(country,"Canada");
		
		driver.quit();
		
	}
	
	public static void doSelectDropDownUsingLocator(By locator, String dropDownValue) {
		List<WebElement> optionsList = driver.findElements(locator);
	
		for(WebElement e: optionsList) {
			String text = e.getText();
			System.out.println(text);
		
				if(text.equals(dropDownValue)) {
					e.click();
					break;
				}
		}
		
	}
	
	
	
	

}
