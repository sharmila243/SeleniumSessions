package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasket_ListOfMenuAndSubMenu {

		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			
			driver = new ChromeDriver();
			driver.get("https://www.bigbasket.com/");
			
			WebElement mainMenuLocator = driver.findElement(By.xpath("//a[@qa = 'categoryDD']"));
			Actions action = new Actions(driver);
			action.moveToElement(mainMenuLocator).build().perform();
			
			Thread.sleep(2000);
			List<WebElement> level1List = driver.findElements(By.xpath("//ul[@id = 'navBarMegaNav']//li"));
			for(WebElement e: level1List) {
				action.moveToElement(e).build().perform();
				String text = e.getText();
				System.out.println(text);
				
				System.out.println("--------");
				Thread.sleep(2000);
				
				
				List<WebElement> level2List = driver.findElements(By.xpath("//ul[@id = 'navBarMegaNav']//following-sibling::div//a[@qa = 'catL2']"));
				for(WebElement e2: level2List) {
					action.moveToElement(e2).build().perform();
					String text2 = e2.getText();
					System.out.println("Level - 2: " + text2);
					
					System.out.println("--------");
					Thread.sleep(2000);
					
					List<WebElement> level3List = driver.findElements(By.xpath("//ul[@id = 'navBarMegaNav']//following-sibling::div//a[@qa = 'catL3']"));
					for(WebElement e3: level3List) {
						String text3 = e3.getText();
						System.out.println("Level 3 List: " + text3);
					
					}
					Thread.sleep(1000);
				}
				
			}
			
			driver.quit();
			
			}
			
	}

