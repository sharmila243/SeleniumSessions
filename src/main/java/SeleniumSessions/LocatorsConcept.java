package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
			
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//Create a webElement + perform action on it (getText, sendKeys(), click(), isDisplayed())
		
		//Inspect the page - Element section is called DOM (Document Object Model)
		//<> - html tag
		//Attribute always comes in the form of value and key pair
		//<input> - html Tag - attribute and attribute value in the form (Value, key) Pair
				//type = "text", name = "email", value placeholder = "E-mail Address" (here value attribute has no value, Placeholder - value, E-mail Address - key) etc
		//<img> - html tag for image
		//<a> - html tag for Link
		//<h2> - has no attributes for simple plain text, no value and key pairs
		//<p> - html tag for paragraph
		//Text of the Element - is something which is not in the form of value and key pair
		
		
		//1. 
//		driver.findElement(By.id("input-email")).sendKeys("sharmila24@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("Sharmila24");
		
		
		//2. 
//		WebElement email_id = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		email_id.sendKeys("sharmila03@gmail.com");
//		password.sendKeys("Sharmila03");
		
		
		//3. By Locator
//		By email_id = By.id("input-email"); //we're not hitting the server, we hit the Server only and only for a driver specific  
//		By password = By.id("input-password");
//		
//		WebElement emailId = driver.findElement(email_id);
//		WebElement passId = driver.findElement(password);
//		
//		emailId.sendKeys("guddu24@gmail.com");
//		passId.sendKeys("Guddu@24");
		
		
		//4. By locator with webElement Generic method	
//		By email_id = By.id("input-email"); 
//		By password = By.id("input-password");
//		
//		getElement(email_id).sendKeys("guddu03@gmail.com");
//		getElement(password).sendKeys("Guddu@03");
		
		
		//5. By locator with WebElement and Action Generic method
//		By email_id = By.id("input-email"); 
//		By password = By.id("input-password");
//		
//		doSendkeys(email_id, "sai17@gmail.com");
//		doSendkeys(password, "Sai@17");
		
		
		//6. By locator with WebElement and Action Generic method in ElementUtil Class
				//Create a Utility class and mention all the methods there so that anybody can use them and 
				//can also be used for any application to perform the sendKeys
		By email_id = By.id("input-email"); 
		By password = By.id("input-password");
		
		ElementUtil eleUtil = new ElementUtil(driver); //chromeDriver in the same class is supplied here
			//driver --> constructor in ElementUtil --> which initializes the Global variable
		eleUtil.doSendkeys(email_id, "Sai08@gmail.com");
		eleUtil.doSendkeys(password, "Sai@08");
		
		//7. By locator with WebElement and Action Generic method in ElementUtil Class
				//with a test/caller class with BrowserUtil and ElementUtil
		
	}
	
	public static void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);;
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	

}
