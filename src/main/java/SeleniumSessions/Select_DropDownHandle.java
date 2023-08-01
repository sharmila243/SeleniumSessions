package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_DropDownHandle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		//DropDown with select HTML tag; <select>
		//Select class
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/try-it-free");
		
		Thread.sleep(1000);
		
		By country = By.id("Form_getForm_Country");
//		WebElement country_ele = driver.findElement(country);
//		Select select = new Select(country_ele);	
//		select.selectByIndex(10);
//		select.selectByVisibleText("India");
//		select.selectByValue("Germany");
		
		
		//10 dropDowns are present -- 10 Select class objects with 10 different WebElements should be written again and again 
		
		
//		doSelectDropDownByIndex(country, 10);
//		doSelectDropDownByIndex(country, 500); //NOSuchElementException
		
		doSelectDropDownByVisibleText(country, "India");
		
		doSelectDropDownByValue(country, "Germany");
		
		
		Thread.sleep(1000);
		driver.quit();		
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	public static void doSelectDropDownByIndex(By locator, int index) {
		
		if(index < 0) {
			System.out.println("Please pass a positive number");
			return;
		}
		
		Select select = new Select(getElement(locator));		
		select.selectByIndex(index);
	}
	
	
	public static void doSelectDropDownByVisibleText(By locator, String visibleText) {
		
		if(visibleText == null) {
			System.out.println("visibleText cannot be null");
			return;
		}
		
		Select select = new Select(getElement(locator));		
		select.selectByVisibleText(visibleText);
	}
	

	public static void doSelectDropDownByValue(By locator, String value) {
		
		if(value == null) {
			System.out.println("value cannot be null");
			return;
		}
		
		Select select = new Select(getElement(locator));		
		select.deselectByValue(value);
	}

	

}
