package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_ElementText {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By regHeader = By.tagName("h1");
//		By forgotPassword = By.linkText("Forgotten Password");
		
//		System.out.println(doElementGetText(regHeader));
//		System.out.println(doElementGetText(forgotPassword));
		
		//we can use this for validation purpose also
//		boolean flag = driver.findElement(regHeader).isDisplayed();
//		boolean flag_1 = driver.findElement(forgotPassword).isDisplayed();
//		
//		System.out.println(flag);
//		System.out.println(flag_1);
		
		if(checkElementIsDisplayed(regHeader)) {
			System.out.println("Yeah, header is displayed");
			String header = doElementGetText(regHeader);
			System.out.println(header);
				if(header.equals("Register Account")) {
					System.out.println("PASS");
				}else {
					System.out.println("FAIL");
				}
		}
		
		driver.quit();
		
	}
	
	
	public static boolean checkElementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	
	public static String doElementGetText(By locator) {
		String eleText = getElement(locator).getText();
		System.out.println("Element text is: " + eleText);
		return eleText;
	}
	
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
