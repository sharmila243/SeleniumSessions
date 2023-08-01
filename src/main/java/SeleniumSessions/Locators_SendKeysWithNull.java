package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_SendKeysWithNull {
	
	static WebDriver driver;

	public static void main(String[] args) {
			
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		By fn = By.id("input-firstname");
		
		
//		driver.findElement(fn).sendKeys("null"); //normal string in double quotes
		
		//IllegalArgumentException - Keys to send should be a not null CharSequence
			//Selenium does not accept null in sendKeys - so I can improve my ElementUtil   
//		driver.findElement(fn).sendKeys(null); //It does not enter anything 
			//Type null of the last argument to method sendKeys(CharSequence...) doesn't exactly match the vararg parameter type. 
			//Cast to CharSequence[] to confirm the non-varargs invocation, or 
			//pass individual arguments of type CharSequence for a varargs invocation.
		
//		driver.findElement(fn).sendKeys(""); //did not enter anything - right use case
		
//		driver.findElement(fn).sendKeys(" "); 
		
		//SendKeys(charSequence ) - CharacterSequence is an interface in Java 
										//String, StringBuffer, StringBuilder - child of CharacterSequence interface
		String str = "Sharmila";
		StringBuilder sb = new StringBuilder("Sai");
		StringBuffer sf = new StringBuffer("Bhargav");
		
//		driver.findElement(fn).sendKeys(str, sb, sf); //appending multiple since it is a charSequence
		driver.findElement(fn).sendKeys(str +" "+ sb +" "+ sf);
		String value = driver.findElement(fn).getAttribute("value");
		System.out.println(value);
			
		driver.quit();
		
		
	}	
}
