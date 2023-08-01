package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchElementExceptionConcept {


	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By forgotPassword = By.linkText("Forgotten Password00"); 
																 
//		driver.findElement(forgotPassword).click();//NoSuchElementExceptionConcept - if the locator here is different from DOM or not found	
													//Instead of handling it does not help or solve the problem
													//we have to fix it 
													//WebElement is throwing the exception 
		try {
			driver.findElement(forgotPassword).click();
		}catch(NoSuchElementException e) {
			System.out.println("Check the locator again");
			e.printStackTrace();
		}
		//I can go to ElementUtil and add a check, if the locator is passed wrong, throw the exception
		
		
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
