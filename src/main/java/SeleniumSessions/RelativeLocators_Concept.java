package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;
		//with() is a method - it's a static method 
		//how to call static method - using class name 
		//what's class name - Relative locator
		//who's providing relative locator - Selenium 
		
		//If I want to use with() method in my code 10 times, i need to write RelativeLocator.with() - 10 times
		//instead of that we're importing that method with static keyword 
		//now we can use directly using with() we need not use Class name

public class RelativeLocators_Concept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.aqi.in/in/dashboard/Canada");
		
		WebElement baseElement = driver.findElement(By.linkText("Windsor, Canada"));
		
		//Right of the baseElement 
		String rightToBaseElement = driver.findElement(with(By.tagName("p")).toRightOf(baseElement)).getText();
		System.out.println(rightToBaseElement);
		
		
		//Left of the baseElement
		String leftToBaseElement = driver.findElement(with(By.tagName("p")).toLeftOf(baseElement)).getText();
		System.out.println(leftToBaseElement);

		//Above of the baseELement
		String aboveBaseElement = driver.findElement(with(By.tagName("p")).above(baseElement)).getText();
		System.out.println(aboveBaseElement);
		
		//Above of the baseELement
		String belowBaseElement = driver.findElement(with(By.tagName("p")).below(baseElement)).getText();
		System.out.println(belowBaseElement);
		
		
		//Near - Not accurate or cannot define which element is the nearest 
			// - Default distance is 100 pixels
			// - near() is an overloaded method - 
				//1. near() - in which we directly pass the webElement (baseElement) - default distance is 100 pixels
				//2. near(webElement, int atmostDistance) - we can also pass the distance of our own to get the nearest webElement
		String nearElement = driver.findElement(with(By.tagName("p")).near(baseElement)).getText();
		System.out.println(nearElement);
		
				
		
		driver.quit();
	}

}
