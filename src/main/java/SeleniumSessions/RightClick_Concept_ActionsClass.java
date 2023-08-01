package SeleniumSessions;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_Concept_ActionsClass {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		By contextMenuLocator = By.cssSelector("span.context-menu-one.btn.btn-neutral");
		
//		WebElement rightClickEle = driver.findElement(By.cssSelector("span.context-menu-one.btn.btn-neutral"));
		
//		Actions action = new Actions(driver);
//		action.contextClick(rightClickEle).perform(); //Context-click for right click
//		
//		List<WebElement> optionsList = driver.findElements(By.cssSelector("ul.context-menu-list.context-menu-root span"));
//
//		for(WebElement e: optionsList) {
//			String text = e.getText();
//			System.out.println(text);
//				if(text.equals("Paste")) {
//					e.click();
//					break;
//				}
//		}
		
		
		selectRightClickOption(contextMenuLocator, "Quit");
		
		
		driver.quit();
		
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	public static void selectRightClickOption(By contextMenuLocator, String optionValueToClick) {
		Actions action = new Actions(driver);
		action.contextClick(getElement(contextMenuLocator)).perform();
		
		By optionLocator = By.xpath("//*[text() = '"+optionValueToClick+"']"); 
				//today I'm clicking on paste tomorrow i want to click on some other option so maintain it dynamically
				//html tag <span> is also not dynamic because for some other application html tag can be <div>, <a> etc so replace span with *
		getElement(optionLocator).click();
	}
	
	
	

}
