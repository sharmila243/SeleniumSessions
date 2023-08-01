package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement_Concept_ActionsClass { //TwoLevelMenuHandling
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("http://mrbool.com");
	
//		WebElement parentMenu = driver.findElement(By.className("menulink"));
//		Actions action = new Actions(driver);
		
//		action.moveToElement(parentMenu);
//		action.moveToElement(parentMenu).build();
		
//		action.moveToElement(parentMenu).perform();
//		action.moveToElement(parentMenu).build().perform();
		
		Thread.sleep(1000);
		
//		driver.findElement(By.linkText("ARTICLES")).click(); //working only with capital letters as written in the UI
//		driver.findElement(By.xpath("//a[contains(text(), 'Articles')]")).click(); //with ARTICLES as capital letters - NOSUCHELEMENTFOUND Exception
		
		
		By parentMenu = By.className("menulink");
		By childMenu = By.linkText("COURSES");
		
		twoLevelMenuHandling(parentMenu, childMenu);
		
		driver.quit();
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void twoLevelMenuHandling(By level1MenuLocator, By level2MenuLocator) throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(getElement(level1MenuLocator)).perform();
		
		Thread.sleep(1000);
		
		getElement(level2MenuLocator).click();
	}

}
