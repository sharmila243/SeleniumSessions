package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_GetAttributeConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By forgotPassword = By.linkText("Forgotten Password");
		
		//if we want to fetch the attribute - href is an attribute of link tag name <a> - pass the attribute value in dpuble quotes
			//can be used for any other attribute
		String forgotPwd_href = driver.findElement(forgotPassword).getAttribute("href");
		System.out.println(forgotPwd_href);
		
		
		//placeHolder - grey color text in the text field is called PlaceHolder 
		//text with * - label
		By firstName = By.id("input-firstname");
		
		String placeholder_val = driver.findElement(firstName).getAttribute("placeholder");
		System.out.println(placeholder_val);
		
		
		//To determine if class name is unique or not in the DOM - cntrl+F - .img-responsive - if it highlights - Yes, it is unique 
			//- we can also find the no. of same web elements to the right side of the DOM - 1 of 1 
		By logoImg = By.className("img-responsive");
		
//		System.out.println(driver.findElement(logoImg).getAttribute("title"));
//		System.out.println(driver.findElement(logoImg).getAttribute("alt"));
		
		
//		WebElement logo_ele = driver.findElement(logoImg); //I can use this multiple times as below
//		String srcValue = logo_ele.getAttribute("src");
//		String titleValue = logo_ele.getAttribute("title");
//		String altValue = logo_ele.getAttribute("alt");
//		
//		System.out.println(srcValue);
//		System.out.println(titleValue);
//		System.out.println(altValue);
		
		String srcValue =getElementAttribute(logoImg, "src");
		String titleValue = getElementAttribute(logoImg, "title");
		String altValue = getElementAttribute(logoImg, "alt");
		String pHolder_value = getElementAttribute(firstName, "placeholder");
		
		System.out.println(srcValue);
		System.out.println(titleValue);
		System.out.println(altValue);
		System.out.println(pHolder_value);
		
			
		driver.quit();
	}
	
	
	public static String getElementAttribute(By locator, String attributeName) {
		return getElement(locator).getAttribute(attributeName);
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
