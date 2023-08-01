package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_GetTextFieldValue {
		
	static WebDriver driver;

	public static void main(String[] args) {
			
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			
		//After entering the value in the text Field - for examplem, *First Name - Sharmila 
			//how to fetch/get the value entered in a text field? 
			//The value entered will not be visible in DOM, in order to fetch it, it actually stores in value in Value PlaceHolder 
			//getText will not work for fetching the value that I entered - using this will not return even space  
			//Use getAttribute
			
		By fn = By.id("input-firstname");
		
		driver.findElement(fn).sendKeys("SharmilaBhargav");
		
		String fn_val = driver.findElement(fn).getText();
		System.out.println(fn_val);
		System.out.println(fn_val.length());
		
		String fn_value = driver.findElement(fn).getAttribute("value");
		System.out.println(fn_value);
			
		driver.quit();
		
		
	}

}
