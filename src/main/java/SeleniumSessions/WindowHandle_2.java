package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle_2 {

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
		
		//we now have 5 browsers - and driver is on the parent window	
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		while(it.hasNext()) {
			String windowID = it.next();
			driver.switchTo().window(windowID);
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			
				if(!windowID.equals(parentWindowID)) {
					driver.close();
				}
				
				System.out.println("---------");
		}
		
		driver.switchTo().window(parentWindowID);
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
