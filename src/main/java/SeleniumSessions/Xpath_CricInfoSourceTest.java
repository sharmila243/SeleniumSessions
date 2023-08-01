package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_CricInfoSourceTest {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/afghanistan-in-sri-lanka-2023-1376998/sri-lanka-vs-afghanistan-3rd-odi-1377010/full-scorecard");
		
		By WTaker = By.xpath("//span[text() = 'Ibrahim Zadran']//ancestor::td//following-sibling::td//span");
		By scoreCard = By.xpath("//span[text() = 'Ibrahim Zadran']/ancestor::td/following-sibling::td[contains(@class, 'ds-text-right')]");
		
		String WTakerName = driver.findElement(WTaker).getText();
		System.out.println(WTakerName);
		
		
		List<WebElement> score = driver.findElements(scoreCard);
		List<String> scrCard = new ArrayList<String>();
		
		for(WebElement e: score) {
			String text = e.getText();
			scrCard.add(text);
			
		}
		
		System.out.println(scrCard);
	}

}
