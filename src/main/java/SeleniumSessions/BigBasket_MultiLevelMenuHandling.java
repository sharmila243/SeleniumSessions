package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasket_MultiLevelMenuHandling {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		
//		WebElement level1MenuLocator = driver.findElement(By.xpath("//a[@qa = 'categoryDD']"));
//		Actions action = new Actions(driver);
//		action.moveToElement(level1MenuLocator).perform();
//		
//		Thread.sleep(1000);
//		
//		WebElement level2MenuLocator = driver.findElement(By.linkText("Beverages"));
//		action.moveToElement(level2MenuLocator).perform();
//		
//		Thread.sleep(1000);
//		
//		WebElement level3MenuLocator = driver.findElement(By.linkText("Coffee"));
//		action.moveToElement(level3MenuLocator).perform();
//		
//		Thread.sleep(1000);
//		
//		driver.findElement(By.linkText("Instant Coffee")).click();
		
		
		By level1MenuLocator = By.xpath("//a[@qa = 'categoryDD']");
		
		multiLevelMenuHandling(level1MenuLocator, "Beverages", "Coffee", "Instant Coffee");
		
		driver.quit();

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static WebElement getLinkElementByText(String linkText) {
		return driver.findElement(By.linkText(linkText));
	}
	
	public static void multiLevelMenuHandling(By level1MenuLocator, String level2Option, String level3Option, String level4Option) throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(getElement(level1MenuLocator)).build().perform();
		Thread.sleep(1000);
		
		action.moveToElement(getLinkElementByText(level2Option)).build().perform();
		Thread.sleep(1000);
		
		action.moveToElement(getLinkElementByText(level3Option)).build().perform();
		Thread.sleep(1000);
		
		getLinkElementByText(level4Option).click();
		
	}

}
