package Practice_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.easemytrip.com/");
		
		By header = By.cssSelector("div._wid30  div._news_container div.newsbox > div + div");
		
		List<WebElement> elements = driver.findElements(header);
		
		for(WebElement e: elements) {
			String text = e.getText();
			System.out.println(text);
		}
		
		driver.quit();
	}

}
