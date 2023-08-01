package SeleniumSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_DropDown_With_Options {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/try-it-free");
		
		Thread.sleep(1000);
		
		By country = By.id("Form_getForm_Country");
		
//		Select select = new Select(driver.findElement(country));
//		List<WebElement> countryOptionsList = select.getOptions();
//		System.out.println(countryOptionsList.size());
		
//		int count = 0;
//		for(WebElement e: countryOptionsList) {
//			String text = e.getText();
//			System.out.println(count +" : "+text);
//			count++;
//		}
		
		
		if(getDropDownTextList(country).contains("India")) {
			System.out.println("PASS");
		}
		
		
		List<String> expectedCountyrOptionsList = Arrays.asList("India", "Canada", "Germany");
		if(getDropDownTextList(country).containsAll(expectedCountyrOptionsList)) {
			System.out.println("PASS");
		}
		
		
		driver.quit();
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static int getDropDownOptionCount(By locator) {
		Select select = new Select(getElement(locator));
			return select.getOptions().size();
	}
	
	public static List<String> getDropDownTextList(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> countryOptionsList = select.getOptions();
		System.out.println(countryOptionsList.size());
		
		List<String> optionsTextList = new ArrayList<String>();
		
		for(WebElement e: countryOptionsList) {
			String text = e.getText();
			System.out.println(text);
			optionsTextList.add(text);
		}
		
		return optionsTextList;
		
	}
	
	
	
	
	
	
	
	
	
	
}
