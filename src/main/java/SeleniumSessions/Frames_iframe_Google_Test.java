package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_iframe_Google_Test {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.findElement(By.xpath("//a[@aria-label = 'Google apps']")).click();
		
		driver.switchTo().frame("app");
		
		Thread.sleep(1000);
		
		List<WebElement> googleAppsList = driver.findElements(By.xpath("//div[@aria-label = 'Google apps']//li//span[@class = 'Rq5Gcb']"));
		for(WebElement e: googleAppsList) {
			String app = e.getText();
			System.out.println(app);
				if(app.equals("Hangouts")) {
					e.click();
					break;
				}
		}
		
		driver.quit();
		
	}

}
