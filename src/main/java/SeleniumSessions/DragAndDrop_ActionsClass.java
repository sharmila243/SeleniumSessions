package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_ActionsClass {
	
	//Drag and Drop can happen only from WebElement to WebElement
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement soruceEle = driver.findElement(By.cssSelector("div#draggable"));
		WebElement targetEle = driver.findElement(By.cssSelector("div#droppable"));
		
		Actions action = new Actions(driver);
		
		//BuilderPattern
//		action
//			.clickAndHold(soruceEle)
//				.moveToElement(targetEle)
//					.release()
//						.build().perform();
		
		
		action.dragAndDrop(soruceEle, targetEle).perform();
		
		
		Thread.sleep(1000);
		driver.quit();
		
	}

}
