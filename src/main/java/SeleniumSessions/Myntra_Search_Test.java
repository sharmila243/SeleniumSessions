package SeleniumSessions;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_Search_Test {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.myntra.com");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@placeholder = 'Search for products, brands and more']")).sendKeys("Biba");
		
		Thread.sleep(2000);
		
		
		List<WebElement> suggList = driver.findElements(By.xpath("//a[@class = 'desktop-submit']//following-sibling::div//ul//li"));
		System.out.println(suggList.size());
		
		for(WebElement e: suggList) {
			String text = e.getText();
			System.out.println(text);
				if(text.contains("Sarees")) {
					e.click();
					break;
				}
		}
		
		driver.quit();

	}

}
