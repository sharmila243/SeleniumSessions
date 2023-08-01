package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_DrawBorder_Frames {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		Thread.sleep(3000);

		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		
		
		List<WebElement> framesList = driver.findElements(By.xpath("//frame[contains(@src, '.html')]"));
		System.out.println(framesList.size());
		
		for(WebElement e: framesList) {
			Thread.sleep(3000);
			
			driver.switchTo().frame(e);
			
			WebElement border = driver.findElement(By.xpath("//body"));
			jsUtil.drawBorder(border);
			
			driver.switchTo().defaultContent();

		}
		
		driver.quit();
	
	}

}
