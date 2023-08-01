package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement_Concept_ActionsClass_MYNTRA_1 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.myntra.com");
		
		WebElement element = driver.findElement(By.xpath("//span[text() = 'Profile']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(element).build().perform();
		
		Thread.sleep(2000);
		
		List<WebElement> subMenuElements = driver.findElements(By.xpath("//span[@class = 'desktop-userTitle']//parent::div//following-sibling::div//div[contains(@class, 'desktop-')]"));
		
		System.out.println(subMenuElements.size());
		
		for(WebElement e: subMenuElements) {
			String text = e.getText();
			System.out.println(text);
		}
		
		driver.quit();
	}

}
