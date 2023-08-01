package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVG_Flipkart_Example {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@title = 'Search for products, brands and more']")).sendKeys("Women Dresses");
		
		Actions action = new Actions(driver);
		WebElement searchElement = driver.findElement(By.xpath("//*[local-name() = 'svg']/*[name() = 'g' and @fill-rule = 'evenodd'] "));
		action.moveToElement(searchElement).click().build().perform();
		
//		//if direct click() is giving an exception
//			//try it using actions class 
//		driver.findElement(By.xpath("//*[local-name() = 'svg']/*[name() = 'g' and @fill-rule = 'evenodd'] ")).click();
		
		Thread.sleep(4000);
		driver.quit();
		

	}

}
