package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_TextField {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By textField = By.tagName("input");
		List<WebElement> input_textField = driver.findElements(textField);
		
		System.out.println(input_textField.size());
		
		for(WebElement e: input_textField) {
			String type = e.getAttribute("type");
			String name = e.getAttribute("name");
			
			System.out.println(type +" : "+ name);
			
		}
		
		driver.quit();
		
		
	}

}
