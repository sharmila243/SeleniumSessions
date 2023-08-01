package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGElementHandle {
	//SVG - Scalar Vector Graphs/Diagrams
	
	//Eg. Flipkart - Search Icon - O\ Circle and a tag --> <path>, <path> --> g --> svg
		//Home icon, heart etc etc
	
	//Normal Xpath does not work for accessing SVG Elements
	//SVG Element - CSS Selector - no support 
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map");
		
		//SVG xpath syntax--> //*[local-name = 'SVG (SVG tagName)' and @attr = 'value'] - parent
				// parent to child - //*[local-name = 'SVG (SVG tagName)' and @attr = 'value']//*[name() = 'g' and @attr = 'value']
					
		Thread.sleep(4000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id, 'map-instance')]")));
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		
		List<WebElement> USStateElements = 
				driver.findElements(By.xpath("//*[local-name() = 'svg' and @id = 'map-svg']//*[name() = 'g' and @id = 'regions']//*[name() = 'path']"));
		System.out.println(USStateElements.size());
		Thread.sleep(1000);
		
		int count = 0;

		
		for(int i = 0; i< USStateElements.size(); i++) {
			WebElement element = USStateElements.get(i);
			
			action.moveToElement(element).build().perform();
			
			Thread.sleep(500);
			String stateName = element.getAttribute("name");
			System.out.println(count +" : "+ stateName);
			
			count++;

			
		}
		
//		int count = 0;
//		for(WebElement e: USStateElements) {
//			action.moveToElement(e).perform();
//			Thread.sleep(500);
//			String stateName = e.getAttribute("name");
//			System.out.println(count +" : "+ stateName);
//			
//					if(stateName.equals("Maryland")) {
//						e.click();
//						break;
//					}
//			count++;
//		}
//		
		
		driver.quit();
		
	}

}
