package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle_6 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //w1
		
		String parentWindowID = driver.getWindowHandle();
		
		Thread.sleep(3000);
		
		WebElement twitterLink = driver.findElement(By.xpath("//a[contains(@href, 'twitter')]"));
		WebElement fbLink = driver.findElement(By.xpath("//a[contains(@href, 'facebook')]"));
		WebElement yTLink = driver.findElement(By.xpath("//a[contains(@href, 'youtube')]"));
		WebElement lILink = driver.findElement(By.xpath("//a[contains(@href, 'linkedin')]"));
		
		twitterLink.click();
		fbLink.click();
		yTLink.click();
		lILink.click();
		
		Set<String> handles = driver.getWindowHandles();
		List<String> handlesList = new ArrayList<String>(handles);
		System.out.println(handlesList.size());
		
		for(int i = 0; i<handlesList.size(); i++) {
			Thread.sleep(3000);
			String windowId = handlesList.get(i);
			
				if(!windowId.equals(parentWindowID)) {
					
					Thread.sleep(3000);
					driver.switchTo().window(windowId);
					System.out.println(driver.getTitle());
					System.out.println(driver.getCurrentUrl());
					
					driver.close();
				}
		}
		
		Thread.sleep(3000);
		driver.switchTo().window(parentWindowID);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
	}
	

}
