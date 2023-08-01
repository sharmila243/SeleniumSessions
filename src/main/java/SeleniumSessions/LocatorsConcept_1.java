package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept_1 { //different Locators
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			
		//1. ID (Attribute)- unique locator
				//element 1 - naveen 
				//element 2 - selenium
//		driver.findElement(By.id("naveen")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("selenium")).sendKeys("naveen@gmail.com");
		
		
		//2. Name (Attribute)- It can be Duplicate or Unique, 99% will be unique
				//If we have multiple elements with same name, selenium always returns with the first element found, we can never get the second one
				//element 1 - naveen 
				//element 2 - naveen
//		driver.findElement(By.name("naveen")).sendKeys("naveen@gmail.com");
		
		
		//3. ClassName (Attribute)- can be duplicate and most of the time it is duplicate
				//class = "form-control" - Look and feel of that particular element that is why it stays same for all the webElements
				//class = "form-control input-lg" - 2 class names - all the classes are space separated
//		driver.findElement(By.className("form-control")).sendKeys("naveen"); //enters the value as soon as it found the class name, entered the value in the search bar
				//not a good practice to use className, as it is not unique
		
		
		//4. Xpath (Not an Attribute, it's an address of an element in HTML DOM)- right click and copy the x path
//		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Bhargav");
//		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Sai");
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("saibhargav@gmail.com");
//		
//		driver.findElement(By.name("agree")).click();
//		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
		
		
//		By fn_xpath = By.xpath("//*[@id=\"input-firstname\"]");
//		By ln_xpath = By.xpath("//*[@id=\"input-lastname\"]");
//		By email_xpath = By.xpath("//*[@id=\"input-email\"]");
//		
//		By privacyPolicy_xpath = By.name("agree");
//		By continue_xpath = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
//		
//		doSendkeys(fn_xpath, "SharmilaBhargav");
//		doSendkeys(ln_xpath, "BashakarlaK");
//		doSendkeys(email_xpath, "sharmilasai@gmail.com");
//		
//		doClick(privacyPolicy_xpath);
//		doClick(continue_xpath);
		
		
		//5. CSS Selector (Not an Attribute, its not the address of the element it is based on the css properties)	
//		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("Veda");
//		driver.findElement(By.cssSelector("#input-telephone")).sendKeys("9398629755");
//		
//		driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary")).click();
		
//		By fn = By.cssSelector("#input-firstname");
//		By ln = By.cssSelector("#input-lastname");
//		By pn = By.cssSelector("#input-telephone");
//		
//		By check = By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)");
//		By cntue = By.cssSelector("#content > form > div > div > input.btn.btn-primary");
//		
//		doSendkeys(fn, "DimSu");
//		doSendkeys(ln, "Bash");
//		doSendkeys(pn, "999999999");
//		
//		doClick(check);
//		doClick(cntue);
		
		
		//6. linkText - applicable only and only for links, with the text of the link - could be duplicate also
				//html tag - <a> - anchor tag
				//attributes - href (HyperTextReferenceValue), src,
				//linkText 
//		driver.findElement(By.linkText("Terms & Conditions")).click();
		
//		By tc_link = By.linkText("Terms & Conditions");
//		
//		doClick(tc_link);
		
		
		//7. partialLinkText - only for links, with the partial text of the link
//		driver.findElement(By.partialLinkText("Forgotten")).click();
				//forgotten userName and forgotten password - which ever comes first clicks that - that might be a problem

		
		//8. TAGNAME - HTML tag - not an attribute
//		driver.findElement(By.tagName("input")).sendKeys("SAI");
		String header = driver.findElement(By.tagName("h1")).getText();
		System.out.println(header);
		
	}
	
	
	public static void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	

}
