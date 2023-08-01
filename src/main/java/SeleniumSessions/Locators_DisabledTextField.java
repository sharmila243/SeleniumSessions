package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_DisabledTextField {
	
	static WebDriver driver;

	public static void main(String[] args) {
			
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");

		
		//ElementNotInteractableException: element not interactable
		By diabled_pwd = By.id("pass");
//		driver.findElement(diabled_id).sendKeys("Sharmila@123");
		
		boolean flag = driver.findElement(diabled_pwd).isEnabled();
		System.out.println(flag);
		
		boolean flag1 = driver.findElement(diabled_pwd).isDisplayed();
		System.out.println(flag1);
		
		
		//the password text field is disabled and we're trying to fetch the placeholder value of the disabled text field 
			//It is returning true for disabled text field  - Yes, Disabled property is true 
		String disabled_val = driver.findElement(diabled_pwd).getAttribute("disabled");
		System.out.println(disabled_val);
		
		
		driver.quit();
		
		
	}
	
	
	public static boolean checkElementIsDisabled(By locator) {
//		boolean flag = getElement(locator).isEnabled(); 
//			if(flag == true) {
//				System.out.println("Element is not disabled");
//				return true;
//			}else {
//				System.out.println("Element is disabled");
//				return false;
//			}
		
		String disabled_val = getElement(locator).getAttribute("disabled");
			if(disabled_val.equals("true")) {
				return true;
			}else {
				return false;
			}
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
