 package SeleniumSessions;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarouselConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.noon.com/uae-en/");

		Thread.sleep(20000);

		List<WebElement> recForU = driver.findElements(By.xpath(
				"//h2[text() = 'Recommended for you']/../../following-sibling::div//div[@data-qa = 'product-name']"));
		By slide = By.xpath(
				"//h2[text() = 'Recommended for you']/../../following-sibling::div//div[contains(@class, 'swiper-button-next')]");

		Thread.sleep(10000);

		Set<String> list = new LinkedHashSet<String>();

		while (!driver.findElement(slide).getAttribute("class").contains("swiper-button-disabled")) {

			for (int i = 0; i < recForU.size(); i++) {
				String text = recForU.get(i).getAttribute("title");
				
				list.add(text);
			}

			System.out.println("--------");
			driver.findElement(slide).click();
		}
		
		for(String e: list) {
			System.out.println(e);
		}

		driver.quit();
	}

}
