package SeleniumSessions;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarouselConcept_1 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		
		Thread.sleep(20000);
		
		List<WebElement> bestSellers = driver.findElements(By.xpath("//img[contains(@src, 'Bestsellers')]"));
		By slick_btn = By.xpath("//img[contains(@src, 'Bestsellers')]//ancestor::div[@class = 'slick-track']/../following-sibling::button");
		
		
		System.out.println(bestSellers.size());
		
		Thread.sleep(5000);
		
		Set<String> list = new LinkedHashSet<String>();
		
		while(!driver.findElement(slick_btn).getAttribute("class").contains("slick-disabled")) {
			
			for(WebElement e: bestSellers) {
				String text = e.getAttribute("src");
				list.add(text);
			}
			driver.findElement(slick_btn).click();
		}
		
		for(String e: list) {
			System.out.println(e);
		}
		
		driver.quit();
		
	}

}
