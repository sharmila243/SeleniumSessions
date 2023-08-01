package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

public class RelativeLocators_1 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		WebElement baseElement = driver.findElement(By.linkText("Joe.Root"));
		
		List<WebElement> rightOfBaseElement = driver.findElements(with(By.xpath("//a[text() = 'Joe.Root']/parent::td/following-sibling::td")).toRightOf(baseElement));
		for(WebElement e: rightOfBaseElement) {
			String text = e.getText();
			System.out.println(text);
		}
		
		
		String aboveElement = driver.findElement(with(By.tagName("a")).above(baseElement)).getText();
		System.out.println(aboveElement);
		
		
		String belowElement = driver.findElement(with(By.tagName("a")).below(baseElement)).getText();
		System.out.println(belowElement);
		
		Thread.sleep(2000);
		
		driver.findElement(with(By.xpath("//a[text() = 'Joe.Root']/parent::td/preceding-sibling::td//input[@type = 'checkbox']")).toLeftOf(baseElement)).click();
		
		
		String nearElement = driver.findElement(with(By.tagName("a")).near(baseElement)).getText();
		System.out.println(nearElement);
		
		
		
		driver.quit();
		
	}

}
