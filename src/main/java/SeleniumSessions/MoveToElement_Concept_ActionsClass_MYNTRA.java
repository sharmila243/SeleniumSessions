package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement_Concept_ActionsClass_MYNTRA {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
//		WebElement cat = driver.findElement(By.xpath("//a[contains(text(), 'Women')]"));
//		Actions action = new Actions(driver);
//		
//		action.moveToElement(cat).build().perform();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//a[contains(text(), 'Earrings')]")).click();
		
		
		By womensCat = By.xpath("//a[contains(text(), 'Women')]");
		
		ChoseAnyFromWomensCategory(womensCat, "Earrings");
		
		driver.quit();
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void ChoseAnyFromWomensCategory(By locator, String optionToClick) throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(getElement(locator)).perform();
		
		Thread.sleep(1000);
		
		By optionsLocator = By.xpath("//a[contains(text(), '"+optionToClick+"')]");
		getElement(optionsLocator).click();
		
	}
}
