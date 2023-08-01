package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_TotalLinksConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		//open any url
		//get the count of links on the page 
		//print the text of each link on the console
		//but ignore blank text	
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		By links = By.tagName("a");
		
		//we cannot perform any action on driver.findElements
		List<WebElement> linksList = driver.findElements(links);
		
		//List - parent interface of Array and ArrayList
			// - maintains the order in the basis of index - 0,1,2,3,4... 
			// - VC = 10
			// - return type of findElements is List<WebElement> - it is pre-defined- not any other List<String>
			// - List - dynamic in nature
		
		System.out.println("Total no. of links on the page: " + linksList.size());
		
		//print the text using index based loop:
				//all the empty/blank spaces in the console are the links with no text 
//		for(int i = 0; i<linksList.size(); i++) {
//			String text = linksList.get(i).getText();
//			
//				if(!text.isEmpty()) {
//					System.out.println(i +" : "+text);	
//				}
//		}
		
		//print the text using for each loop
		int count = 0;
		for(WebElement e: linksList) {
			String text = e.getText();
			
				if(!text.isEmpty()) {
					System.out.println(count +" : "+ text);
				}
				count++;
		}
		
		driver.quit();
		
	}

}
