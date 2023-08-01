package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsUtil {

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		By links = By.tagName("a");	
		By images = By.tagName("img");
		By href = By.tagName("a");


//		List<WebElement> linksList = driver.findElements(links);
//		List<WebElement> imagesList = driver.findElements(images);
//		List<WebElement> hrefList = driver.findElements(href);

		System.out.println(getElementsCount(links));
		System.out.println(getElementsCount(images));
		System.out.println(getElementsCount(href));
		
		
		List<String> actEleTextList = getElementsTextList(links);
		System.out.println(actEleTextList);
		
		System.out.println("----------");
		
		if(actEleTextList.contains("Top deal")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		System.out.println("**********");
		
		
		driver.quit();
	
	}
	
	public static List<String> getElementsTextList(By locator) { //not applicable for images
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
			for(WebElement e: eleList) {
				String text = e.getText();
				if(!text.isEmpty()) {
					eleTextList.add(text);	
				}
			}
			return eleTextList;
			//we're returning this because we can validate it
	}
	
	
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	

}
